/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import ca.ubc.icapture.genapha.slims.model.Tblcohortlookup;
import ca.ubc.icapture.genapha.slims.model.Tblethnicitylookup;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import ca.ubc.icapture.genapha.slims.model.Tblsubject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class SubjectDTO {
    
     private int subjectid;
     
     private String GeneticEthnicity;
     
     private String Ethnicity;
     
     private String SelfReportedEthnicity;
    
     private String SelfReportedAncestEthnicity;
     
     private String cohorttype;
     private String id;
     private String familyid;
     private short gender;
     private short code;
     private short hasconsent;
     private String motherid;
     private String fatherid;
     private short passedqc;
     private int numsamplescollected;
     private Date created;
     private Date modified;
     private String comment;
     private Integer tblphenotypes;

     
    public SubjectDTO(Tblsubject Subject) {
       
        this.subjectid = Subject.getSubjectid();
        this.GeneticEthnicity = "";
        this.SelfReportedEthnicity = "";
        this.SelfReportedAncestEthnicity = "";
   
//        if(Subject.getTblethnicitylookupByGenEthid()!=null){
//            this.GeneticEthnicity = Subject.getTblethnicitylookupByGenEthid().getEthnicity();
//        }else{
//            this.GeneticEthnicity=null;
//        }
//        if(Subject.getTblethnicitylookupBySelfRepEthid()!=null){
//            this.SelfReportedEthnicity = Subject.getTblethnicitylookupBySelfRepEthid().getEthnicity();
//        }
//        if(Subject.getTblethnicitylookupBySelfRepAncEthid()!=null){
//            this.SelfReportedAncestEthnicity = Subject.getTblethnicitylookupBySelfRepAncEthid().getEthnicity();
//        }else{
//            this.SelfReportedAncestEthnicity  = null;
//        }
        if(Subject.getTblethnicitylookupByEthnicityid()!=null){
            this.Ethnicity = Subject.getTblethnicitylookupByEthnicityid().getEthnicity();
        }else{
            this.Ethnicity = null;
        }
        if(Subject.getTblcohortlookup()!=null){
            this.cohorttype = Subject.getTblcohortlookup().getName();
        }else{
            this.cohorttype = null;
        }
        this.id = Subject.getId();
        this.familyid = Subject.getFamilyid();
        this.gender = Subject.getGender();
        this.code = Subject.getCode();
        this.hasconsent = Subject.getHasconsent();
        this.motherid = Subject.getMotherid();
        this.fatherid = Subject.getFatherid();
        this.passedqc = Subject.getPassedqc();
        this.numsamplescollected = Subject.getNumsamplescollected();
        this.created = Subject.getCreated();
        this.modified = Subject.getModified();
        this.comment = Subject.getComment();
        this.tblphenotypes = Subject.getSubjectid();
       
    }

    public SubjectDTO() {
        
         this.subjectid = -1;
        this.GeneticEthnicity = "";
        this.SelfReportedEthnicity =null; 
        this.SelfReportedAncestEthnicity = null;
        this.Ethnicity = null;
        this.cohorttype = null;
        this.id = null;
        this.familyid = null;
        this.gender = -1;
        this.code = -1;
        this.hasconsent = -1;
        this.motherid = null;
        this.fatherid = null;
        this.passedqc = -1;
        this.numsamplescollected = -1;
        this.created = null;
        this.modified = null;
        this.comment = null;
        this.tblphenotypes = -1;
        
    }

    public String getEthnicity() {
        return Ethnicity;
    }

    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    public Integer getTblphenotypes() {
        return tblphenotypes;
    }

    public void setTblphenotypes(Integer tblphenotypes) {
        this.tblphenotypes = tblphenotypes;
    }

  
 
     
    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getGeneticEthnicity() {
        return GeneticEthnicity;
    }

    public void setGeneticEthnicity(String GeneticEthnicity) {
        this.GeneticEthnicity = GeneticEthnicity;
    }

    public String getSelfReportedEthnicity() {
        return SelfReportedEthnicity;
    }

    public void setSelfReportedEthnicity(String SelfReportedEthnicity) {
        this.SelfReportedEthnicity = SelfReportedEthnicity;
    }

    public String getSelfReportedAncestEthnicity() {
        return SelfReportedAncestEthnicity;
    }

    public void setSelfReportedAncestEthnicity(String SelfReportedAncestEthnicity) {
        this.SelfReportedAncestEthnicity = SelfReportedAncestEthnicity;
    }

    public String getCohorttype() {
        return cohorttype;
    }

    public void setCohorttype(String cohorttype) {
        this.cohorttype = cohorttype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamilyid() {
        return familyid;
    }

    public void setFamilyid(String familyid) {
        this.familyid = familyid;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public short getHasconsent() {
        return hasconsent;
    }

    public void setHasconsent(short hasconsent) {
        this.hasconsent = hasconsent;
    }

    public String getMotherid() {
        return motherid;
    }

    public void setMotherid(String motherid) {
        this.motherid = motherid;
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid;
    }

    public short getPassedqc() {
        return passedqc;
    }

    public void setPassedqc(short passedqc) {
        this.passedqc = passedqc;
    }

    public int getNumsamplescollected() {
        return numsamplescollected;
    }

    public void setNumsamplescollected(int numsamplescollected) {
        this.numsamplescollected = numsamplescollected;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" + "subjectid=" + subjectid + ", GeneticEthnicity=" + GeneticEthnicity + ", Ethnicity=" + Ethnicity + ", SelfReportedEthnicity=" + SelfReportedEthnicity + ", SelfReportedAncestEthnicity=" + SelfReportedAncestEthnicity + ", cohorttype=" + cohorttype + ", id=" + id + ", familyid=" + familyid + ", gender=" + gender + ", code=" + code + ", hasconsent=" + hasconsent + ", motherid=" + motherid + ", fatherid=" + fatherid + ", passedqc=" + passedqc + ", numsamplescollected=" + numsamplescollected + ", created=" + created + ", modified=" + modified + ", comment=" + comment + '}';
    }

    
}
