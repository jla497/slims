package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblvariablecategories generated by hbm2java
 */
@Entity
@Table(name="TBLVARIABLECATEGORIES"
    ,schema="ALLERGEN"
)
public class Tblvariablecategories  implements java.io.Serializable {


     private TblvariablecategoriesId id;

    public Tblvariablecategories() {
    }

    public Tblvariablecategories(TblvariablecategoriesId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="categoryid", column=@Column(name="CATEGORYID", nullable=false) ), 
        @AttributeOverride(name="variableid", column=@Column(name="VARIABLEID", nullable=false) ) } )
    public TblvariablecategoriesId getId() {
        return this.id;
    }
    
    public void setId(TblvariablecategoriesId id) {
        this.id = id;
    }




}


