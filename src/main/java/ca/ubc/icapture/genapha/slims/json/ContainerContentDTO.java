/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import ca.ubc.icapture.genapha.slims.model.Tblmaterialtype;
import ca.ubc.icapture.genapha.slims.model.Tblsamples;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ContainerContentDTO {
    
     private int containercontentsid;
     private String materialtype;
     private int row;
     private int column;
     private double volume;
     private double concentration;
     private int parentid;
     private short contaminated;
     private String dilution;
     private String comments;
     private Date created;
     private int createdBy;
     private Date modified;
     private Integer modifiedBy;
     private Date quantified;
     private Date amplificationdate;
     private String barcode;

    public ContainerContentDTO(Tblcontainercontents content) {
        this.containercontentsid = content.getContainercontentsid();
        if(content.getTblmaterialtype() != null){
            this.materialtype = content.getTblmaterialtype().getDescription();
        }else{
             this.materialtype = null;
        }
        this.row = content.getRow();
        this.column = content.getColumn();
        this.volume = content.getVolume();
        this.concentration = content.getConcentration();
        this.parentid = content.getParentid();
        this.contaminated = content.getContaminated();
        this.dilution = content.getDilution();
        this.comments = content.getComments();
        this.created = content.getCreated();
        this.createdBy = content.getCreatedBy();
        this.modified = content.getModified();
        this.modifiedBy = content.getModifiedBy();
        this.quantified = content.getQuantified();
        this.amplificationdate = content.getAmplificationdate();
        this.barcode = content.getBarcode();
    }
    
    public ContainerContentDTO() {
        this.containercontentsid = -1;
        this.materialtype = "";
        this.row = -1;
        this.column = -1;
        this.volume = -1.0;
        this.concentration = -1.0;
        this.parentid = -1;
        this.contaminated = -1;
        this.dilution = "";
        this.comments = "";
        this.created = null;
        this.createdBy = -1;
        this.modified = null;
        this.modifiedBy = -1;
        this.quantified = null;
        this.amplificationdate = null;
        this.barcode = "";
    }

    public int getContainercontentsid() {
        return containercontentsid;
    }

    public void setContainercontentsid(int containercontentsid) {
        this.containercontentsid = containercontentsid;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public short getContaminated() {
        return contaminated;
    }

    public void setContaminated(short contaminated) {
        this.contaminated = contaminated;
    }

    public String getDilution() {
        return dilution;
    }

    public void setDilution(String dilution) {
        this.dilution = dilution;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getQuantified() {
        return quantified;
    }

    public void setQuantified(Date quantified) {
        this.quantified = quantified;
    }

    public Date getAmplificationdate() {
        return amplificationdate;
    }

    public void setAmplificationdate(Date amplificationdate) {
        this.amplificationdate = amplificationdate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    
     
     
}
