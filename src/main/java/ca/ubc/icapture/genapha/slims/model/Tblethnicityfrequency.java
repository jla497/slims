package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import ca.ubc.icapture.genapha.slims.config.PreventAnyUdate;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tblethnicityfrequency generated by hbm2java
 */
@Entity
@EntityListeners(PreventAnyUdate.class)
@Table(name="TBLETHNICITYFREQUENCY"
    ,schema="ALLERGEN"
)
public class Tblethnicityfrequency  implements java.io.Serializable {

    
     private TblethnicityfrequencyId id;
     @JsonManagedReference
     private Tblethnicitylookup tblethnicitylookup;
     @JsonManagedReference
     private Tblcohortlookup tblcohortlookup;
     
     private Tblsnp tblsnp;
     private int n;

    public Tblethnicityfrequency() {
    }

    public Tblethnicityfrequency(TblethnicityfrequencyId id, Tblethnicitylookup tblethnicitylookup, Tblcohortlookup tblcohortlookup, Tblsnp tblsnp, int n) {
       this.id = id;
       this.tblethnicitylookup = tblethnicitylookup;
       this.tblcohortlookup = tblcohortlookup;
       this.tblsnp = tblsnp;
       this.n = n;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ), 
        @AttributeOverride(name="cohortid", column=@Column(name="COHORTID", nullable=false) ), 
        @AttributeOverride(name="ethnicityid", column=@Column(name="ETHNICITYID", nullable=false) ), 
        @AttributeOverride(name="code", column=@Column(name="CODE", nullable=false) ), 
        @AttributeOverride(name="allele", column=@Column(name="ALLELE", nullable=false, length=1) ) } )
    public TblethnicityfrequencyId getId() {
        return this.id;
    }
    
    public void setId(TblethnicityfrequencyId id) {
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
    
    @Column(name="N", nullable=false)
    public int getN() {
        return this.n;
    }
    
    public void setN(int n) {
        this.n = n;
    }




}


