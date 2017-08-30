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
 * Tblgenotypingrunsnpstatus generated by hbm2java
 */
@Entity
@Table(name="TBLGENOTYPINGRUNSNPSTATUS"
    ,schema="ALLERGEN"
)
public class Tblgenotypingrunsnpstatus  implements java.io.Serializable {


     private TblgenotypingrunsnpstatusId id;
     private Tblgenotypingruns tblgenotypingruns;
     private Tblsnp tblsnp;
     private short valid;
     private String strand;

    public Tblgenotypingrunsnpstatus() {
    }

    public Tblgenotypingrunsnpstatus(TblgenotypingrunsnpstatusId id, Tblgenotypingruns tblgenotypingruns, Tblsnp tblsnp, short valid, String strand) {
       this.id = id;
       this.tblgenotypingruns = tblgenotypingruns;
       this.tblsnp = tblsnp;
       this.valid = valid;
       this.strand = strand;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="genotypingrunid", column=@Column(name="GENOTYPINGRUNID", nullable=false) ), 
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ) } )
    public TblgenotypingrunsnpstatusId getId() {
        return this.id;
    }
    
    public void setId(TblgenotypingrunsnpstatusId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GENOTYPINGRUNID", nullable=false, insertable=false, updatable=false)
    public Tblgenotypingruns getTblgenotypingruns() {
        return this.tblgenotypingruns;
    }
    
    public void setTblgenotypingruns(Tblgenotypingruns tblgenotypingruns) {
        this.tblgenotypingruns = tblgenotypingruns;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SNPID", nullable=false, insertable=false, updatable=false)
    public Tblsnp getTblsnp() {
        return this.tblsnp;
    }
    
    public void setTblsnp(Tblsnp tblsnp) {
        this.tblsnp = tblsnp;
    }
    
    @Column(name="VALID", nullable=false)
    public short getValid() {
        return this.valid;
    }
    
    public void setValid(short valid) {
        this.valid = valid;
    }
    
    @Column(name="STRAND", nullable=false, length=1)
    public String getStrand() {
        return this.strand;
    }
    
    public void setStrand(String strand) {
        this.strand = strand;
    }




}


