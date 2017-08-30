/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.serializers;

import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author JLee05
 */
public class CustomTblcontentSrlzer extends StdSerializer<Set<Tblcontainercontents>>{
    
    public CustomTblcontentSrlzer(){
        this(null);
    }
    
    public CustomTblcontentSrlzer(Class<Set<Tblcontainercontents>> t){
        super(t);
    }
    
    @Override
    public void serialize(
       Set<Tblcontainercontents> items, 
       JsonGenerator generator,
       SerializerProvider provider
    ) throws IOException, JsonProcessingException{
        
        Set<CustTblContainercontents> newList = new HashSet<CustTblContainercontents>();
        for(Tblcontainercontents item : items){
            newList.add(new CustTblContainercontents(item));
        }
        
        generator.writeObject(newList);
        
    }
    
    public class CustTblContainercontents {
        private int containercontentsid; 
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
        private String materialType;
        private String sampleType;
  
    public CustTblContainercontents(Tblcontainercontents item) {
  
        
            this.sampleType = item.getTblsamples().getName();
            this.materialType = item.getTblmaterialtype().getDescription();
            this.containercontentsid = item.getContainercontentsid();
             this.row=item.getRow();
             this.column=item.getColumn();
             this.volume=item.getVolume();
             this.concentration=item.getConcentration();
             this.parentid=item.getParentid();
             this.contaminated = item.getContaminated();
             this.dilution = item.getDilution();
             this.comments=item.getComments();
             this.created = item.getCreated();
             this.createdBy = item.getCreatedBy();
             this.modified = item.getModified();
             this.modifiedBy = item.getModifiedBy();
             this.quantified = item.getQuantified();
             this.amplificationdate = item.getAmplificationdate();
             this.barcode = item.getBarcode();
            
    }

        public int getContainercontentsid() {
            return containercontentsid;
        }

        public void setContainercontentsid(int containercontentsid) {
            this.containercontentsid = containercontentsid;
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

        public String getMaterialType() {
            return materialType;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }

        public String getSampleType() {
            return sampleType;
        }

        public void setSampleType(String sampleType) {
            this.sampleType = sampleType;
        }
    
    }
} 
