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
/**Phenotype search API*/
public class phenotypePostJson {
    String phenotypeid;
    String pheno_name;
    String subjectId;
    
    public phenotypePostJson(){}
    
    public String getPhenotypeid() {
        return phenotypeid;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setPhenotypeid(String phenotypeid) {
        this.phenotypeid = phenotypeid;
    }

    public String getPheno_name() {
        return pheno_name;
    }

    public void setPheno_name(String pheno_name) {
        this.pheno_name = pheno_name;
    }

    @Override
    public String toString() {
        return "phenotypePostJson{" + "phenotypeid=" + phenotypeid + ", pheno_name=" + pheno_name + ", subjectId=" + subjectId + '}';
    }

 
}
