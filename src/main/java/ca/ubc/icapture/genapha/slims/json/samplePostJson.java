/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import java.io.Serializable;

/**
 *
 * @author JLee05
 */
/**Sample Search API*/
public class samplePostJson {

        String sampleID;
        String sampleidIsExact;
        String barcode;
        String barcodeIsExact;
        String volume; 
        String concentration;
        String dnaAmt;
        String materialtype;
        String stock; // 0 or 1
        String contaminated; // 0 or 1
        String sampletype;
        String collectdate_after;
        String collectdate_before;
        String extractdate_after;
        String extractdate_before;
        String comment;
        String commentIsExact;
        String sampledocname;
        String sampledoccomment;
        genotypePostJson genotypeParams;

    public samplePostJson() {
        this.sampleID="";
        this.sampleidIsExact="false";
        this.barcode="";
        this.barcodeIsExact="false";
        this.volume=""; 
        this.concentration="";
        this.dnaAmt="";
        this.materialtype="";
        this.stock="";
        this.contaminated="";
        this.sampletype="";
        this.collectdate_after="";
        this.collectdate_before="";
        this.extractdate_after="";
        this.extractdate_before="";
        this.comment="";
        this.commentIsExact="false";
        this.genotypeParams=null;
    }
        
        

    public genotypePostJson getGenotypeParams() {
        return genotypeParams;
    }

    public void setGenotypeParams(genotypePostJson genotypeParams) {
        this.genotypeParams = genotypeParams;
    }
        

    @Override
    public String toString() {
        return "samplePostJson{sampleID=" + sampleID + ", sampleidIsExact=" + sampleidIsExact + ", barcode=" + barcode + ", barcodeIsExact=" + barcodeIsExact + ", volume=" + volume + ", concentration=" + concentration + ", dnaAmt=" + dnaAmt + ", materialtype=" + materialtype + ", stock=" + stock + ", contaminated=" + contaminated + ", sampletype=" + sampletype + ", collectdate_after=" + collectdate_after + ", collectdate_before=" + collectdate_before + ", extractdate_after=" + extractdate_after + ", extractdate_before=" + extractdate_before + ", comment=" + comment + ", commentIsExact=" + commentIsExact + ", genotypeParams=" + genotypeParams + ", sampledocname=" + sampledocname + ", sampledoccomment=" + sampledoccomment + '}';
    }
       

    public String getSampleID() {
        return sampleID;
    }

    public void setSampleID(String sampleID) {
        this.sampleID = sampleID;
    }

    public String getSampleidIsExact() {
        return sampleidIsExact;
    }

    public void setSampleidIsExact(String sampleidIsExact) {
        this.sampleidIsExact = sampleidIsExact;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcodeIsExact() {
        return barcodeIsExact;
    }

    public void setBarcodeIsExact(String barcodeIsExact) {
        this.barcodeIsExact = barcodeIsExact;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getDnaAmt() {
        return dnaAmt;
    }

    public void setDnaAmt(String dnaAmt) {
        this.dnaAmt = dnaAmt;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getContaminated() {
        return contaminated;
    }

    public void setContaminated(String contaminated) {
        this.contaminated = contaminated;
    }

    public String getSampletype() {
        return sampletype;
    }

    public void setSampletype(String sampletype) {
        this.sampletype = sampletype;
    }

    public String getCollectdate_after() {
        return collectdate_after;
    }

    public void setCollectdate_after(String collectdate_after) {
        this.collectdate_after = collectdate_after;
    }

    public String getCollectdate_before() {
        return collectdate_before;
    }

    public void setCollectdate_before(String collectdate_before) {
        this.collectdate_before = collectdate_before;
    }

    public String getExtractdate_after() {
        return extractdate_after;
    }

    public void setExtractdate_after(String extractdate_after) {
        this.extractdate_after = extractdate_after;
    }

    public String getExtractdate_before() {
        return extractdate_before;
    }

    public void setExtractdate_before(String extractdate_before) {
        this.extractdate_before = extractdate_before;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentIsExact() {
        return commentIsExact;
    }

    public void setCommentIsExact(String commentIsExact) {
        this.commentIsExact = commentIsExact;
    }

    public String getSampledocname() {
        return sampledocname;
    }

    public void setSampledocname(String sampledocname) {
        this.sampledocname = sampledocname;
    }

    public String getSampledoccomment() {
        return sampledoccomment;
    }

    public void setSampledoccomment(String sampledoccomment) {
        this.sampledoccomment = sampledoccomment;
    }

}
