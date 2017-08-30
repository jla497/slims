/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author JLee05
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class searchRequestWrapper {
    phenotypePostJson phenotypeParams;
    genotypePostJson genotypeParams;
    subjectPostJson subjectParams;
    samplePostJson sampleParams;
    containerPostJson containerParams;
    String src;
    String target;
    String direction;
    
    public searchRequestWrapper() {
       
        this.phenotypeParams = new phenotypePostJson();
        this.containerParams = new containerPostJson();
        this.sampleParams = new samplePostJson();
        this.subjectParams = new subjectPostJson();
        this.genotypeParams = new genotypePostJson();
        this.src="";
        this.target = "";
        this.direction = "";
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public phenotypePostJson getPhenotypeParams() {
        return phenotypeParams;
    }

    public void setPhenotypeParams(phenotypePostJson phenotypeParams) {
        this.phenotypeParams = phenotypeParams;
    }

    public genotypePostJson getGenotypeParams() {
        return genotypeParams;
    }

    public void setGenotypeParams(genotypePostJson genotypeParams) {
        this.genotypeParams = genotypeParams;
    }

    public subjectPostJson getSubjectParams() {
        return subjectParams;
    }

    public void setSubjectParams(subjectPostJson subjectParams) {
        this.subjectParams = subjectParams;
    }

    public samplePostJson getSampleParams() {
        return sampleParams;
    }

    public void setSampleParams(samplePostJson sampleParams) {
        this.sampleParams = sampleParams;
    }

    public containerPostJson getContainerParams() {
        return containerParams;
    }

    public void setContainerParams(containerPostJson containerParams) {
        this.containerParams = containerParams;
    }

    @Override
    public String toString() {
        return "searchRequestWrapper{" + "phenotypeParams=" + phenotypeParams + ", genotypeParams=" + genotypeParams + ", subjectParams=" + subjectParams + ", sampleParams=" + sampleParams + ", containerParams=" + containerParams + ", src=" + src + ", target=" + target + ", direction=" + direction + '}';
    }
    
    
}
