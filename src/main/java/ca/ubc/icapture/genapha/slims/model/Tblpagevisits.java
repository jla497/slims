package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblpagevisits generated by hbm2java
 */
@Entity
@Table(name="TBLPAGEVISITS"
    ,schema="ALLERGEN"
)
public class Tblpagevisits  implements java.io.Serializable {


     private TblpagevisitsId id;

    public Tblpagevisits() {
    }

    public Tblpagevisits(TblpagevisitsId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="page", column=@Column(name="PAGE", nullable=false, length=50) ), 
        @AttributeOverride(name="user", column=@Column(name="USER", nullable=false, length=100) ), 
        @AttributeOverride(name="time", column=@Column(name="TIME", nullable=false, length=26) ) } )
    public TblpagevisitsId getId() {
        return this.id;
    }
    
    public void setId(TblpagevisitsId id) {
        this.id = id;
    }




}

