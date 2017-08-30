/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JLee05
 */

import ca.ubc.icapture.genapha.slims.dao.TblcohortlookupRepository;
import ca.ubc.icapture.genapha.slims.dao.TblcontainercontentsRepository;
import ca.ubc.icapture.genapha.slims.dao.TblsimusersRepository;
import ca.ubc.icapture.genapha.slims.json.PhenotypeDTO;
import ca.ubc.icapture.genapha.slims.json.SampleDTO;
import ca.ubc.icapture.genapha.slims.json.SubjectDTO;
import ca.ubc.icapture.genapha.slims.json.UserPostJson;
import ca.ubc.icapture.genapha.slims.json.containerPostJson;
import ca.ubc.icapture.genapha.slims.json.phenotypePostJson;
import ca.ubc.icapture.genapha.slims.json.samplePostJson;
import ca.ubc.icapture.genapha.slims.json.searchRequestWrapper;
import ca.ubc.icapture.genapha.slims.json.subjectPostJson;
import ca.ubc.icapture.genapha.slims.model.QTblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.QTblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import ca.ubc.icapture.genapha.slims.service.ContainersSearchService;
import ca.ubc.icapture.genapha.slims.service.PhenotypesSearchService;
import ca.ubc.icapture.genapha.slims.service.SampleSearchService;
import ca.ubc.icapture.genapha.slims.service.SimsUsersSearchService;
import ca.ubc.icapture.genapha.slims.service.SubjectSearchService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@ContextConfiguration({"file:src/test/resources/mvc-dispatcher-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ITTest {
      
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
    private SimsUsersSearchService userSearchSvc;
    
    @Autowired
    private TblsimusersRepository userRepo;
    
    
    @Autowired
    private TblcontainercontentsRepository containercontentsRepo;
    
    @Autowired
    private TblcohortlookupRepository cohortRepo;
    
    @Autowired
    private TblcontainercontentsRepository containercontentRepo;


  
    @Test
    public void SubjectSearchSvcGetsCorrectResults(){
        subjectPostJson params = new subjectPostJson();
        
        params.setCohorttype("CAPPS");
        params.setEthnicitytype("Caucasian");
        params.setGender("Male");
        params.setFamilyID("1059");
        Set<SubjectDTO> list = tblsubjectSvc.findBySearchTerm(params);
        
        for(SubjectDTO s : list){
            assertTrue(s.getFamilyid().equalsIgnoreCase("1059"));
            assertTrue(s.getGender() == 1);
            assertTrue(s.getCohorttype().equalsIgnoreCase("CAPPS"));
            assertTrue(s.getEthnicity().equalsIgnoreCase("Caucasian"));
            
        }
    
    }
    
   
    @Test
    public void PhenotypeSearchSvcGetsCorrectSubject(){
        phenotypePostJson params = new phenotypePostJson();
        
        params.setSubjectId("10424");
        
        Set<PhenotypeDTO> list  = phenotypeSearchSvc.findBySearchTerm(params);
        
        for(PhenotypeDTO p : list){
          
            assertTrue(p.getStringSubjectId().equalsIgnoreCase("10424"));
        }
    }
    
    @Test
    public void SampleSearchSvcGetsCorrectResults(){
        samplePostJson params = new samplePostJson();
        
        params.setConcentration("0.01");
        params.setSampletype("Blood");
        params.setMaterialtype("Blood");
        
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
       String dateStr = "1996-01-01";
        Date date = null;
       try{
           
         date = sdf.parse(dateStr);
       
       }catch(Exception e){
           e.printStackTrace();
       }
       
       params.setCollectdate_after(dateStr);
       
       List<SampleDTO> list = sampleSearchSvc.findBySearchTerm(params);
       
       Set<Tblcontainercontents> containercontents = Sets.newHashSet(containercontentRepo.findAll(QTblcontainercontents.tblcontainercontents.tblmaterialtype.description.equalsIgnoreCase("Blood")));
      
       Set<Long> matchedIDs = new HashSet<Long>();
       for(Tblcontainercontents c : containercontents){
           matchedIDs.add(c.getTblsamples().getSampleid());
       }
       
       for(SampleDTO s : list){
           assertTrue(s.getCollectiondate().after(date));
           assertTrue(s.getConcentration() >= 0.01);
           Long id = s.getSampleid();
           assertTrue(matchedIDs.contains(id));
           
       }
    
    }
    
    
    @Test
     public void ContainerSearchSvcGetsCorrectDates(){
     
        containerPostJson params = new containerPostJson();
        
        params.setName("SAGE");
        
        params.setContainertype("96 Well Plate");
        
        logger.info(params.toString());
        
        List<Tblcontainers> list = tblcontainersSvc.findBySearchTerm(params);
        
        for(Tblcontainers c : list){
           assertTrue(c.getContainername().contains("SAGE")); 
        }
        
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
       String dateStr = "2011-01-01";
        Date date = null;
       try{
           
         date = sdf.parse(dateStr);
       
       }catch(Exception e){
           e.printStackTrace();
       }
       
       params.setShipped_after(dateStr);
       
       list = tblcontainersSvc.findBySearchTerm(params);
        
        for(Tblcontainers c : list){
           assertTrue(c.getShippeddate().after(date));
        }
        
        containerPostJson params2 = new containerPostJson();
        
        params2.setShipped_before(dateStr);
        
       list = tblcontainersSvc.findBySearchTerm(params2);
        
        for(Tblcontainers c : list){
           assertTrue(c.getShippeddate().before(date));
        } 
     
     }
//     
     @Test
     public void ContainerSearchSvcIsExactOptionWorks(){
        containerPostJson params = new containerPostJson();
        
        params.setName("SAGE_VANP4GEN 1ng-ul");
        params.setNameisExact("true");
        
        List<Tblcontainers> list = tblcontainersSvc.findBySearchTerm(params);
        
        for(Tblcontainers c : list){
           assertTrue(c.getContainername().equalsIgnoreCase("SAGE_VANP4GEN 1ng-ul")); 
        }
        
        containerPostJson params2 = new containerPostJson();
        
        params2.setComment("Plate formerly: SAGE_VANP7GEN.");
        params2.setCommentisExact("true");
        list = tblcontainersSvc.findBySearchTerm(params2);
        
        for(Tblcontainers c : list){
           assertTrue(c.getComments().equalsIgnoreCase("Plate formerly: SAGE_VANP7GEN.")); 
        }
        
     }
     
     @Test
     public void UserSearchServiceOptionWorks(){
         UserPostJson user = new UserPostJson();
         
         user.setUsername("ddaley");
         user.setPassword("ddaley");
         
         Tblsimsusers foundUser = userSearchSvc.findUser(user);
         logger.info("foundUser: "+foundUser);
         assertTrue(foundUser.getInitials().equalsIgnoreCase("DD"));
         
         assertTrue(foundUser.getLogin().equalsIgnoreCase("ddaley"));
     }

}
