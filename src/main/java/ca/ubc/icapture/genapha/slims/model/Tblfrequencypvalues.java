package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblfrequencypvalues generated by hbm2java
 */
@Entity
@Table(name="TBLFREQUENCYPVALUES"
    ,schema="ALLERGEN"
)
public class Tblfrequencypvalues  implements java.io.Serializable {


     private TblfrequencypvaluesId id;

    public Tblfrequencypvalues() {
    }

    public Tblfrequencypvalues(TblfrequencypvaluesId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="snpid", column=@Column(name="SNPID", nullable=false) ), 
        @AttributeOverride(name="cohortid1", column=@Column(name="COHORTID1", nullable=false) ), 
        @AttributeOverride(name="cohortid2", column=@Column(name="COHORTID2", nullable=false) ), 
        @AttributeOverride(name="pvalue", column=@Column(name="PVALUE", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="ethnicityid", column=@Column(name="ETHNICITYID", nullable=false) ), 
        @AttributeOverride(name="code", column=@Column(name="CODE", nullable=false) ) } )
    public TblfrequencypvaluesId getId() {
        return this.id;
    }
    
    public void setId(TblfrequencypvaluesId id) {
        this.id = id;
    }




}

