package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblshoppinglistcontainercontents generated by hbm2java
 */
@Entity
@Table(name="TBLSHOPPINGLISTCONTAINERCONTENTS"
    ,schema="ALLERGEN"
)
public class Tblshoppinglistcontainercontents  implements java.io.Serializable {


     private TblshoppinglistcontainercontentsId id;

    public Tblshoppinglistcontainercontents() {
    }

    public Tblshoppinglistcontainercontents(TblshoppinglistcontainercontentsId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="listid", column=@Column(name="LISTID", nullable=false) ), 
        @AttributeOverride(name="containercontentsid", column=@Column(name="CONTAINERCONTENTSID", nullable=false) ) } )
    public TblshoppinglistcontainercontentsId getId() {
        return this.id;
    }
    
    public void setId(TblshoppinglistcontainercontentsId id) {
        this.id = id;
    }




}


