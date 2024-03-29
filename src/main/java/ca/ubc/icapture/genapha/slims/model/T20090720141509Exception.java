package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T20090720141509Exception generated by hbm2java
 */
@Entity
@Table(name="T20090720_141509_EXCEPTION"
    ,schema="ALLERGEN"
)
public class T20090720141509Exception  implements java.io.Serializable {


     private T20090720141509ExceptionId id;

    public T20090720141509Exception() {
    }

    public T20090720141509Exception(T20090720141509ExceptionId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="containerid", column=@Column(name="CONTAINERID", nullable=false) ), 
        @AttributeOverride(name="row", column=@Column(name="ROW", nullable=false) ), 
        @AttributeOverride(name="column", column=@Column(name="COLUMN", nullable=false) ), 
        @AttributeOverride(name="sampleid", column=@Column(name="SAMPLEID", nullable=false) ), 
        @AttributeOverride(name="volume", column=@Column(name="VOLUME", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="concentration", column=@Column(name="CONCENTRATION", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="containercontentsid", column=@Column(name="CONTAINERCONTENTSID", nullable=false) ), 
        @AttributeOverride(name="parentid", column=@Column(name="PARENTID") ), 
        @AttributeOverride(name="valid", column=@Column(name="VALID", nullable=false) ), 
        @AttributeOverride(name="dilution", column=@Column(name="DILUTION", nullable=false, length=10) ), 
        @AttributeOverride(name="comments", column=@Column(name="COMMENTS", length=100) ), 
        @AttributeOverride(name="collectiondate", column=@Column(name="COLLECTIONDATE", length=10) ) } )
    public T20090720141509ExceptionId getId() {
        return this.id;
    }
    
    public void setId(T20090720141509ExceptionId id) {
        this.id = id;
    }




}


