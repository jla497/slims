package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T20090115124106ExceptionId generated by hbm2java
 */
@Embeddable
public class T20090115124106ExceptionId  implements java.io.Serializable {


     private long sampleid;
     private long subjectid;
     private String name;
     private Short valid;
     private int numcalls;
     private String location;
     private int numnocalls;

    public T20090115124106ExceptionId() {
    }

	
    public T20090115124106ExceptionId(long sampleid, long subjectid, String name, int numcalls, String location, int numnocalls) {
        this.sampleid = sampleid;
        this.subjectid = subjectid;
        this.name = name;
        this.numcalls = numcalls;
        this.location = location;
        this.numnocalls = numnocalls;
    }
    public T20090115124106ExceptionId(long sampleid, long subjectid, String name, Short valid, int numcalls, String location, int numnocalls) {
       this.sampleid = sampleid;
       this.subjectid = subjectid;
       this.name = name;
       this.valid = valid;
       this.numcalls = numcalls;
       this.location = location;
       this.numnocalls = numnocalls;
    }
   

    @Column(name="SAMPLEID", nullable=false)
    public long getSampleid() {
        return this.sampleid;
    }
    
    public void setSampleid(long sampleid) {
        this.sampleid = sampleid;
    }

    @Column(name="SUBJECTID", nullable=false)
    public long getSubjectid() {
        return this.subjectid;
    }
    
    public void setSubjectid(long subjectid) {
        this.subjectid = subjectid;
    }

    @Column(name="NAME", nullable=false, length=25)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="VALID")
    public Short getValid() {
        return this.valid;
    }
    
    public void setValid(Short valid) {
        this.valid = valid;
    }

    @Column(name="NUMCALLS", nullable=false)
    public int getNumcalls() {
        return this.numcalls;
    }
    
    public void setNumcalls(int numcalls) {
        this.numcalls = numcalls;
    }

    @Column(name="LOCATION", nullable=false, length=100)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name="NUMNOCALLS", nullable=false)
    public int getNumnocalls() {
        return this.numnocalls;
    }
    
    public void setNumnocalls(int numnocalls) {
        this.numnocalls = numnocalls;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof T20090115124106ExceptionId) ) return false;
		 T20090115124106ExceptionId castOther = ( T20090115124106ExceptionId ) other; 
         
		 return (this.getSampleid()==castOther.getSampleid())
 && (this.getSubjectid()==castOther.getSubjectid())
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getValid()==castOther.getValid()) || ( this.getValid()!=null && castOther.getValid()!=null && this.getValid().equals(castOther.getValid()) ) )
 && (this.getNumcalls()==castOther.getNumcalls())
 && ( (this.getLocation()==castOther.getLocation()) || ( this.getLocation()!=null && castOther.getLocation()!=null && this.getLocation().equals(castOther.getLocation()) ) )
 && (this.getNumnocalls()==castOther.getNumnocalls());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getSampleid();
         result = 37 * result + (int) this.getSubjectid();
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getValid() == null ? 0 : this.getValid().hashCode() );
         result = 37 * result + this.getNumcalls();
         result = 37 * result + ( getLocation() == null ? 0 : this.getLocation().hashCode() );
         result = 37 * result + this.getNumnocalls();
         return result;
   }   


}

