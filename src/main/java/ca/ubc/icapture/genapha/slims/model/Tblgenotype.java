package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


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
 * Tblgenotype generated by hbm2java
 */
@Entity
@Table(name="TBLGENOTYPE"
    ,schema="ALLERGEN"
)
public class Tblgenotype  implements java.io.Serializable {


     private TblgenotypeId id;
     private Tblsnp tblsnp;
     private String allele1;
     private String allele2;

    public Tblgenotype() {
    }

    public Tblgenotype(TblgenotypeId id, Tblsnp tblsnp, String allele1, String allele2) {
       this.id = id;
       this.tblsnp = tblsnp;
       this.allele1 = allele1;
       this.allele2 = allele2;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="sampleid", column=@Column(name="SAMPLEID", nullable=false) ), 
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ) } )
    public TblgenotypeId getId() {
        return this.id;
    }
    
    public void setId(TblgenotypeId id) {
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

