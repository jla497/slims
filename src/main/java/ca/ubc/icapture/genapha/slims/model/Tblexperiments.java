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
 * Tblexperiments generated by hbm2java
 */
@Entity
@Table(name="TBLEXPERIMENTS"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="NAME") 
)
public class Tblexperiments  implements java.io.Serializable {


     private long experimentid;
     private String name;
     private Set<Tblvalues> tblvalueses = new HashSet<Tblvalues>(0);

    public Tblexperiments() {
    }

	
    public Tblexperiments(long experimentid, String name) {
        this.experimentid = experimentid;
        this.name = name;
    }
    public Tblexperiments(long experimentid, String name, Set<Tblvalues> tblvalueses) {
       this.experimentid = experimentid;
       this.name = name;
       this.tblvalueses = tblvalueses;
    }
   
     @Id 
    
    @Column(name="EXPERIMENTID", unique=true, nullable=false)
    public long getExperimentid() {
        return this.experimentid;
    }
    
    public void setExperimentid(long experimentid) {
        this.experimentid = experimentid;
    }
    
    @Column(name="NAME", unique=true, nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblexperiments")
    public Set<Tblvalues> getTblvalueses() {
        return this.tblvalueses;
    }
    
    public void setTblvalueses(Set<Tblvalues> tblvalueses) {
        this.tblvalueses = tblvalueses;
    }




}


