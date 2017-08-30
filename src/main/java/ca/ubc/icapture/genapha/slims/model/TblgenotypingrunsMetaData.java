package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TblgenotypingrunsMetaData generated by hbm2java
 */
@Entity
@Table(name="TBLGENOTYPINGRUNS_META_DATA"
    ,schema="ALLERGEN"
)
public class TblgenotypingrunsMetaData  implements java.io.Serializable {


     private TblgenotypingrunsMetaDataId id;

    public TblgenotypingrunsMetaData() {
    }

    public TblgenotypingrunsMetaData(TblgenotypingrunsMetaDataId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="sysid", column=@Column(name="SYSID", nullable=false) ), 
        @AttributeOverride(name="propertyName", column=@Column(name="PROPERTY_NAME", nullable=false, length=200) ), 
        @AttributeOverride(name="shortName", column=@Column(name="SHORT_NAME", nullable=false, length=200) ), 
        @AttributeOverride(name="longName", column=@Column(name="LONG_NAME", nullable=false, length=200) ), 
        @AttributeOverride(name="viewColumnNumber", column=@Column(name="VIEW_COLUMN_NUMBER", nullable=false) ), 
        @AttributeOverride(name="isSortable", column=@Column(name="IS_SORTABLE", nullable=false) ), 
        @AttributeOverride(name="isEditable", column=@Column(name="IS_EDITABLE", nullable=false) ), 
        @AttributeOverride(name="showInReports", column=@Column(name="SHOW_IN_REPORTS", nullable=false) ), 
        @AttributeOverride(name="createdBy", column=@Column(name="CREATED_BY", nullable=false) ), 
        @AttributeOverride(name="modifiedBy", column=@Column(name="MODIFIED_BY") ), 
        @AttributeOverride(name="created", column=@Column(name="CREATED", nullable=false, length=26) ), 
        @AttributeOverride(name="modified", column=@Column(name="MODIFIED", length=26) ), 
        @AttributeOverride(name="commentary", column=@Column(name="COMMENTARY") ) } )
    public TblgenotypingrunsMetaDataId getId() {
        return this.id;
    }
    
    public void setId(TblgenotypingrunsMetaDataId id) {
        this.id = id;
    }




}


