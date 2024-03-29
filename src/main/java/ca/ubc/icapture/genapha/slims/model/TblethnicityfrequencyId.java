package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblethnicityfrequencyId generated by hbm2java
 */
@Embeddable
public class TblethnicityfrequencyId  implements java.io.Serializable {


     private int snpid;
     private int cohortid;
     private int ethnicityid;
     private int code;
     private String allele;

    public TblethnicityfrequencyId() {
    }

    public TblethnicityfrequencyId(int snpid, int cohortid, int ethnicityid, int code, String allele) {
       this.snpid = snpid;
       this.cohortid = cohortid;
       this.ethnicityid = ethnicityid;
       this.code = code;
       this.allele = allele;
    }
   

    @Column(name="SNPID", nullable=false)
    public int getSnpid() {
        return this.snpid;
    }
    
    public void setSnpid(int snpid) {
        this.snpid = snpid;
    }

    @Column(name="COHORTID", nullable=false)
    public int getCohortid() {
        return this.cohortid;
    }
    
    public void setCohortid(int cohortid) {
        this.cohortid = cohortid;
    }

    @Column(name="ETHNICITYID", nullable=false)
    public int getEthnicityid() {
        return this.ethnicityid;
    }
    
    public void setEthnicityid(int ethnicityid) {
        this.ethnicityid = ethnicityid;
    }

    @Column(name="CODE", nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

    @Column(name="ALLELE", nullable=false, length=1)
    public String getAllele() {
        return this.allele;
    }
    
    public void setAllele(String allele) {
        this.allele = allele;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblethnicityfrequencyId) ) return false;
		 TblethnicityfrequencyId castOther = ( TblethnicityfrequencyId ) other; 
         
		 return (this.getSnpid()==castOther.getSnpid())
 && (this.getCohortid()==castOther.getCohortid())
 && (this.getEthnicityid()==castOther.getEthnicityid())
 && (this.getCode()==castOther.getCode())
 && ( (this.getAllele()==castOther.getAllele()) || ( this.getAllele()!=null && castOther.getAllele()!=null && this.getAllele().equals(castOther.getAllele()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSnpid();
         result = 37 * result + this.getCohortid();
         result = 37 * result + this.getEthnicityid();
         result = 37 * result + this.getCode();
         result = 37 * result + ( getAllele() == null ? 0 : this.getAllele().hashCode() );
         return result;
   }   


}


