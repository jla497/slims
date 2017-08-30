package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblcleanplinkfiles generated by hbm2java
 */
@Entity
@Table(name="TBLCLEANPLINKFILES"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="NAME") 
)
public class Tblcleanplinkfiles  implements java.io.Serializable {


     private int id;
     private Blob bed;
     private Blob fam;
     private Blob bim;
     private String name;
     private String description;

    public Tblcleanplinkfiles() {
    }

    public Tblcleanplinkfiles(int id, Blob bed, Blob fam, Blob bim, String name, String description) {
       this.id = id;
       this.bed = bed;
       this.fam = fam;
       this.bim = bim;
       this.name = name;
       this.description = description;
    }
   
     @Id 
    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    @Column(name="NAME", unique=true, nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}

