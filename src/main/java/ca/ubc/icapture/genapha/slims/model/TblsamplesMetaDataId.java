package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblsamplesMetaDataId generated by hbm2java
 */
@Embeddable
public class TblsamplesMetaDataId  implements java.io.Serializable {


     private int sysid;
     private String propertyName;
     private String shortName;
     private String longName;
     private int viewColumnNumber;
     private int isSortable;
     private int isEditable;
     private int showInReports;
     private int createdBy;
     private Integer modifiedBy;
     private Date created;
     private Date modified;
     private String commentary;

    public TblsamplesMetaDataId() {
    }

	
    public TblsamplesMetaDataId(int sysid, String propertyName, String shortName, String longName, int viewColumnNumber, int isSortable, int isEditable, int showInReports, int createdBy, Date created) {
        this.sysid = sysid;
        this.propertyName = propertyName;
        this.shortName = shortName;
        this.longName = longName;
        this.viewColumnNumber = viewColumnNumber;
        this.isSortable = isSortable;
        this.isEditable = isEditable;
        this.showInReports = showInReports;
        this.createdBy = createdBy;
        this.created = created;
    }
    public TblsamplesMetaDataId(int sysid, String propertyName, String shortName, String longName, int viewColumnNumber, int isSortable, int isEditable, int showInReports, int createdBy, Integer modifiedBy, Date created, Date modified, String commentary) {
       this.sysid = sysid;
       this.propertyName = propertyName;
       this.shortName = shortName;
       this.longName = longName;
       this.viewColumnNumber = viewColumnNumber;
       this.isSortable = isSortable;
       this.isEditable = isEditable;
       this.showInReports = showInReports;
       this.createdBy = createdBy;
       this.modifiedBy = modifiedBy;
       this.created = created;
       this.modified = modified;
       this.commentary = commentary;
    }
   

    @Column(name="SYSID", nullable=false)
    public int getSysid() {
        return this.sysid;
    }
    
    public void setSysid(int sysid) {
        this.sysid = sysid;
    }

    @Column(name="PROPERTY_NAME", nullable=false, length=200)
    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Column(name="SHORT_NAME", nullable=false, length=200)
    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Column(name="LONG_NAME", nullable=false, length=200)
    public String getLongName() {
        return this.longName;
    }
    
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @Column(name="VIEW_COLUMN_NUMBER", nullable=false)
    public int getViewColumnNumber() {
        return this.viewColumnNumber;
    }
    
    public void setViewColumnNumber(int viewColumnNumber) {
        this.viewColumnNumber = viewColumnNumber;
    }

    @Column(name="IS_SORTABLE", nullable=false)
    public int getIsSortable() {
        return this.isSortable;
    }
    
    public void setIsSortable(int isSortable) {
        this.isSortable = isSortable;
    }

    @Column(name="IS_EDITABLE", nullable=false)
    public int getIsEditable() {
        return this.isEditable;
    }
    
    public void setIsEditable(int isEditable) {
        this.isEditable = isEditable;
    }

    @Column(name="SHOW_IN_REPORTS", nullable=false)
    public int getShowInReports() {
        return this.showInReports;
    }
    
    public void setShowInReports(int showInReports) {
        this.showInReports = showInReports;
    }

    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="MODIFIED_BY")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name="CREATED", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name="MODIFIED", length=26)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Column(name="COMMENTARY")
    public String getCommentary() {
        return this.commentary;
    }
    
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblsamplesMetaDataId) ) return false;
		 TblsamplesMetaDataId castOther = ( TblsamplesMetaDataId ) other; 
         
		 return (this.getSysid()==castOther.getSysid())
 && ( (this.getPropertyName()==castOther.getPropertyName()) || ( this.getPropertyName()!=null && castOther.getPropertyName()!=null && this.getPropertyName().equals(castOther.getPropertyName()) ) )
 && ( (this.getShortName()==castOther.getShortName()) || ( this.getShortName()!=null && castOther.getShortName()!=null && this.getShortName().equals(castOther.getShortName()) ) )
 && ( (this.getLongName()==castOther.getLongName()) || ( this.getLongName()!=null && castOther.getLongName()!=null && this.getLongName().equals(castOther.getLongName()) ) )
 && (this.getViewColumnNumber()==castOther.getViewColumnNumber())
 && (this.getIsSortable()==castOther.getIsSortable())
 && (this.getIsEditable()==castOther.getIsEditable())
 && (this.getShowInReports()==castOther.getShowInReports())
 && (this.getCreatedBy()==castOther.getCreatedBy())
 && ( (this.getModifiedBy()==castOther.getModifiedBy()) || ( this.getModifiedBy()!=null && castOther.getModifiedBy()!=null && this.getModifiedBy().equals(castOther.getModifiedBy()) ) )
 && ( (this.getCreated()==castOther.getCreated()) || ( this.getCreated()!=null && castOther.getCreated()!=null && this.getCreated().equals(castOther.getCreated()) ) )
 && ( (this.getModified()==castOther.getModified()) || ( this.getModified()!=null && castOther.getModified()!=null && this.getModified().equals(castOther.getModified()) ) )
 && ( (this.getCommentary()==castOther.getCommentary()) || ( this.getCommentary()!=null && castOther.getCommentary()!=null && this.getCommentary().equals(castOther.getCommentary()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSysid();
         result = 37 * result + ( getPropertyName() == null ? 0 : this.getPropertyName().hashCode() );
         result = 37 * result + ( getShortName() == null ? 0 : this.getShortName().hashCode() );
         result = 37 * result + ( getLongName() == null ? 0 : this.getLongName().hashCode() );
         result = 37 * result + this.getViewColumnNumber();
         result = 37 * result + this.getIsSortable();
         result = 37 * result + this.getIsEditable();
         result = 37 * result + this.getShowInReports();
         result = 37 * result + this.getCreatedBy();
         result = 37 * result + ( getModifiedBy() == null ? 0 : this.getModifiedBy().hashCode() );
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + ( getModified() == null ? 0 : this.getModified().hashCode() );
         result = 37 * result + ( getCommentary() == null ? 0 : this.getCommentary().hashCode() );
         return result;
   }   


}


