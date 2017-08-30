package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T20090814125237ExceptionId generated by hbm2java
 */
@Embeddable
public class T20090814125237ExceptionId  implements java.io.Serializable {


     private int containerid;
     private int row;
     private int column;
     private int sampleid;
     private double volume;
     private double concentration;
     private int containercontentsid;
     private int parentid;
     private short valid;
     private String dilution;
     private String comments;

    public T20090814125237ExceptionId() {
    }

	
    public T20090814125237ExceptionId(int containerid, int row, int column, int sampleid, double volume, double concentration, int containercontentsid, int parentid, short valid, String dilution) {
        this.containerid = containerid;
        this.row = row;
        this.column = column;
        this.sampleid = sampleid;
        this.volume = volume;
        this.concentration = concentration;
        this.containercontentsid = containercontentsid;
        this.parentid = parentid;
        this.valid = valid;
        this.dilution = dilution;
    }
    public T20090814125237ExceptionId(int containerid, int row, int column, int sampleid, double volume, double concentration, int containercontentsid, int parentid, short valid, String dilution, String comments) {
       this.containerid = containerid;
       this.row = row;
       this.column = column;
       this.sampleid = sampleid;
       this.volume = volume;
       this.concentration = concentration;
       this.containercontentsid = containercontentsid;
       this.parentid = parentid;
       this.valid = valid;
       this.dilution = dilution;
       this.comments = comments;
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

    @Column(name="VALID", nullable=false)
    public short getValid() {
        return this.valid;
    }
    
    public void setValid(short valid) {
        this.valid = valid;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof T20090814125237ExceptionId) ) return false;
		 T20090814125237ExceptionId castOther = ( T20090814125237ExceptionId ) other; 
         
		 return (this.getContainerid()==castOther.getContainerid())
 && (this.getRow()==castOther.getRow())
 && (this.getColumn()==castOther.getColumn())
 && (this.getSampleid()==castOther.getSampleid())
 && (this.getVolume()==castOther.getVolume())
 && (this.getConcentration()==castOther.getConcentration())
 && (this.getContainercontentsid()==castOther.getContainercontentsid())
 && (this.getParentid()==castOther.getParentid())
 && (this.getValid()==castOther.getValid())
 && ( (this.getDilution()==castOther.getDilution()) || ( this.getDilution()!=null && castOther.getDilution()!=null && this.getDilution().equals(castOther.getDilution()) ) )
 && ( (this.getComments()==castOther.getComments()) || ( this.getComments()!=null && castOther.getComments()!=null && this.getComments().equals(castOther.getComments()) ) );
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
         result = 37 * result + this.getValid();
         result = 37 * result + ( getDilution() == null ? 0 : this.getDilution().hashCode() );
         result = 37 * result + ( getComments() == null ? 0 : this.getComments().hashCode() );
         return result;
   }   


}


