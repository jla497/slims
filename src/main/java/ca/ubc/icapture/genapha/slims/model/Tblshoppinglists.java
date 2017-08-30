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
 * Tblshoppinglists generated by hbm2java
 */
@Entity
@Table(name="TBLSHOPPINGLISTS"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="LISTNAME") 
)
public class Tblshoppinglists  implements java.io.Serializable {


     private int listid;
     private Tblsimsusers tblsimsusersByModifiedBy;
     private Tblsimsusers tblsimsusersByCreatedBy;
     private String listname;
     private Date created;
     private Date modified;
     private Integer inuseby;

    public Tblshoppinglists() {
    }

	
    public Tblshoppinglists(int listid, Tblsimsusers tblsimsusersByCreatedBy, String listname, Date created) {
        this.listid = listid;
        this.tblsimsusersByCreatedBy = tblsimsusersByCreatedBy;
        this.listname = listname;
        this.created = created;
    }
    public Tblshoppinglists(int listid, Tblsimsusers tblsimsusersByModifiedBy, Tblsimsusers tblsimsusersByCreatedBy, String listname, Date created, Date modified, Integer inuseby) {
       this.listid = listid;
       this.tblsimsusersByModifiedBy = tblsimsusersByModifiedBy;
       this.tblsimsusersByCreatedBy = tblsimsusersByCreatedBy;
       this.listname = listname;
       this.created = created;
       this.modified = modified;
       this.inuseby = inuseby;
    }
   
     @Id 
    
    @Column(name="LISTID", unique=true, nullable=false)
    public int getListid() {
        return this.listid;
    }
    
    public void setListid(int listid) {
        this.listid = listid;
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
    
    @Column(name="LISTNAME", unique=true, nullable=false, length=100)
    public String getListname() {
        return this.listname;
    }
    
    public void setListname(String listname) {
        this.listname = listname;
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
    
    @Column(name="INUSEBY")
    public Integer getInuseby() {
        return this.inuseby;
    }
    
    public void setInuseby(Integer inuseby) {
        this.inuseby = inuseby;
    }




}

