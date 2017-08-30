package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblgenotypingcenters generated by hbm2java
 */
@Entity
@Table(name="TBLGENOTYPINGCENTERS"
    ,schema="ALLERGEN"
)
public class Tblgenotypingcenters  implements java.io.Serializable {


     private TblgenotypingcentersId id;

    public Tblgenotypingcenters() {
    }

    public Tblgenotypingcenters(TblgenotypingcentersId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="genotypinbgcenterid", column=@Column(name="GENOTYPINBGCENTERID", nullable=false) ), 
        @AttributeOverride(name="description", column=@Column(name="DESCRIPTION", nullable=false, length=25) ) } )
    public TblgenotypingcentersId getId() {
        return this.id;
    }
    
    public void setId(TblgenotypingcentersId id) {
        this.id = id;
    }




}


