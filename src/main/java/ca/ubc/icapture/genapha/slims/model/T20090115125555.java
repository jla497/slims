package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * T20090115125555 generated by hbm2java
 */
@Entity
@Table(name="T20090115_125555"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames={"NAME", "LOCATION"}) 
)
public class T20090115125555  implements java.io.Serializable {


     private T20090115125555Id id;

    public T20090115125555() {
    }

    public T20090115125555(T20090115125555Id id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="sampleid", column=@Column(name="SAMPLEID", nullable=false) ), 
        @AttributeOverride(name="subjectid", column=@Column(name="SUBJECTID", nullable=false) ), 
        @AttributeOverride(name="name", column=@Column(name="NAME", nullable=false, length=25) ), 
        @AttributeOverride(name="valid", column=@Column(name="VALID") ), 
        @AttributeOverride(name="numcalls", column=@Column(name="NUMCALLS") ), 
        @AttributeOverride(name="location", column=@Column(name="LOCATION", nullable=false, length=100) ), 
        @AttributeOverride(name="numnocalls", column=@Column(name="NUMNOCALLS") ), 
        @AttributeOverride(name="freezerlocation", column=@Column(name="FREEZERLOCATION", length=45) ), 
        @AttributeOverride(name="concentration", column=@Column(name="CONCENTRATION", precision=53, scale=0) ) } )
    public T20090115125555Id getId() {
        return this.id;
    }
    
    public void setId(T20090115125555Id id) {
        this.id = id;
    }




}


