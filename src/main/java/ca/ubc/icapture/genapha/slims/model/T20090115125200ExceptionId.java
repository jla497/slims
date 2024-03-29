package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T20090115125200ExceptionId generated by hbm2java
 */
@Embeddable
public class T20090115125200ExceptionId  implements java.io.Serializable {


     private long sampleid;
     private long subjectid;
     private String name;
     private Short valid;
     private Integer numcalls;
     private String location;
     private Integer numnocalls;
     private String freezerlocation;
     private Double concentration;

    public T20090115125200ExceptionId() {
    }

	
    public T20090115125200ExceptionId(long sampleid, long subjectid, String name, String location) {
        this.sampleid = sampleid;
        this.subjectid = subjectid;
        this.name = name;
        this.location = location;
    }
    public T20090115125200ExceptionId(long sampleid, long subjectid, String name, Short valid, Integer numcalls, String location, Integer numnocalls, String freezerlocation, Double concentration) {
       this.sampleid = sampleid;
       this.subjectid = subjectid;
       this.name = name;
       this.valid = valid;
       this.numcalls = numcalls;
       this.location = location;
       this.numnocalls = numnocalls;
       this.freezerlocation = freezerlocation;
       this.concentration = concentration;
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

    @Column(name="NUMCALLS")
    public Integer getNumcalls() {
        return this.numcalls;
    }
    
    public void setNumcalls(Integer numcalls) {
        this.numcalls = numcalls;
    }

    @Column(name="LOCATION", nullable=false, length=100)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name="NUMNOCALLS")
    public Integer getNumnocalls() {
        return this.numnocalls;
    }
    
    public void setNumnocalls(Integer numnocalls) {
        this.numnocalls = numnocalls;
    }

    @Column(name="FREEZERLOCATION", length=45)
    public String getFreezerlocation() {
        return this.freezerlocation;
    }
    
    public void setFreezerlocation(String freezerlocation) {
        this.freezerlocation = freezerlocation;
    }

    @Column(name="CONCENTRATION", precision=53, scale=0)
    public Double getConcentration() {
        return this.concentration;
    }
    
    public void setConcentration(Double concentration) {
        this.concentration = concentration;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof T20090115125200ExceptionId) ) return false;
		 T20090115125200ExceptionId castOther = ( T20090115125200ExceptionId ) other; 
         
		 return (this.getSampleid()==castOther.getSampleid())
 && (this.getSubjectid()==castOther.getSubjectid())
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getValid()==castOther.getValid()) || ( this.getValid()!=null && castOther.getValid()!=null && this.getValid().equals(castOther.getValid()) ) )
 && ( (this.getNumcalls()==castOther.getNumcalls()) || ( this.getNumcalls()!=null && castOther.getNumcalls()!=null && this.getNumcalls().equals(castOther.getNumcalls()) ) )
 && ( (this.getLocation()==castOther.getLocation()) || ( this.getLocation()!=null && castOther.getLocation()!=null && this.getLocation().equals(castOther.getLocation()) ) )
 && ( (this.getNumnocalls()==castOther.getNumnocalls()) || ( this.getNumnocalls()!=null && castOther.getNumnocalls()!=null && this.getNumnocalls().equals(castOther.getNumnocalls()) ) )
 && ( (this.getFreezerlocation()==castOther.getFreezerlocation()) || ( this.getFreezerlocation()!=null && castOther.getFreezerlocation()!=null && this.getFreezerlocation().equals(castOther.getFreezerlocation()) ) )
 && ( (this.getConcentration()==castOther.getConcentration()) || ( this.getConcentration()!=null && castOther.getConcentration()!=null && this.getConcentration().equals(castOther.getConcentration()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getSampleid();
         result = 37 * result + (int) this.getSubjectid();
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getValid() == null ? 0 : this.getValid().hashCode() );
         result = 37 * result + ( getNumcalls() == null ? 0 : this.getNumcalls().hashCode() );
         result = 37 * result + ( getLocation() == null ? 0 : this.getLocation().hashCode() );
         result = 37 * result + ( getNumnocalls() == null ? 0 : this.getNumnocalls().hashCode() );
         result = 37 * result + ( getFreezerlocation() == null ? 0 : this.getFreezerlocation().hashCode() );
         result = 37 * result + ( getConcentration() == null ? 0 : this.getConcentration().hashCode() );
         return result;
   }   


}


