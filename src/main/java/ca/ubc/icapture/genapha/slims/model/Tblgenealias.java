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
 * Tblgenealias generated by hbm2java
 */
@Entity
@Table(name="TBLGENEALIAS"
    ,schema="ALLERGEN"
)
public class Tblgenealias  implements java.io.Serializable {


     private TblgenealiasId id;
     private Tblgene tblgene;

    public Tblgenealias() {
    }

    public Tblgenealias(TblgenealiasId id, Tblgene tblgene) {
       this.id = id;
       this.tblgene = tblgene;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="geneid", column=@Column(name="GENEID", nullable=false) ), 
        @AttributeOverride(name="genealias", column=@Column(name="GENEALIAS", nullable=false, length=25) ) } )
    public TblgenealiasId getId() {
        return this.id;
    }
    
    public void setId(TblgenealiasId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GENEID", nullable=false, insertable=false, updatable=false)
    public Tblgene getTblgene() {
        return this.tblgene;
    }
    
    public void setTblgene(Tblgene tblgene) {
        this.tblgene = tblgene;
    }




}


