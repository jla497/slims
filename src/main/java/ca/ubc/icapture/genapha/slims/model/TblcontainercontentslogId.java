package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblcontainercontentslogId generated by hbm2java
 */
@Embeddable
public class TblcontainercontentslogId  implements java.io.Serializable {


     private int containerid;
     private int row;
     private int column;
     private int sampleid;
     private double volume;
     private double concentration;
     private int containercontentsid;
     private int parentid;
     private short contaminated;
     private String dilution;
     private String comments;
     private Date created;
     private int createdBy;
     private Date modified;
     private Integer modifiedBy;
     private Date quantified;
     private Date updated;

    public TblcontainercontentslogId() {
    }

	
    public TblcontainercontentslogId(int containerid, int row, int column, int sampleid, double volume, double concentration, int containercontentsid, int parentid, short contaminated, String dilution, Date created, int createdBy, Date updated) {
        this.containerid = containerid;
        this.row = row;
        this.column = column;
        this.sampleid = sampleid;
        this.volume = volume;
        this.concentration = concentration;
        this.containercontentsid = containercontentsid;
        this.parentid = parentid;
        this.contaminated = contaminated;
        this.dilution = dilution;
        this.created = created;
        this.createdBy = createdBy;
        this.updated = updated;
    }
    public TblcontainercontentslogId(int containerid, int row, int column, int sampleid, double volume, double concentration, int containercontentsid, int parentid, short contaminated, String dilution, String comments, Date created, int createdBy, Date modified, Integer modifiedBy, Date quantified, Date updated) {
       this.containerid = containerid;
       this.row = row;
       this.column = column;
       this.sampleid = sampleid;
       this.volume = volume;
       this.concentration = concentration;
       this.containercontentsid = containercontentsid;
       this.parentid = parentid;
       this.contaminated = contaminated;
       this.dilution = dilution;
       this.comments = comments;
       this.created = created;
       this.createdBy = createdBy;
       this.modified = modified;
       this.modifiedBy = modifiedBy;
       this.quantified = quantified;
       this.updated = updated;
    }
   

    @Column(name="CONTAINERID", nullable=false)
    public int getContainerid() {
        return this.containerid;
    }
    
    public void setContainerid(int containerid) {
        this.containerid = containerid;
    }

    @Column(name="ROW", nullable=false)
    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }

    @Column(name="COLUMN", nullable=false)
    public int getColumn() {
        return this.column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }

    @Column(name="SAMPLEID", nullable=false)
    public int getSampleid() {
        return this.sampleid;
    }
    
    public void setSampleid(int sampleid) {
        this.sampleid = sampleid;
    }

    @Column(name="VOLUME", nullable=false, precision=53, scale=0)
    public double getVolume() {
        return this.volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Column(name="CONCENTRATION", nullable=false, precision=53, scale=0)
    public double getConcentration() {
        return this.concentration;
    }
    
    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    @Column(name="CONTAINERCONTENTSID", nullable=false)
    public int getContainercontentsid() {
        return this.containercontentsid;
    }
    
    public void setContainercontentsid(int containercontentsid) {
        this.containercontentsid = containercontentsid;
    }

    @Column(name="PARENTID", nullable=false)
    public int getParentid() {
        return this.parentid;
    }
    
    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    @Column(name="CONTAMINATED", nullable=false)
    public short getContaminated() {
        return this.contaminated;
    }
    
    public void setContaminated(short contaminated) {
        this.contaminated = contaminated;
    }

    @Column(name="DILUTION", nullable=false, length=10)
    public String getDilution() {
        return this.dilution;
    }
    
    public void setDilution(String dilution) {
        this.dilution = dilution;
    }

    @Column(name="COMMENTS", length=300)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name="CREATED", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="MODIFIED", length=26)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Column(name="MODIFIED_BY")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name="QUANTIFIED", length=10)
    public Date getQuantified() {
        return this.quantified;
    }
    
    public void setQuantified(Date quantified) {
        this.quantified = quantified;
    }

    @Column(name="UPDATED", nullable=false, length=26)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblcontainercontentslogId) ) return false;
		 TblcontainercontentslogId castOther = ( TblcontainercontentslogId ) other; 
         
		 return (this.getContainerid()==castOther.getContainerid())
 && (this.getRow()==castOther.getRow())
 && (this.getColumn()==castOther.getColumn())
 && (this.getSampleid()==castOther.getSampleid())
 && (this.getVolume()==castOther.getVolume())
 && (this.getConcentration()==castOther.getConcentration())
 && (this.getContainercontentsid()==castOther.getContainercontentsid())
 && (this.getParentid()==castOther.getParentid())
 && (this.getContaminated()==castOther.getContaminated())
 && ( (this.getDilution()==castOther.getDilution()) || ( this.getDilution()!=null && castOther.getDilution()!=null && this.getDilution().equals(castOther.getDilution()) ) )
 && ( (this.getComments()==castOther.getComments()) || ( this.getComments()!=null && castOther.getComments()!=null && this.getComments().equals(castOther.getComments()) ) )
 && ( (this.getCreated()==castOther.getCreated()) || ( this.getCreated()!=null && castOther.getCreated()!=null && this.getCreated().equals(castOther.getCreated()) ) )
 && (this.getCreatedBy()==castOther.getCreatedBy())
 && ( (this.getModified()==castOther.getModified()) || ( this.getModified()!=null && castOther.getModified()!=null && this.getModified().equals(castOther.getModified()) ) )
 && ( (this.getModifiedBy()==castOther.getModifiedBy()) || ( this.getModifiedBy()!=null && castOther.getModifiedBy()!=null && this.getModifiedBy().equals(castOther.getModifiedBy()) ) )
 && ( (this.getQuantified()==castOther.getQuantified()) || ( this.getQuantified()!=null && castOther.getQuantified()!=null && this.getQuantified().equals(castOther.getQuantified()) ) )
 && ( (this.getUpdated()==castOther.getUpdated()) || ( this.getUpdated()!=null && castOther.getUpdated()!=null && this.getUpdated().equals(castOther.getUpdated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getContainerid();
         result = 37 * result + this.getRow();
         result = 37 * result + this.getColumn();
         result = 37 * result + this.getSampleid();
         result = 37 * result + (int) this.getVolume();
         result = 37 * result + (int) this.getConcentration();
         result = 37 * result + this.getContainercontentsid();
         result = 37 * result + this.getParentid();
         result = 37 * result + this.getContaminated();
         result = 37 * result + ( getDilution() == null ? 0 : this.getDilution().hashCode() );
         result = 37 * result + ( getComments() == null ? 0 : this.getComments().hashCode() );
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + this.getCreatedBy();
         result = 37 * result + ( getModified() == null ? 0 : this.getModified().hashCode() );
         result = 37 * result + ( getModifiedBy() == null ? 0 : this.getModifiedBy().hashCode() );
         result = 37 * result + ( getQuantified() == null ? 0 : this.getQuantified().hashCode() );
         result = 37 * result + ( getUpdated() == null ? 0 : this.getUpdated().hashCode() );
         return result;
   }   


}


