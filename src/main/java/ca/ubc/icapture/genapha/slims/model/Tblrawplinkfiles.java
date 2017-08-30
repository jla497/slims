package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Tblrawplinkfiles generated by hbm2java
 */
@Entity
@Table(name="TBLRAWPLINKFILES"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="NAME") 
)
public class Tblrawplinkfiles  implements java.io.Serializable {


     private int genotypingrunid;
     private Blob bed;
     private Blob fam;
     private Blob bim;
     private String description;
     private Date date;
     private String name;

    public Tblrawplinkfiles() {
    }

	
    public Tblrawplinkfiles(int genotypingrunid, Blob bed, Blob fam, Blob bim, String name) {
        this.genotypingrunid = genotypingrunid;
        this.bed = bed;
        this.fam = fam;
        this.bim = bim;
        this.name = name;
    }
    public Tblrawplinkfiles(int genotypingrunid, Blob bed, Blob fam, Blob bim, String description, Date date, String name) {
       this.genotypingrunid = genotypingrunid;
       this.bed = bed;
       this.fam = fam;
       this.bim = bim;
       this.description = description;
       this.date = date;
       this.name = name;
    }
   
     @Id 
    
    @Column(name="GENOTYPINGRUNID", unique=true, nullable=false)
    public int getGenotypingrunid() {
        return this.genotypingrunid;
    }
    
    public void setGenotypingrunid(int genotypingrunid) {
        this.genotypingrunid = genotypingrunid;
    }
    
    @Column(name="BED", nullable=false)
    public Blob getBed() {
        return this.bed;
    }
    
    public void setBed(Blob bed) {
        this.bed = bed;
    }
    
    @Column(name="FAM", nullable=false)
    public Blob getFam() {
        return this.fam;
    }
    
    public void setFam(Blob fam) {
        this.fam = fam;
    }
    
    @Column(name="BIM", nullable=false)
    public Blob getBim() {
        return this.bim;
    }
    
    public void setBim(Blob bim) {
        this.bim = bim;
    }
    
    @Column(name="DESCRIPTION", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DATE", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Column(name="NAME", unique=true, nullable=false, length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

