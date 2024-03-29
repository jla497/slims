package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblfrequencies generated by hbm2java
 */
@Entity
@Table(name="TBLFREQUENCIES"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames={"COHORTID", "ETHNICITYID", "SNPID", "ALELLE"}) 
)
public class Tblfrequencies  implements java.io.Serializable {


     private TblfrequenciesId id;
     @JsonManagedReference
     private Tblethnicitylookup tblethnicitylookup;
      @JsonManagedReference
     private Tblcohortlookup tblcohortlookup;
     private Tblsnp tblsnp;

    public Tblfrequencies() {
    }

    public Tblfrequencies(TblfrequenciesId id, Tblethnicitylookup tblethnicitylookup, Tblcohortlookup tblcohortlookup, Tblsnp tblsnp) {
       this.id = id;
       this.tblethnicitylookup = tblethnicitylookup;
       this.tblcohortlookup = tblcohortlookup;
       this.tblsnp = tblsnp;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="cohortid", column=@Column(name="COHORTID", nullable=false) ), 
        @AttributeOverride(name="ethnicityid", column=@Column(name="ETHNICITYID", nullable=false) ), 
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ), 
        @AttributeOverride(name="freq", column=@Column(name="FREQ", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="hw", column=@Column(name="HW", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="freqParent", column=@Column(name="FREQ_PARENT", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="hwParent", column=@Column(name="HW_PARENT", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="alelle", column=@Column(name="ALELLE", nullable=false, length=1) ) } )
    public TblfrequenciesId getId() {
        return this.id;
    }
    
    public void setId(TblfrequenciesId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ETHNICITYID", nullable=false, insertable=false, updatable=false)
    public Tblethnicitylookup getTblethnicitylookup() {
        return this.tblethnicitylookup;
    }
    
    public void setTblethnicitylookup(Tblethnicitylookup tblethnicitylookup) {
        this.tblethnicitylookup = tblethnicitylookup;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COHORTID", nullable=false, insertable=false, updatable=false)
    public Tblcohortlookup getTblcohortlookup() {
        return this.tblcohortlookup;
    }
    
    public void setTblcohortlookup(Tblcohortlookup tblcohortlookup) {
        this.tblcohortlookup = tblcohortlookup;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SNPID", nullable=false, insertable=false, updatable=false)
    public Tblsnp getTblsnp() {
        return this.tblsnp;
    }
    
    public void setTblsnp(Tblsnp tblsnp) {
        this.tblsnp = tblsnp;
    }




}


