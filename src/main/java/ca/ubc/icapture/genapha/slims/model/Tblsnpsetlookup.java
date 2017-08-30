package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblsnpsetlookup generated by hbm2java
 */
@Entity
@Table(name="TBLSNPSETLOOKUP"
    ,schema="ALLERGEN"
)
public class Tblsnpsetlookup  implements java.io.Serializable {


     private long snpsetid;
     private String name;
     private Set<Tblsnp> tblsnps = new HashSet<Tblsnp>(0);

    public Tblsnpsetlookup() {
    }

	
    public Tblsnpsetlookup(long snpsetid, String name) {
        this.snpsetid = snpsetid;
        this.name = name;
    }
    public Tblsnpsetlookup(long snpsetid, String name, Set<Tblsnp> tblsnps) {
       this.snpsetid = snpsetid;
       this.name = name;
       this.tblsnps = tblsnps;
    }
   
     @Id 
    
    @Column(name="SNPSETID", unique=true, nullable=false)
    public long getSnpsetid() {
        return this.snpsetid;
    }
    
    public void setSnpsetid(long snpsetid) {
        this.snpsetid = snpsetid;
    }
    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="TBLSNPSET", schema="ALLERGEN", uniqueConstraints=@UniqueConstraint(columnNames={"SNPSETID", "SNPID"}), joinColumns = { 
        @JoinColumn(name="SNPSETID", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="SNPID", nullable=false, updatable=false) })
    public Set<Tblsnp> getTblsnps() {
        return this.tblsnps;
    }
    
    public void setTblsnps(Set<Tblsnp> tblsnps) {
        this.tblsnps = tblsnps;
    }




}

