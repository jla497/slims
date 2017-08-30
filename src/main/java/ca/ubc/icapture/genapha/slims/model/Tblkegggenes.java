package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblkegggenes generated by hbm2java
 */
@Entity
@Table(name="TBLKEGGGENES"
    ,schema="ALLERGEN"
)
public class Tblkegggenes  implements java.io.Serializable {


     private TblkegggenesId id;

    public Tblkegggenes() {
    }

    public Tblkegggenes(TblkegggenesId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="geneid", column=@Column(name="GENEID", nullable=false) ), 
        @AttributeOverride(name="ncbiid", column=@Column(name="NCBIID", nullable=false) ) } )
    public TblkegggenesId getId() {
        return this.id;
    }
    
    public void setId(TblkegggenesId id) {
        this.id = id;
    }




}

