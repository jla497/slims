package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblfrequencypvaluesId generated by hbm2java
 */
@Embeddable
public class TblfrequencypvaluesId  implements java.io.Serializable {


     private int snpid;
     private int cohortid1;
     private int cohortid2;
     private double pvalue;
     private int ethnicityid;
     private int code;

    public TblfrequencypvaluesId() {
    }

    public TblfrequencypvaluesId(int snpid, int cohortid1, int cohortid2, double pvalue, int ethnicityid, int code) {
       this.snpid = snpid;
       this.cohortid1 = cohortid1;
       this.cohortid2 = cohortid2;
       this.pvalue = pvalue;
       this.ethnicityid = ethnicityid;
       this.code = code;
    }
   

    @Column(name="SNPID", nullable=false)
    public int getSnpid() {
        return this.snpid;
    }
    
    public void setSnpid(int snpid) {
        this.snpid = snpid;
    }

    @Column(name="COHORTID1", nullable=false)
    public int getCohortid1() {
        return this.cohortid1;
    }
    
    public void setCohortid1(int cohortid1) {
        this.cohortid1 = cohortid1;
    }

    @Column(name="COHORTID2", nullable=false)
    public int getCohortid2() {
        return this.cohortid2;
    }
    
    public void setCohortid2(int cohortid2) {
        this.cohortid2 = cohortid2;
    }

    @Column(name="PVALUE", nullable=false, precision=53, scale=0)
    public double getPvalue() {
        return this.pvalue;
    }
    
    public void setPvalue(double pvalue) {
        this.pvalue = pvalue;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblfrequencypvaluesId) ) return false;
		 TblfrequencypvaluesId castOther = ( TblfrequencypvaluesId ) other; 
         
		 return (this.getSnpid()==castOther.getSnpid())
 && (this.getCohortid1()==castOther.getCohortid1())
 && (this.getCohortid2()==castOther.getCohortid2())
 && (this.getPvalue()==castOther.getPvalue())
 && (this.getEthnicityid()==castOther.getEthnicityid())
 && (this.getCode()==castOther.getCode());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSnpid();
         result = 37 * result + this.getCohortid1();
         result = 37 * result + this.getCohortid2();
         result = 37 * result + (int) this.getPvalue();
         result = 37 * result + this.getEthnicityid();
         result = 37 * result + this.getCode();
         return result;
   }   


}


