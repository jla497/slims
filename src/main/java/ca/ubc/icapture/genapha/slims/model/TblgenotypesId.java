package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblgenotypesId generated by hbm2java
 */
@Embeddable
public class TblgenotypesId  implements java.io.Serializable {


     private int genotypeid;
     private int containercontentsid;
     private int genotypingrunid;
     private int snpid;
     private String allele1;
     private String allele2;

    public TblgenotypesId() {
    }

    public TblgenotypesId(int genotypeid, int containercontentsid, int genotypingrunid, int snpid, String allele1, String allele2) {
       this.genotypeid = genotypeid;
       this.containercontentsid = containercontentsid;
       this.genotypingrunid = genotypingrunid;
       this.snpid = snpid;
       this.allele1 = allele1;
       this.allele2 = allele2;
    }
   

    @Column(name="GENOTYPEID", nullable=false)
    public int getGenotypeid() {
        return this.genotypeid;
    }
    
    public void setGenotypeid(int genotypeid) {
        this.genotypeid = genotypeid;
    }

    @Column(name="CONTAINERCONTENTSID", nullable=false)
    public int getContainercontentsid() {
        return this.containercontentsid;
    }
    
    public void setContainercontentsid(int containercontentsid) {
        this.containercontentsid = containercontentsid;
    }

    @Column(name="GENOTYPINGRUNID", nullable=false)
    public int getGenotypingrunid() {
        return this.genotypingrunid;
    }
    
    public void setGenotypingrunid(int genotypingrunid) {
        this.genotypingrunid = genotypingrunid;
    }

    @Column(name="SNPID", nullable=false)
    public int getSnpid() {
        return this.snpid;
    }
    
    public void setSnpid(int snpid) {
        this.snpid = snpid;
    }

    @Column(name="ALLELE1", nullable=false, length=45)
    public String getAllele1() {
        return this.allele1;
    }
    
    public void setAllele1(String allele1) {
        this.allele1 = allele1;
    }

    @Column(name="ALLELE2", nullable=false, length=45)
    public String getAllele2() {
        return this.allele2;
    }
    
    public void setAllele2(String allele2) {
        this.allele2 = allele2;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TblgenotypesId) ) return false;
		 TblgenotypesId castOther = ( TblgenotypesId ) other; 
         
		 return (this.getGenotypeid()==castOther.getGenotypeid())
 && (this.getContainercontentsid()==castOther.getContainercontentsid())
 && (this.getGenotypingrunid()==castOther.getGenotypingrunid())
 && (this.getSnpid()==castOther.getSnpid())
 && ( (this.getAllele1()==castOther.getAllele1()) || ( this.getAllele1()!=null && castOther.getAllele1()!=null && this.getAllele1().equals(castOther.getAllele1()) ) )
 && ( (this.getAllele2()==castOther.getAllele2()) || ( this.getAllele2()!=null && castOther.getAllele2()!=null && this.getAllele2().equals(castOther.getAllele2()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getGenotypeid();
         result = 37 * result + this.getContainercontentsid();
         result = 37 * result + this.getGenotypingrunid();
         result = 37 * result + this.getSnpid();
         result = 37 * result + ( getAllele1() == null ? 0 : this.getAllele1().hashCode() );
         result = 37 * result + ( getAllele2() == null ? 0 : this.getAllele2().hashCode() );
         return result;
   }   


}

