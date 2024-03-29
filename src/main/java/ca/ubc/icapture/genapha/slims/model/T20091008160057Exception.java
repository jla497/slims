package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T20091008160057Exception generated by hbm2java
 */
@Entity
@Table(name="T20091008_160057_EXCEPTION"
    ,schema="ALLERGEN"
)
public class T20091008160057Exception  implements java.io.Serializable {


     private T20091008160057ExceptionId id;

    public T20091008160057Exception() {
    }

    public T20091008160057Exception(T20091008160057ExceptionId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="containerid", column=@Column(name="CONTAINERID", nullable=false) ), 
        @AttributeOverride(name="containertypeid", column=@Column(name="CONTAINERTYPEID", nullable=false) ), 
        @AttributeOverride(name="containername", column=@Column(name="CONTAINERNAME", nullable=false, length=100) ), 
        @AttributeOverride(name="freezerid", column=@Column(name="FREEZERID") ), 
        @AttributeOverride(name="shelf", column=@Column(name="SHELF") ), 
        @AttributeOverride(name="discarded", column=@Column(name="DISCARDED", nullable=false) ), 
        @AttributeOverride(name="shippedout", column=@Column(name="SHIPPEDOUT", nullable=false) ), 
        @AttributeOverride(name="shippeddate", column=@Column(name="SHIPPEDDATE", length=10) ), 
        @AttributeOverride(name="shippedtoid", column=@Column(name="SHIPPEDTOID") ), 
        @AttributeOverride(name="comments", column=@Column(name="COMMENTS", length=100) ), 
        @AttributeOverride(name="stock", column=@Column(name="STOCK") ), 
        @AttributeOverride(name="materialtypeid", column=@Column(name="MATERIALTYPEID", nullable=false) ), 
        @AttributeOverride(name="created", column=@Column(name="CREATED", nullable=false, length=26) ), 
        @AttributeOverride(name="createdBy", column=@Column(name="CREATED_BY", nullable=false) ), 
        @AttributeOverride(name="modified", column=@Column(name="MODIFIED", length=26) ), 
        @AttributeOverride(name="modifiedBy", column=@Column(name="MODIFIED_BY") ), 
        @AttributeOverride(name="valid", column=@Column(name="VALID", nullable=false) ), 
        @AttributeOverride(name="containeralias", column=@Column(name="CONTAINERALIAS", length=100) ), 
        @AttributeOverride(name="date", column=@Column(name="DATE", length=10) ), 
        @AttributeOverride(name="initials", column=@Column(name="INITIALS", length=30) ), 
        @AttributeOverride(name="lot", column=@Column(name="LOT", nullable=false) ) } )
    public T20091008160057ExceptionId getId() {
        return this.id;
    }
    
    public void setId(T20091008160057ExceptionId id) {
        this.id = id;
    }




}


