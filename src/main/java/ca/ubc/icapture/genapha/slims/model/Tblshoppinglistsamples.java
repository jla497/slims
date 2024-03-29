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
 * Tblshoppinglistsamples generated by hbm2java
 */
@Entity
@Table(name="TBLSHOPPINGLISTSAMPLES"
    ,schema="ALLERGEN"
)
public class Tblshoppinglistsamples  implements java.io.Serializable {


     private TblshoppinglistsamplesId id;
     private Tblsamples tblsamples;

    public Tblshoppinglistsamples() {
    }

    public Tblshoppinglistsamples(TblshoppinglistsamplesId id, Tblsamples tblsamples) {
       this.id = id;
       this.tblsamples = tblsamples;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="listid", column=@Column(name="LISTID", nullable=false) ), 
        @AttributeOverride(name="sampleid", column=@Column(name="SAMPLEID", nullable=false) ) } )
    public TblshoppinglistsamplesId getId() {
        return this.id;
    }
    
    public void setId(TblshoppinglistsamplesId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SAMPLEID", nullable=false, insertable=false, updatable=false)
    public Tblsamples getTblsamples() {
        return this.tblsamples;
    }
    
    public void setTblsamples(Tblsamples tblsamples) {
        this.tblsamples = tblsamples;
    }




}


