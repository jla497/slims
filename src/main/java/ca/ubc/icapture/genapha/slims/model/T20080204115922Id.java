package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T20080204115922Id generated by hbm2java
 */
@Embeddable
public class T20080204115922Id  implements java.io.Serializable {


     private long variableid;
     private String description;
     private String range;

    public T20080204115922Id() {
    }

    public T20080204115922Id(long variableid, String description, String range) {
       this.variableid = variableid;
       this.description = description;
       this.range = range;
    }
   

    @Column(name="VARIABLEID", nullable=false)
    public long getVariableid() {
        return this.variableid;
    }
    
    public void setVariableid(long variableid) {
        this.variableid = variableid;
    }

    @Column(name="DESCRIPTION", nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="RANGE", nullable=false, length=100)
    public String getRange() {
        return this.range;
    }
    
    public void setRange(String range) {
        this.range = range;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof T20080204115922Id) ) return false;
		 T20080204115922Id castOther = ( T20080204115922Id ) other; 
         
		 return (this.getVariableid()==castOther.getVariableid())
 && ( (this.getDescription()==castOther.getDescription()) || ( this.getDescription()!=null && castOther.getDescription()!=null && this.getDescription().equals(castOther.getDescription()) ) )
 && ( (this.getRange()==castOther.getRange()) || ( this.getRange()!=null && castOther.getRange()!=null && this.getRange().equals(castOther.getRange()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getVariableid();
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         result = 37 * result + ( getRange() == null ? 0 : this.getRange().hashCode() );
         return result;
   }   


}


