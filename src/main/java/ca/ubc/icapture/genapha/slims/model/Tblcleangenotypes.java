package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tblcleangenotypes generated by hbm2java
 */
@Entity
@Table(name="TBLCLEANGENOTYPES"
    ,schema="ALLERGEN"
)
public class Tblcleangenotypes  implements java.io.Serializable {


     private TblcleangenotypesId id;
     private Tblsnp tblsnp;
     @JsonIgnoreProperties("tblcleangenotypeses")
     private Tblsubject tblsubject;
     private String allele1;
     private String allele2;

    public Tblcleangenotypes() {
    }

    public Tblcleangenotypes(TblcleangenotypesId id, Tblsnp tblsnp, Tblsubject tblsubject, String allele1, String allele2) {
       this.id = id;
       this.tblsnp = tblsnp;
       this.tblsubject = tblsubject;
       this.allele1 = allele1;
       this.allele2 = allele2;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="subjectid", column=@Column(name="SUBJECTID", nullable=false) ), 
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ) } )
    public TblcleangenotypesId getId() {
        return this.id;
    }
    
    public void setId(TblcleangenotypesId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SNPID", nullable=false, insertable=false, updatable=false)
    public Tblsnp getTblsnp() {
        return this.tblsnp;
    }
    
    public void setTblsnp(Tblsnp tblsnp) {
        this.tblsnp = tblsnp;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SUBJECTID", nullable=false, insertable=false, updatable=false)
    public Tblsubject getTblsubject() {
        return this.tblsubject;
    }
    
    public void setTblsubject(Tblsubject tblsubject) {
        this.tblsubject = tblsubject;
    }
    
    @Column(name="ALLELE1", nullable=false, length=1)
    public String getAllele1() {
        return this.allele1;
    }
    
    public void setAllele1(String allele1) {
        this.allele1 = allele1;
    }
    
    @Column(name="ALLELE2", nullable=false, length=1)
    public String getAllele2() {
        return this.allele2;
    }
    
    public void setAllele2(String allele2) {
        this.allele2 = allele2;
    }




}


