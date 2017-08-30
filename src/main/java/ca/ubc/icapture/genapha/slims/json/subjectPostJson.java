/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

/**
 *
 * @author JLee05
 */
/**Subject Search API*/
public class subjectPostJson {
    String subjectID;
    String subjectIDisExact;
    String ethnicitytype;
    String geneticEthnicity;
    String selfReportedEthnicity;
    String selfAncEthnicity;
    String cohorttype;
    String familyID;
    String fatherID;
    String motherID;
    String familyIDisExact;        
    String fatherIDisExact;
    String motherIDisExact;   
    String gender;
    String consent;
    String comment;
    String commentisExact;
   
    
    
    public subjectPostJson() {
        this.subjectID="";
        this.subjectIDisExact="false";
        this.ethnicitytype="";
        this.geneticEthnicity="";
        this.selfReportedEthnicity="";
        this.selfAncEthnicity="";
        this.cohorttype="";
        this.familyID="";
        this.fatherID="";
        this.motherID="";
        this.familyIDisExact="false";        
        this.fatherIDisExact="false";
        this.motherIDisExact="false";   
        this.gender="";
        this.consent="";
        this.comment="";
        this.commentisExact="false";

    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectIDisExact() {
        return subjectIDisExact;
    }

    public void setSubjectIDisExact(String subjectIDisExact) {
        this.subjectIDisExact = subjectIDisExact;
    }

    public String getEthnicitytype() {
        return ethnicitytype;
    }

    public void setEthnicitytype(String ethnicitytype) {
        this.ethnicitytype = ethnicitytype;
    }

    public String getGeneticEthnicity() {
        return geneticEthnicity;
    }

    public void setGeneticEthnicity(String geneticEthnicity) {
        this.geneticEthnicity = geneticEthnicity;
    }

    public String getSelfReportedEthnicity() {
        return selfReportedEthnicity;
    }

    public void setSelfReportedEthnicity(String selfReportedEthnicity) {
        this.selfReportedEthnicity = selfReportedEthnicity;
    }

    public String getSelfAncEthnicity() {
        return selfAncEthnicity;
    }

    public void setSelfAncEthnicity(String selfAncEthnicity) {
        this.selfAncEthnicity = selfAncEthnicity;
    }

    public String getCohorttype() {
        return cohorttype;
    }

    public void setCohorttype(String cohorttype) {
        this.cohorttype = cohorttype;
    }

    public String getFamilyID() {
        return familyID;
    }

    public void setFamilyID(String familyID) {
        this.familyID = familyID;
    }

    public String getFatherID() {
        return fatherID;
    }

    public void setFatherID(String fatherID) {
        this.fatherID = fatherID;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getFamilyIDisExact() {
        return familyIDisExact;
    }

    public void setFamilyIDisExact(String familyIDisExact) {
        this.familyIDisExact = familyIDisExact;
    }

    public String getFatherIDisExact() {
        return fatherIDisExact;
    }

    public void setFatherIDisExact(String fatherIDisExact) {
        this.fatherIDisExact = fatherIDisExact;
    }

    public String getMotherIDisExact() {
        return motherIDisExact;
    }

    public void setMotherIDisExact(String motherIDisExact) {
        this.motherIDisExact = motherIDisExact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getConsent() {
        return consent;
    }

    public void setConsent(String consent) {
        this.consent = consent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentisExact() {
        return commentisExact;
    }

    public void setCommentisExact(String commentisExact) {
        this.commentisExact = commentisExact;
    }

    @Override
    public String toString() {
        return "subjectPostJson{" + "subjectID=" + subjectID + ", subjectIDisExact=" + subjectIDisExact + ", ethnicitytype=" + ethnicitytype + ", geneticEthnicity=" + geneticEthnicity + ", selfReportedEthnicity=" + selfReportedEthnicity + ", selfAncEthnicity=" + selfAncEthnicity + ", cohorttype=" + cohorttype + ", familyID=" + familyID + ", fatherID=" + fatherID + ", motherID=" + motherID + ", familyIDisExact=" + familyIDisExact + ", fatherIDisExact=" + fatherIDisExact + ", motherIDisExact=" + motherIDisExact + ", gender=" + gender + ", consent=" + consent + ", comment=" + comment + ", commentisExact=" + commentisExact + '}';
    }

   
}
