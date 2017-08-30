package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblsubjectpopulationId generated by hbm2java
 */
@Embeddable
public class TblsubjectpopulationId  implements java.io.Serializable {


     private long subjectid;
     private long cohortpopulationid;

    public TblsubjectpopulationId() {
    }

    public TblsubjectpopulationId(long subjectid, long cohortpopulationid) {
       this.subjectid = subjectid;
       this.cohortpopulationid = cohortpopulationid;
    }
   

    @Column(name="SUBJECTID", nullable=false)
    public long getSubjectid() {
        return this.subjectid;
    }
    
    public void setSubjectid(long subjectid) {
        this.subjectid = subjectid;
    }

    @Column(name="COHORTPOPULATIONID", nullable=false)
    public long getCohortpopulationid() {
        return this.cohortpopulationid;
    }
    
    public void setCohortpopulationid(long cohortpopulationid) {
        this.cohortpopulationid = cohortpopulationid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblsubjectpopulationId) ) return false;
		 TblsubjectpopulationId castOther = ( TblsubjectpopulationId ) other; 
         
		 return (this.getSubjectid()==castOther.getSubjectid())
 && (this.getCohortpopulationid()==castOther.getCohortpopulationid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getSubjectid();
         result = 37 * result + (int) this.getCohortpopulationid();
         return result;
   }   


}


