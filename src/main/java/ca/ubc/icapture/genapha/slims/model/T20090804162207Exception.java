package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T20090804162207Exception generated by hbm2java
 */
@Entity
@Table(name="T20090804_162207_EXCEPTION"
    ,schema="ALLERGEN"
)
public class T20090804162207Exception  implements java.io.Serializable {


     private T20090804162207ExceptionId id;

    public T20090804162207Exception() {
    }

    public T20090804162207Exception(T20090804162207ExceptionId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="containertypeid", column=@Column(name="CONTAINERTYPEID", nullable=false) ), 
        @AttributeOverride(name="description", column=@Column(name="DESCRIPTION", nullable=false, length=100) ), 
        @AttributeOverride(name="rows", column=@Column(name="ROWS", nullable=false) ), 
        @AttributeOverride(name="columns", column=@Column(name="COLUMNS", nullable=false) ), 
        @AttributeOverride(name="sortorder", column=@Column(name="SORTORDER", nullable=false) ) } )
    public T20090804162207ExceptionId getId() {
        return this.id;
    }
    
    public void setId(T20090804162207ExceptionId id) {
        this.id = id;
    }




}


