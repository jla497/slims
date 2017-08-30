/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import ca.ubc.icapture.genapha.slims.model.Tblcontainercontents;
import ca.ubc.icapture.genapha.slims.model.Tblcontainers;
import ca.ubc.icapture.genapha.slims.model.Tblcontainertypes;
import ca.ubc.icapture.genapha.slims.model.Tblfreezers;
import ca.ubc.icapture.genapha.slims.model.Tblshippedto;
import ca.ubc.icapture.genapha.slims.model.Tblsimsusers;
import ca.ubc.icapture.genapha.slims.serializers.CustomTblcontentSrlzer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class ContainerDTO {
     private int containerid;
     private String shippedto;
     private String freezertype;
     private String containertype;
     private String containername;
     private Integer shelf;
     private short discarded;
     private short shippedout;
     private Date shippeddate;
     private String comments;
     private Short stock;
     private int materialtypeid;
     private Date created;
     private Date modified;
     private int valid;
     private String containeralias;
     private Date date;
     private String initials;
     private int lot;
     private String location;
     private String barcode;
     private String checkedout;
     private int tblcontainercontentses;

    public ContainerDTO(Tblcontainers container ) {
        this.containerid = container.getContainerid();
  
        if( container.getTblshippedto()!=null){
            this.shippedto = container.getTblshippedto().getDescription();
        }else{
             this.shippedto = null;
        }
       
        if(container.getTblfreezers()!=null){
             this.freezertype = container.getTblfreezers().getDescription();
        }else{
            this.freezertype = null;
        }
        if(container.getTblcontainertypes()!=null){
         this.containertype = container.getTblcontainertypes().getDescription();
        }else{
            this.containertype = null;
        }
        this.containername = container.getContainername();
        this.shelf = container.getShelf();
        this.discarded = container.getDiscarded();
        this.shippedout = container.getShippedout();
        this.shippeddate = container.getShippeddate();
        this.comments = container.getComments();
        this.stock = container.getStock();
        this.materialtypeid = container.getMaterialtypeid();
        this.created = container.getCreated();
        this.modified = container.getModified();
        this.valid = container.getValid();
        this.containeralias = container.getContaineralias();
        this.date = container.getDate();
        this.initials = container.getInitials();
        this.lot = container.getLot();
        this.location = container.getLocation();
        this.barcode = container.getBarcode();
        this.checkedout = container.getCheckedout();
        this.tblcontainercontentses = container.getContainerid();
       
            
    }
    
     
     public ContainerDTO() {
        this.containerid = -1;

        this.shippedto = null;
        this.freezertype = null;
        this.containertype = null;
        this.containername = null;
        this.shelf = null;
        this.discarded = -1;
        this.shippedout = -1;
        this.shippeddate = null;
        this.comments = null;
        this.stock = -1;
        this.materialtypeid = -1;
        this.created = null;
        this.modified = null;
        this.valid = -1;
        this.containeralias = null;
        this.date = null;
        this.initials = null;
        this.lot = -1;
        this.location = null;
        this.barcode = null;
        this.checkedout = "";
        this.tblcontainercontentses = -1;
     
}

    public int getContainerid() {
        return containerid;
    }

    public void setContainerid(int containerid) {
        this.containerid = containerid;
    }


    public String getShippedto() {
        return shippedto;
    }

    public void setShippedto(String shippedto) {
        this.shippedto = shippedto;
    }

    public String getFreezertype() {
        return freezertype;
    }

    public void setFreezertype(String freezertype) {
        this.freezertype = freezertype;
    }

    public String getContainertype() {
        return containertype;
    }

    public void setContainertype(String containertype) {
        this.containertype = containertype;
    }

    public String getContainername() {
        return containername;
    }

    public void setContainername(String containername) {
        this.containername = containername;
    }

    public Integer getShelf() {
        return shelf;
    }

    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }

    public short getDiscarded() {
        return discarded;
    }

    public void setDiscarded(short discarded) {
        this.discarded = discarded;
    }

    public short getShippedout() {
        return shippedout;
    }

    public void setShippedout(short shippedout) {
        this.shippedout = shippedout;
    }

    public Date getShippeddate() {
        return shippeddate;
    }

    public void setShippeddate(Date shippeddate) {
        this.shippeddate = shippeddate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Short getStock() {
        return stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    public int getMaterialtypeid() {
        return materialtypeid;
    }

    public void setMaterialtypeid(int materialtypeid) {
        this.materialtypeid = materialtypeid;
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

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public String getContaineralias() {
        return containeralias;
    }

    public void setContaineralias(String containeralias) {
        this.containeralias = containeralias;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCheckedout() {
        return checkedout;
    }

    public void setCheckedout(String checkedout) {
        this.checkedout = checkedout;
    }

    public int getTblcontainercontentses() {
        return tblcontainercontentses;
    }

    public void setTblcontainercontentses(int tblcontainercontentses) {
        this.tblcontainercontentses = tblcontainercontentses;
    }
}