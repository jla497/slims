package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblsampleprocessing generated by hbm2java
 */
@Entity
@Table(name="TBLSAMPLEPROCESSING"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="DESCRIPTION") 
)
public class Tblsampleprocessing  implements java.io.Serializable {


     private int sampleprocessid;
     private String description;
     private int sortorder;
     private Set<Tblsamples> tblsampleses = new HashSet<Tblsamples>(0);

    public Tblsampleprocessing() {
    }

	
    public Tblsampleprocessing(int sampleprocessid, String description, int sortorder) {
        this.sampleprocessid = sampleprocessid;
        this.description = description;
        this.sortorder = sortorder;
    }
    public Tblsampleprocessing(int sampleprocessid, String description, int sortorder, Set<Tblsamples> tblsampleses) {
       this.sampleprocessid = sampleprocessid;
       this.description = description;
       this.sortorder = sortorder;
       this.tblsampleses = tblsampleses;
    }
   
     @Id 
    
    @Column(name="SAMPLEPROCESSID", unique=true, nullable=false)
    public int getSampleprocessid() {
        return this.sampleprocessid;
    }
    
    public void setSampleprocessid(int sampleprocessid) {
        this.sampleprocessid = sampleprocessid;
    }
    
    @Column(name="DESCRIPTION", unique=true, nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="SORTORDER", nullable=false)
    public int getSortorder() {
        return this.sortorder;
    }
    
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblsampleprocessing")
    public Set<Tblsamples> getTblsampleses() {
        return this.tblsampleses;
    }
    
    public void setTblsampleses(Set<Tblsamples> tblsampleses) {
        this.tblsampleses = tblsampleses;
    }




}


