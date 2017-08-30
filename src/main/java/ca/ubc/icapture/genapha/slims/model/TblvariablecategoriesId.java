package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblvariablecategoriesId generated by hbm2java
 */
@Embeddable
public class TblvariablecategoriesId  implements java.io.Serializable {


     private long categoryid;
     private long variableid;

    public TblvariablecategoriesId() {
    }

    public TblvariablecategoriesId(long categoryid, long variableid) {
       this.categoryid = categoryid;
       this.variableid = variableid;
    }
   

    @Column(name="CATEGORYID", nullable=false)
    public long getCategoryid() {
        return this.categoryid;
    }
    
    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    @Column(name="VARIABLEID", nullable=false)
    public long getVariableid() {
        return this.variableid;
    }
    
    public void setVariableid(long variableid) {
        this.variableid = variableid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblvariablecategoriesId) ) return false;
		 TblvariablecategoriesId castOther = ( TblvariablecategoriesId ) other; 
         
		 return (this.getCategoryid()==castOther.getCategoryid())
 && (this.getVariableid()==castOther.getVariableid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getCategoryid();
         result = 37 * result + (int) this.getVariableid();
         return result;
   }   


}

