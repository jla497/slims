/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblsampleprocessing;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import ca.ubc.icapture.genapha.slims.model.Tblsampletypes;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class SampleDTO {
    private long sampleid;
     private String sampletype;
     private String materialtype;
//     private SubjectDTO subject;
//     private int subjectID;
//     SubjectDTO tblSubject;
     int tblsubject;
     private String name;
     private short valid;
     private Integer numcalls;
     private String location;
     private Integer numnocalls;
     private String freezerlocation;
     private Double concentration;
     private Long parent;
     private Long parentid;
     private Date collectiondate;
     private String comments;
     private Integer sampletypeyear1id;
     private Date extractiondateyear1;
     private Date collectiondateyear1;
     private Date extractiondate;
     private Date created;
     private Date modified;
//     private Set<ContainerContentDTO> tblcontainercontents;
     private Long tblcontainercontents;

    public SampleDTO(Tblsamples sample) {
        this.sampleid = sample.getSampleid();
        if(sample.getTblsampletypes() != null){
            this.sampletype = sample.getTblsampletypes().getDescription();
        }else{
            this.sampletype = null;
        }
        this.materialtype ="";
        
        if(sample.getTblsubject()!=null){
            this.tblsubject = sample.getTblsubject().getSubjectid();
        }else{
            this.tblsubject = -1;
        }

//        if(sample.getTblsubject()!=null){
//            this.tblSubject = new SubjectDTO(sample.getTblsubject());
//        }else{
//            this.tblSubject = null;
//        }

        
        this.name = sample.getName();
        this.valid = sample.getValid();
        this.numcalls = sample.getNumcalls();
        this.location = sample.getLocation();
        this.numnocalls = sample.getNumnocalls();
        this.freezerlocation = sample.getFreezerlocation();
        this.concentration = sample.getConcentration();
        this.parent =sample.getParent();
        this.parentid = sample.getParentid();
        this.collectiondate = sample.getCollectiondate();
        this.comments = sample.getComments();
        this.sampletypeyear1id = sample.getSampletypeyear1id();
        this.extractiondateyear1 = sample.getExtractiondateyear1();
        this.collectiondateyear1 = sample.getCollectiondateyear1();
        this.extractiondate = sample.getExtractiondate();
        this.created = sample.getCreated();
        this.modified = sample.getModified();
        this.tblcontainercontents = sample.getSampleid();
        
        
    }

    public SampleDTO() {
        this.sampleid = -1;
        this.sampletype = "";
        this.materialtype = "";
//        this.subject = null;
//        this.subjectID = "";
        this.tblsubject = -1;
        this.name = "";
        this.valid = -1;
        this.numcalls = -1;
        this.location = "";
        this.numnocalls = -1;
        this.freezerlocation = "";
        this.concentration = -1.0;
        this.parent = -1L;
        this.parentid = -1L;
        this.collectiondate = null;
        this.comments = "";
        this.sampletypeyear1id = null;
        this.extractiondateyear1 = null;
        this.collectiondateyear1 = null;
        this.extractiondate = null;
        this.created = null;
        this.modified = null;
        this.tblcontainercontents = -1L;
    }

    public int getTblsubject() {
        return tblsubject;
    }

    public void setTblsubject(int tblsubject) {
        this.tblsubject = tblsubject;
    }

   
    
    
    

    public long getSampleid() {
        return sampleid;
    }

    public void setSampleid(long sampleid) {
        this.sampleid = sampleid;
    }

    public String getSampletype() {
        return sampletype;
    }

    public void setSampletype(String sampletype) {
        this.sampletype = sampletype;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

//    public SubjectDTO getSubject() {
//        return subject;
//    }
//
//    public void setSubject(SubjectDTO subject) {
//        this.subject = subject;
//    }

    public Long getTblcontainercontents() {
        return tblcontainercontents;
    }

    public void setTblcontainercontents(Long tblcontainercontents) {
        this.tblcontainercontents = tblcontainercontents;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getValid() {
        return valid;
    }

    public void setValid(short valid) {
        this.valid = valid;
    }

    public Integer getNumcalls() {
        return numcalls;
    }

    public void setNumcalls(Integer numcalls) {
        this.numcalls = numcalls;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNumnocalls() {
        return numnocalls;
    }

    public void setNumnocalls(Integer numnocalls) {
        this.numnocalls = numnocalls;
    }

    public String getFreezerlocation() {
        return freezerlocation;
    }

    public void setFreezerlocation(String freezerlocation) {
        this.freezerlocation = freezerlocation;
    }

    public Double getConcentration() {
        return concentration;
    }

    public void setConcentration(Double concentration) {
        this.concentration = concentration;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Date getCollectiondate() {
        return collectiondate;
    }

    public void setCollectiondate(Date collectiondate) {
        this.collectiondate = collectiondate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getSampletypeyear1id() {
        return sampletypeyear1id;
    }

    public void setSampletypeyear1id(Integer sampletypeyear1id) {
        this.sampletypeyear1id = sampletypeyear1id;
    }

    public Date getExtractiondateyear1() {
        return extractiondateyear1;
    }

    public void setExtractiondateyear1(Date extractiondateyear1) {
        this.extractiondateyear1 = extractiondateyear1;
    }

    public Date getCollectiondateyear1() {
        return collectiondateyear1;
    }

    public void setCollectiondateyear1(Date collectiondateyear1) {
        this.collectiondateyear1 = collectiondateyear1;
    }

    public Date getExtractiondate() {
        return extractiondate;
    }

    public void setExtractiondate(Date extractiondate) {
        this.extractiondate = extractiondate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

//    public String getSubjectID() {
//        return subjectID;
//    }
//
//    public void setSubjectID(String subjectID) {
//        this.subjectID = subjectID;
//    }
     
     
}
