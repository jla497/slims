package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblsubjectlogId generated by hbm2java
 */
@Embeddable
public class TblsubjectlogId  implements java.io.Serializable {


     private int subjectid;
     private int cohortid;
     private String id;
     private String familyid;
     private short gender;
     private short code;
     private short hasconsent;
     private String motherid;
     private String fatherid;
     private long ethnicityid;
     private short passedqc;
     private int numsamplescollected;
     private int createdBy;
     private Date created;
     private Integer modifiedBy;
     private Date modified;
     private Date updated;

    public TblsubjectlogId() {
    }

	
    public TblsubjectlogId(int subjectid, int cohortid, String id, String familyid, short gender, short code, short hasconsent, String motherid, String fatherid, long ethnicityid, short passedqc, int numsamplescollected, int createdBy, Date created, Date updated) {
        this.subjectid = subjectid;
        this.cohortid = cohortid;
        this.id = id;
        this.familyid = familyid;
        this.gender = gender;
        this.code = code;
        this.hasconsent = hasconsent;
        this.motherid = motherid;
        this.fatherid = fatherid;
        this.ethnicityid = ethnicityid;
        this.passedqc = passedqc;
        this.numsamplescollected = numsamplescollected;
        this.createdBy = createdBy;
        this.created = created;
        this.updated = updated;
    }
    public TblsubjectlogId(int subjectid, int cohortid, String id, String familyid, short gender, short code, short hasconsent, String motherid, String fatherid, long ethnicityid, short passedqc, int numsamplescollected, int createdBy, Date created, Integer modifiedBy, Date modified, Date updated) {
       this.subjectid = subjectid;
       this.cohortid = cohortid;
       this.id = id;
       this.familyid = familyid;
       this.gender = gender;
       this.code = code;
       this.hasconsent = hasconsent;
       this.motherid = motherid;
       this.fatherid = fatherid;
       this.ethnicityid = ethnicityid;
       this.passedqc = passedqc;
       this.numsamplescollected = numsamplescollected;
       this.createdBy = createdBy;
       this.created = created;
       this.modifiedBy = modifiedBy;
       this.modified = modified;
       this.updated = updated;
    }
   

    @Column(name="SUBJECTID", nullable=false)
    public int getSubjectid() {
        return this.subjectid;
    }
    
    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    @Column(name="COHORTID", nullable=false)
    public int getCohortid() {
        return this.cohortid;
    }
    
    public void setCohortid(int cohortid) {
        this.cohortid = cohortid;
    }

    @Column(name="ID", nullable=false, length=25)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    @Column(name="FAMILYID", nullable=false, length=25)
    public String getFamilyid() {
        return this.familyid;
    }
    
    public void setFamilyid(String familyid) {
        this.familyid = familyid;
    }

    @Column(name="GENDER", nullable=false)
    public short getGender() {
        return this.gender;
    }
    
    public void setGender(short gender) {
        this.gender = gender;
    }

    @Column(name="CODE", nullable=false)
    public short getCode() {
        return this.code;
    }
    
    public void setCode(short code) {
        this.code = code;
    }

    @Column(name="HASCONSENT", nullable=false)
    public short getHasconsent() {
        return this.hasconsent;
    }
    
    public void setHasconsent(short hasconsent) {
        this.hasconsent = hasconsent;
    }

    @Column(name="MOTHERID", nullable=false, length=25)
    public String getMotherid() {
        return this.motherid;
    }
    
    public void setMotherid(String motherid) {
        this.motherid = motherid;
    }

    @Column(name="FATHERID", nullable=false, length=25)
    public String getFatherid() {
        return this.fatherid;
    }
    
    public void setFatherid(String fatherid) {
        this.fatherid = fatherid;
    }

    @Column(name="ETHNICITYID", nullable=false)
    public long getEthnicityid() {
        return this.ethnicityid;
    }
    
    public void setEthnicityid(long ethnicityid) {
        this.ethnicityid = ethnicityid;
    }

    @Column(name="PASSEDQC", nullable=false)
    public short getPassedqc() {
        return this.passedqc;
    }
    
    public void setPassedqc(short passedqc) {
        this.passedqc = passedqc;
    }

    @Column(name="NUMSAMPLESCOLLECTED", nullable=false)
    public int getNumsamplescollected() {
        return this.numsamplescollected;
    }
    
    public void setNumsamplescollected(int numsamplescollected) {
        this.numsamplescollected = numsamplescollected;
    }

    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="CREATED", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name="MODIFIED_BY")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name="MODIFIED", length=26)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
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
		 if ( !(other instanceof TblsubjectlogId) ) return false;
		 TblsubjectlogId castOther = ( TblsubjectlogId ) other; 
         
		 return (this.getSubjectid()==castOther.getSubjectid())
 && (this.getCohortid()==castOther.getCohortid())
 && ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getFamilyid()==castOther.getFamilyid()) || ( this.getFamilyid()!=null && castOther.getFamilyid()!=null && this.getFamilyid().equals(castOther.getFamilyid()) ) )
 && (this.getGender()==castOther.getGender())
 && (this.getCode()==castOther.getCode())
 && (this.getHasconsent()==castOther.getHasconsent())
 && ( (this.getMotherid()==castOther.getMotherid()) || ( this.getMotherid()!=null && castOther.getMotherid()!=null && this.getMotherid().equals(castOther.getMotherid()) ) )
 && ( (this.getFatherid()==castOther.getFatherid()) || ( this.getFatherid()!=null && castOther.getFatherid()!=null && this.getFatherid().equals(castOther.getFatherid()) ) )
 && (this.getEthnicityid()==castOther.getEthnicityid())
 && (this.getPassedqc()==castOther.getPassedqc())
 && (this.getNumsamplescollected()==castOther.getNumsamplescollected())
 && (this.getCreatedBy()==castOther.getCreatedBy())
 && ( (this.getCreated()==castOther.getCreated()) || ( this.getCreated()!=null && castOther.getCreated()!=null && this.getCreated().equals(castOther.getCreated()) ) )
 && ( (this.getModifiedBy()==castOther.getModifiedBy()) || ( this.getModifiedBy()!=null && castOther.getModifiedBy()!=null && this.getModifiedBy().equals(castOther.getModifiedBy()) ) )
 && ( (this.getModified()==castOther.getModified()) || ( this.getModified()!=null && castOther.getModified()!=null && this.getModified().equals(castOther.getModified()) ) )
 && ( (this.getUpdated()==castOther.getUpdated()) || ( this.getUpdated()!=null && castOther.getUpdated()!=null && this.getUpdated().equals(castOther.getUpdated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSubjectid();
         result = 37 * result + this.getCohortid();
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getFamilyid() == null ? 0 : this.getFamilyid().hashCode() );
         result = 37 * result + this.getGender();
         result = 37 * result + this.getCode();
         result = 37 * result + this.getHasconsent();
         result = 37 * result + ( getMotherid() == null ? 0 : this.getMotherid().hashCode() );
         result = 37 * result + ( getFatherid() == null ? 0 : this.getFatherid().hashCode() );
         result = 37 * result + (int) this.getEthnicityid();
         result = 37 * result + this.getPassedqc();
         result = 37 * result + this.getNumsamplescollected();
         result = 37 * result + this.getCreatedBy();
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + ( getModifiedBy() == null ? 0 : this.getModifiedBy().hashCode() );
         result = 37 * result + ( getModified() == null ? 0 : this.getModified().hashCode() );
         result = 37 * result + ( getUpdated() == null ? 0 : this.getUpdated().hashCode() );
         return result;
   }   


}


