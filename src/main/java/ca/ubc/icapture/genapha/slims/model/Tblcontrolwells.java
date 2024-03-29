package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Tblcontrolwells generated by hbm2java
 */
@Entity
@Table(name="TBLCONTROLWELLS"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames={"CONTAINERID", "ROW", "COLUMN"}) 
)
public class Tblcontrolwells  implements java.io.Serializable {


     private int controlwellid;
     private Tblsimsusers tblsimsusersByModifiedBy;
     private Tblsimsusers tblsimsusersByCreatedBy;
     private Tblcontainers tblcontainers;
     private Tblcontrol tblcontrol;
     private int row;
     private int column;
     private Double volume;
     private String comments;
     private Date created;
     private Date modified;

    public Tblcontrolwells() {
    }

	
    public Tblcontrolwells(int controlwellid, Tblsimsusers tblsimsusersByCreatedBy, Tblcontainers tblcontainers, Tblcontrol tblcontrol, int row, int column, Date created) {
        this.controlwellid = controlwellid;
        this.tblsimsusersByCreatedBy = tblsimsusersByCreatedBy;
        this.tblcontainers = tblcontainers;
        this.tblcontrol = tblcontrol;
        this.row = row;
        this.column = column;
        this.created = created;
    }
    public Tblcontrolwells(int controlwellid, Tblsimsusers tblsimsusersByModifiedBy, Tblsimsusers tblsimsusersByCreatedBy, Tblcontainers tblcontainers, Tblcontrol tblcontrol, int row, int column, Double volume, String comments, Date created, Date modified) {
       this.controlwellid = controlwellid;
       this.tblsimsusersByModifiedBy = tblsimsusersByModifiedBy;
       this.tblsimsusersByCreatedBy = tblsimsusersByCreatedBy;
       this.tblcontainers = tblcontainers;
       this.tblcontrol = tblcontrol;
       this.row = row;
       this.column = column;
       this.volume = volume;
       this.comments = comments;
       this.created = created;
       this.modified = modified;
    }
   
     @Id 
    
    @Column(name="CONTROLWELLID", unique=true, nullable=false)
    public int getControlwellid() {
        return this.controlwellid;
    }
    
    public void setControlwellid(int controlwellid) {
        this.controlwellid = controlwellid;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MODIFIED_BY")
    public Tblsimsusers getTblsimsusersByModifiedBy() {
        return this.tblsimsusersByModifiedBy;
    }
    
    public void setTblsimsusersByModifiedBy(Tblsimsusers tblsimsusersByModifiedBy) {
        this.tblsimsusersByModifiedBy = tblsimsusersByModifiedBy;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CREATED_BY", nullable=false)
    public Tblsimsusers getTblsimsusersByCreatedBy() {
        return this.tblsimsusersByCreatedBy;
    }
    
    public void setTblsimsusersByCreatedBy(Tblsimsusers tblsimsusersByCreatedBy) {
        this.tblsimsusersByCreatedBy = tblsimsusersByCreatedBy;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTAINERID", nullable=false)
    public Tblcontainers getTblcontainers() {
        return this.tblcontainers;
    }
    
    public void setTblcontainers(Tblcontainers tblcontainers) {
        this.tblcontainers = tblcontainers;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTROLID", nullable=false)
    public Tblcontrol getTblcontrol() {
        return this.tblcontrol;
    }
    
    public void setTblcontrol(Tblcontrol tblcontrol) {
        this.tblcontrol = tblcontrol;
    }
    
    @Column(name="ROW", nullable=false)
    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    @Column(name="COLUMN", nullable=false)
    public int getColumn() {
        return this.column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    @Column(name="VOLUME", precision=53, scale=0)
    public Double getVolume() {
        return this.volume;
    }
    
    public void setVolume(Double volume) {
        this.volume = volume;
    }
    
    @Column(name="COMMENTS", length=250)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFIED", length=26)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }




}


