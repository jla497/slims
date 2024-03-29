package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblshoppinglistsubjectsId generated by hbm2java
 */
@Embeddable
public class TblshoppinglistsubjectsId  implements java.io.Serializable {


     private int listid;
     private int subjectid;

    public TblshoppinglistsubjectsId() {
    }

    public TblshoppinglistsubjectsId(int listid, int subjectid) {
       this.listid = listid;
       this.subjectid = subjectid;
    }
   

    @Column(name="LISTID", nullable=false)
    public int getListid() {
        return this.listid;
    }
    
    public void setListid(int listid) {
        this.listid = listid;
    }

    @Column(name="SUBJECTID", nullable=false)
    public int getSubjectid() {
        return this.subjectid;
    }
    
    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblshoppinglistsubjectsId) ) return false;
		 TblshoppinglistsubjectsId castOther = ( TblshoppinglistsubjectsId ) other; 
         
		 return (this.getListid()==castOther.getListid())
 && (this.getSubjectid()==castOther.getSubjectid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getListid();
         result = 37 * result + this.getSubjectid();
         return result;
   }   


}


