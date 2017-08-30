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
/**Container Search API*/
public class containerPostJson {
    String name;
    String nameisExact;  
    String alias;
    String aliasisExact;
    String plate_maker_init;
    String plate_maker_initisExact;
    String containertype;
    String freezertype;
    String shiptotype;
    String discarded;
    String shipStatus;
    String shipped_after;
    String shipped_before;
    String comment;
    String commentisExact;
    String barcode;
    String barcodeisExact;
    
    public containerPostJson() {
        this.name ="";
        this.nameisExact="false";  
        this.alias="";
        this.aliasisExact="false";
        this.plate_maker_init="";
        this.plate_maker_initisExact="false";
        this.containertype="";
        this.freezertype="";
        this.shiptotype="";
        this.discarded="";
        this.shipped_after="";
        this.shipped_before="";
        this.comment="";
        this.commentisExact="false";
        this.barcode="";
        this.barcodeisExact="false";
        
    }
   

    public String getCommentisExact() {
        return commentisExact;
    }

    public void setCommentisExact(String commentisExact) {
        this.commentisExact = commentisExact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public String getNameisExact() {
        return nameisExact;
    }

    public void setNameisExact(String nameisExact) {
        this.nameisExact = nameisExact;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAliasisExact() {
        return aliasisExact;
    }

    public void setAliasisExact(String aliasisExact) {
        this.aliasisExact = aliasisExact;
    }

    public String getPlate_maker_init() {
        return plate_maker_init;
    }

    public void setPlate_maker_init(String plate_maker_init) {
        this.plate_maker_init = plate_maker_init;
    }

    public String getPlate_maker_initisExact() {
        return plate_maker_initisExact;
    }

    public void setPlate_maker_initisExact(String plate_maker_initisExact) {
        this.plate_maker_initisExact = plate_maker_initisExact;
    }

    public String getContainertype() {
        return containertype;
    }

    public void setContainertype(String containertype) {
        this.containertype = containertype;
    }

    public String getFreezertype() {
        return freezertype;
    }

    public void setFreezertype(String freezertype) {
        this.freezertype = freezertype;
    }

    public String getShiptotype() {
        return shiptotype;
    }

    public void setShiptotype(String shiptotype) {
        this.shiptotype = shiptotype;
    }

    public String getDiscarded() {
        return discarded;
    }

    public void setDiscarded(String discarded) {
        this.discarded = discarded;
    }

    public String getShipped_after() {
        return shipped_after;
    }

    public void setShipped_after(String shipped_after) {
        this.shipped_after = shipped_after;
    }

    public String getShipped_before() {
        return shipped_before;
    }

    public void setShipped_before(String shipped_before) {
        this.shipped_before = shipped_before;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcodeisExact() {
        return barcodeisExact;
    }

    public void setBarcodeisExact(String barcodeisExact) {
        this.barcodeisExact = barcodeisExact;
    }

    @Override
    public String toString() {
        return "containerPostJson{" + "name=" + name + ", nameisExact=" + nameisExact + ", alias=" + alias + ", aliasisExact=" + aliasisExact + ", plate_maker_init=" + plate_maker_init + ", plate_maker_initisExact=" + plate_maker_initisExact + ", containertype=" + containertype + ", freezertype=" + freezertype + ", shiptotype=" + shiptotype + ", discarded=" + discarded + ", shipped_after=" + shipped_after + ", shipped_before=" + shipped_before + ", comment=" + comment + ", commentisExact=" + commentisExact + ", barcode=" + barcode + ", barcodeisExact=" + barcodeisExact + '}';
    }

   
   
}
