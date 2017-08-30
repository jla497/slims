/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.controller;

import ca.ubc.icapture.genapha.slims.dao.TblgenetypesRepository;
import ca.ubc.icapture.genapha.slims.dao.TblphenotypeslookupRepository;
import ca.ubc.icapture.genapha.slims.json.ContainerDTO;
import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.SampleDTO;
import ca.ubc.icapture.genapha.slims.json.SubjectDTO;
import ca.ubc.icapture.genapha.slims.json.searchRequestWrapper;
import ca.ubc.icapture.genapha.slims.json.searchRequestWrapper.*;
import ca.ubc.icapture.genapha.slims.model.QTblgene;
import ca.ubc.icapture.genapha.slims.model.QTblphenotypelookup;
import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import ca.ubc.icapture.genapha.slims.model.Tblcontainertypes;
import ca.ubc.icapture.genapha.slims.model.Tblethnicitylookup;
import ca.ubc.icapture.genapha.slims.model.Tblfreezers;
import ca.ubc.icapture.genapha.slims.model.Tblgene;
import ca.ubc.icapture.genapha.slims.model.Tblmaterialtype;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypelookup;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblsampletypes;
import ca.ubc.icapture.genapha.slims.model.Tblshippedto;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import ca.ubc.icapture.genapha.slims.service.CohortSearchService;
import ca.ubc.icapture.genapha.slims.service.ContainerTypeSearchService;
import ca.ubc.icapture.genapha.slims.service.ContainersSearchService;
import ca.ubc.icapture.genapha.slims.service.EthnicitySearchService;
import ca.ubc.icapture.genapha.slims.service.FreezerTypeSearchService;
import ca.ubc.icapture.genapha.slims.service.MaterialTypeSearchService;
import ca.ubc.icapture.genapha.slims.service.PhenotypesSearchService;
import ca.ubc.icapture.genapha.slims.service.SampleSearchService;
import ca.ubc.icapture.genapha.slims.service.SampleTypeSearchService;
import ca.ubc.icapture.genapha.slims.service.ShippedtoTypeSearchService;
import ca.ubc.icapture.genapha.slims.service.SubjectSearchService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author JLee05
 */
@Controller
@RequestMapping("/search")
public class SearchController {
    final Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    private PhenotypesSearchService phenotypeSearchSvc;
    
    @Autowired
    private ContainersSearchService tblcontainersSvc;
    
    @Autowired
    private SubjectSearchService tblsubjectSvc;
    
    @Autowired
    private SampleSearchService sampleSearchSvc;
    
    @Autowired
    private CohortSearchService cohortSearchSvc;
    
    @Autowired
    private EthnicitySearchService ethnicitySearchSvc;
    
    @Autowired
    private ContainerTypeSearchService containertypeSearchSvc;
    
    @Autowired
    private FreezerTypeSearchService freezertypeSearchSvc;
    
    @Autowired
    private ShippedtoTypeSearchService shiptotypeSearchSvc;
    
    @Autowired
    private MaterialTypeSearchService materialtypeSearchSvc;
    
    @Autowired
    private SampleTypeSearchService sampletypeSearchSvc;
    
    @Autowired 
    private TblgenetypesRepository geneRepo;
    
    @Autowired
     private TblphenotypeslookupRepository phenoRepo;
    
     @RequestMapping("/field/{field}")
    public @ResponseBody String searchShipToTypes(Model model, @PathVariable("field") String field) {
     
        List<String> types = new ArrayList<String>();
        List<?> resList = null;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Integer> typeMap = new HashMap<String,Integer>();
        typeMap.put("containertypes",1);
        typeMap.put("freezertypes",2);
        typeMap.put("shiptotypes",3);
        typeMap.put("cohorttypes",4);
        typeMap.put("ethnicitytypes",5);
        typeMap.put("materialtypes",6);
        typeMap.put("sampletypes",7);
        typeMap.put("genetypes",8);
        typeMap.put("phenotypes",9);
       switch(typeMap.get(field)){
       
           case 1:
               
                resList = Lists.newArrayList(containertypeSearchSvc.findBySearchTerm(null));
      
                if(resList != null){
                  
                 for(Object s : resList){
                     Tblcontainertypes c = (Tblcontainertypes) s;
                    //logger.info(c.getDescription());

                    types.add(c.getDescription());
                }
               }
               
               break;
           case 2:
               
               resList = Lists.newArrayList(freezertypeSearchSvc.findBySearchTerm(null));
       
               if(resList != null){
                 for(Object o : resList){
                     Tblfreezers f = (Tblfreezers) o;
                   // logger.info(f.getDescription());

                    types.add(f.getDescription());
                }
               }
               
               break;
           case 3:
               resList = Lists.newArrayList(shiptotypeSearchSvc.findBySearchTerm(null));
               
               if(resList != null){
                 for(Object o : resList){
                     Tblshippedto s = (Tblshippedto) o;
                    //logger.info(s.getDescription());
            
                    types.add(s.getDescription());
                }
               }
               break;
               
           case 4:
                List<Tblcohortlookup> cohorts = Lists.newArrayList(cohortSearchSvc.findBySearchTerm(null));
                if(cohorts != null){
                    for(Tblcohortlookup s : cohorts){
                      // logger.info(s.getName());

                       types.add(s.getName());
                    }
                }
               break;
           
           case 5:
              List<Tblethnicitylookup> ethnicities = Lists.newArrayList(ethnicitySearchSvc.findBySearchTerm(null));
              
              if(ethnicities != null){
                for(Tblethnicitylookup e : ethnicities){
                   //logger.info(e.getEthnicity());

                   types.add(e.getEthnicity());
               }
              }
               break;
               
           case 6:
               List<Tblmaterialtype> materials = Lists.newArrayList(materialtypeSearchSvc.findBySearchTerm(null)); 
               
               if(materials != null){
                for(Tblmaterialtype e : materials){
                   //logger.info(e.getDescription());

                   types.add(e.getDescription());
               }
              }
               
               break;
               
           case 7:
               List<Tblsampletypes> samples = Lists.newArrayList(sampletypeSearchSvc.findBySearchTerm(null)); 
               
                if(samples != null){
                for(Tblsampletypes e : samples){
                  // logger.info(e.getDescription());

                   types.add(e.getDescription());
               }
              }
                
               break;
               
            case 8:
               List<Tblgene> genes = Lists.newArrayList(geneRepo.findAll(QTblgene.tblgene.isNotNull())); 
               
                if(genes != null){
                for(Tblgene e : genes){
                  // logger.info(e.getName());

                   types.add(e.getName());
               }
              }
                
               break;  
            case 9:
               List<Tblphenotypelookup> phenotypes = Lists.newArrayList(phenoRepo.findAll(QTblphenotypelookup.tblphenotypelookup.isNotNull())); 
               
                if(phenotypes != null){
                for(Tblphenotypelookup e : phenotypes){
                   //logger.info(e.getName());

                   types.add(e.getName());
               }
              }
                
               break;  
        }
     
        String res;
        
        try{
               objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
               
               res = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(types); 
         
        }catch( JsonProcessingException e){
            e.printStackTrace();
            res = null;
        }
        return res;
     }
    
    
     @RequestMapping("/byid/{field}/{id}")
    public @ResponseBody String searchShipToTypes(Model model, @PathVariable("field") String field, @PathVariable("id") String id) {
        Object obj = new Object();
        List<String> types = new ArrayList<String>();
        List<?> resList = null;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Integer> typeMap = new HashMap<String,Integer>();
        typeMap.put("tblsubject",1);
        typeMap.put("tblcontainercontents",2);
        typeMap.put("tblphenotypes",3);
        typeMap.put("tblcontainercontentses",4);
       
       switch(typeMap.get(field)){
       
           case 1:
               
                obj = tblsubjectSvc.findById(id);
    
           break;
           case 2:
               
               obj = sampleSearchSvc.findContainerContents(id);
               
           break;
           case 3:
                obj = tblsubjectSvc.findTblphenotypesById(id);
           break;
           
           case 4:
                obj = tblcontainersSvc.findContainerContentsById(id);
           break;
           
        }
     
        String res;
        
        try{
               objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
               
               res = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj); 
         
        }catch( JsonProcessingException e){
            e.printStackTrace();
            res = null;
        }
        return res;
     }
    
    
    /**searchRequestWrapper class contains a field called target. This field specifies what final entity objects users wants to search.
     SearchRequestWrapper contains search parameters for Tblsubjects,Tblphenotypes, Tblsamples, and Tblcontainers.
     Search results from previous link is passed on to the next search and both result sets
     are joined to return the intersection of both sets. Search chain is unidirectional.
     Set(phenotypes) => Set(subjects) =>Set(samples) => Set(containers
     * @param params)
     * @return 
     * @throws com.fasterxml.jackson.core.JsonProcessingException*/
    @RequestMapping(value="/search_chain",  method = RequestMethod.POST, produces = { "application/json" }, consumes = MediaType.ALL_VALUE)
    @ResponseStatus(value=HttpStatus.OK)
    public @ResponseBody String searchChain(@RequestBody searchRequestWrapper params) throws JsonProcessingException{
//        ObjectMapper objectMapper = new ObjectMapper();
//        logger.info("starting in searchChain...");
//        
//        logger.info(params);
//        
//        searchRequestWrapper wrapper = null;
//        try{
//         wrapper = objectMapper.readValue(params,searchRequestWrapper.class);
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        String val = null;
        if(params != null)
            val =  startSearching(params);
        else{
            val =  null;
        }
        return val;
    }
    
    private String startSearching(searchRequestWrapper params){
    
       logger.info("starting in searchChain...");
       
       logger.info(params.toString());
       
       String src = params.getSrc();
       
       String target = params.getTarget();
       
       String direction = params.getDirection();
       
       String res = null;
       
        Set<PhenotypeDTO> matchedPhenotypes = new HashSet<PhenotypeDTO>();
       
       Set<SubjectDTO> matchedSubjects = new HashSet<SubjectDTO>();
       
       Set<SampleDTO> matchedSamples = new HashSet<SampleDTO>();
       
       Set<Tblcontainers> matchedContainers = new HashSet<Tblcontainers>();
       
       Set<Tblcontainercontents> matchedContainerContents = new HashSet<Tblcontainercontents>();
       
       Map<String, Integer> srcMap = new HashMap<String,Integer>();
       
       srcMap.put("phenotype",1);
       srcMap.put("subject",2);
       srcMap.put("sample",3);
       srcMap.put("container",4);
       
       
      switch(srcMap.get(src)){
          case 1:
              matchedPhenotypes = searchInPhenotypes(params);
//                logger.info("matchedPhenotypes: ");
//                logger.info(matchedPhenotypes.toString());
              if(target.equalsIgnoreCase("phenotype")){
               
                res = convertToString(matchedPhenotypes);
                  
                  break;
              }
          
          
          case 2:
             
                if(!src.equalsIgnoreCase("subject")){
                    Set<Integer> phenotypesId = new HashSet<Integer>();   
                   
                    Set<SubjectDTO> tmpSubjects = searchInSubjects(params);

                    for(PhenotypeDTO p : matchedPhenotypes){

                        phenotypesId.add(p.getSubjectId());

                    }
                
                for(SubjectDTO subject :tmpSubjects){
                    int thisSubjectId = subject.getSubjectid();

                    if(phenotypesId.contains(thisSubjectId)){

                        matchedSubjects.add(subject);
                    }
                }
              }else{
                
                      matchedSubjects = searchInSubjects(params);

              }
                
              if(target.equalsIgnoreCase("subject")){
                 
//                logger.info("matchedsubjects: ");
//                logger.info(matchedSubjects.toString());
                Set<SubjectDTO> toView = new HashSet<SubjectDTO>();
                for(SubjectDTO s : matchedSubjects){
                    
                    Set<PhenotypeDTO> phenotypeses = new HashSet<PhenotypeDTO>();
               
                    for(PhenotypeDTO p : matchedPhenotypes){
                        
                        if(p.getSubjectId() == s.getSubjectid()){
      
                            phenotypeses.add(p);
                        }
                        
                    }
                    
                   s.setTblphenotypes(s.getSubjectid());
                   
                   toView.add(s);
                }
                
                res = convertToString(toView);
                  
                  break;
              }
              
          case 3: 
              
              if(!src.equalsIgnoreCase("sample")){
                  
               Set<Integer> matchedSubjectIds = new HashSet<Integer>();

               Set<SampleDTO> tmpSamples = searchInSamples(params);

               for(SubjectDTO sub : matchedSubjects){
                   matchedSubjectIds.add(sub.getSubjectid());
               }            

               for(SampleDTO sample : tmpSamples){

                   int thisSampleSubId = sample.getTblsubject();
                   
//                   logger.info("thisSampleSubId: {}",thisSampleSubId);
                  
                   
                   if(matchedSubjectIds.contains(thisSampleSubId)){
                       matchedSamples.add(sample);
                   }
               }
              }else{
                  matchedSamples = searchInSamples(params);
              }
              
             
              
              if(target.equalsIgnoreCase("sample")){

                  res = convertToString(matchedSamples);
                  
                  break;
              }
          
          case 4:
              if(!src.equalsIgnoreCase("container")){
                Set<Long> matchedSampleIds = new HashSet<Long>();

                Set<Tblcontainers> tmpContainers = searchInContainers(params);

                for(SampleDTO sample : matchedSamples){

                    matchedSampleIds.add(sample.getSampleid());
                
                }

                for(Tblcontainers container : tmpContainers){

                     Set<Tblcontainercontents> containercontents = container.getTblcontainercontentses();

                     for(Tblcontainercontents content : containercontents){

                         if(matchedSampleIds.contains(content.getTblsamples().getSampleid())){

                            matchedContainers.add(container);
                         }
                     }  
                }
              }else{
                  matchedContainers = searchInContainers(params);
              }
              
              if(target.equalsIgnoreCase("container")){
                 
                  Set<ContainerDTO> toView = new HashSet<ContainerDTO>();
                  
                  for(Tblcontainers container : matchedContainers){
                     ContainerDTO contDTO = new ContainerDTO(container);
                     
                     toView.add(contDTO);
                 }
                 
                  res = convertToString(toView);
                  
                  break;
              }
              
      } 

        return res; 
    
    }
    
    private Set<PhenotypeDTO> searchInPhenotypes(searchRequestWrapper params){
        logger.info("starting in searchPhenotypes...");

        logger.info(params.getPhenotypeParams().toString());

        return phenotypeSearchSvc.findBySearchTerm(params.getPhenotypeParams());
        
        
    }
    
    private Set<SubjectDTO> searchInSubjects(searchRequestWrapper params){
   
        logger.info("starting in searchSubjects...");

        logger.info(params.getSubjectParams().toString());

       return tblsubjectSvc.findBySearchTerm(params.getSubjectParams());
       
    }
    
    private Set<SampleDTO> searchInSamples(searchRequestWrapper params){
        
        logger.info("starting in searchInsamples...");
        
        List<SampleDTO> samples = sampleSearchSvc.findBySearchTerm(params.getSampleParams());
        
        for(SampleDTO c : samples){
//            logger.info(c.getName());
        }
        
        return Sets.newHashSet(samples);
 
    }
    
    private Set<Tblcontainers> searchInContainers(searchRequestWrapper params){
        
        logger.info("starting in searchInContainers...");
        
        List<Tblcontainers> containers = tblcontainersSvc.findBySearchTerm(params.getContainerParams());
        
        for(Tblcontainers c : containers){
            
            logger.info(c.getTblcontainertypes().getDescription());
        }
         logger.info("done listing containers...");
        return Sets.newHashSet(containers);
 
    }
    
    private String convertToString(Collection<?> collection){
       String res = null;
       ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
       objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Hibernate4Module hbm = new Hibernate4Module();

            objectMapper.registerModule(hbm);
          
            ObjectWriter w = objectMapper.writer();
            
            try {
                res = w.writeValueAsString(collection);
            } catch (Exception e) {
                e.printStackTrace();
            }

                   return res;
    }
    
  @ExceptionHandler(HttpMessageNotReadableException.class)
@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="There was an error processing the request body.")
public void handleMessageNotReadableException(HttpServletRequest request, HttpMessageNotReadableException exception) {
    System.out.println("\nUnable to bind post data sent to: " + request.getRequestURI() + "\nCaught Exception:\n" + exception.getMessage());
}

}
