package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * T20091208213523ExceptionId generated by hbm2java
 */
@Embeddable
public class T20091208213523ExceptionId  implements java.io.Serializable {


     private int containerid;
     private int containertypeid;
     private String containername;
     private Integer freezerid;
     private Integer shelf;
     private short discarded;
     private short shippedout;
     private Date shippeddate;
     private Integer shippedtoid;
     private String comments;
     private Short stock;
     private int materialtypeid;
     private Date created;
     private long createdBy;
     private Date modified;
     private Integer modifiedBy;
     private int valid;
     private String containeralias;
     private Date date;
     private String initials;
     private int lot;
     private String location;

    public T20091208213523ExceptionId() {
    }

	
    public T20091208213523ExceptionId(int containerid, int containertypeid, String containername, short discarded, short shippedout, int materialtypeid, Date created, long createdBy, int valid, int lot) {
        this.containerid = containerid;
        this.containertypeid = containertypeid;
        this.containername = containername;
        this.discarded = discarded;
        this.shippedout = shippedout;
        this.materialtypeid = materialtypeid;
        this.created = created;
        this.createdBy = createdBy;
        this.valid = valid;
        this.lot = lot;
    }
    public T20091208213523ExceptionId(int containerid, int containertypeid, String containername, Integer freezerid, Integer shelf, short discarded, short shippedout, Date shippeddate, Integer shippedtoid, String comments, Short stock, int materialtypeid, Date created, long createdBy, Date modified, Integer modifiedBy, int valid, String containeralias, Date date, String initials, int lot, String location) {
       this.containerid = containerid;
       this.containertypeid = containertypeid;
       this.containername = containername;
       this.freezerid = freezerid;
       this.shelf = shelf;
       this.discarded = discarded;
       this.shippedout = shippedout;
       this.shippeddate = shippeddate;
       this.shippedtoid = shippedtoid;
       this.comments = comments;
       this.stock = stock;
       this.materialtypeid = materialtypeid;
       this.created = created;
       this.createdBy = createdBy;
       this.modified = modified;
       this.modifiedBy = modifiedBy;
       this.valid = valid;
       this.containeralias = containeralias;
       this.date = date;
       this.initials = initials;
       this.lot = lot;
       this.location = location;
    }
   

    @Column(name="CONTAINERID", nullable=false)
    public int getContainerid() {
        return this.containerid;
    }
    
    public void setContainerid(int containerid) {
        this.containerid = containerid;
    }

    @Column(name="CONTAINERTYPEID", nullable=false)
    public int getContainertypeid() {
        return this.containertypeid;
    }
    
    public void setContainertypeid(int containertypeid) {
        this.containertypeid = containertypeid;
    }

    @Column(name="CONTAINERNAME", nullable=false, length=100)
    public String getContainername() {
        return this.containername;
    }
    
    public void setContainername(String containername) {
        this.containername = containername;
    }

    @Column(name="FREEZERID")
    public Integer getFreezerid() {
        return this.freezerid;
    }
    
    public void setFreezerid(Integer freezerid) {
        this.freezerid = freezerid;
    }

    @Column(name="SHELF")
    public Integer getShelf() {
        return this.shelf;
    }
    
    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }

    @Column(name="DISCARDED", nullable=false)
    public short getDiscarded() {
        return this.discarded;
    }
    
    public void setDiscarded(short discarded) {
        this.discarded = discarded;
    }

    @Column(name="SHIPPEDOUT", nullable=false)
    public short getShippedout() {
        return this.shippedout;
    }
    
    public void setShippedout(short shippedout) {
        this.shippedout = shippedout;
    }

    @Column(name="SHIPPEDDATE", length=10)
    public Date getShippeddate() {
        return this.shippeddate;
    }
    
    public void setShippeddate(Date shippeddate) {
        this.shippeddate = shippeddate;
    }

    @Column(name="SHIPPEDTOID")
    public Integer getShippedtoid() {
        return this.shippedtoid;
    }
    
    public void setShippedtoid(Integer shippedtoid) {
        this.shippedtoid = shippedtoid;
    }

    @Column(name="COMMENTS", length=200)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name="STOCK")
    public Short getStock() {
        return this.stock;
    }
    
    public void setStock(Short stock) {
        this.stock = stock;
    }

    @Column(name="MATERIALTYPEID", nullable=false)
    public int getMaterialtypeid() {
        return this.materialtypeid;
    }
    
    public void setMaterialtypeid(int materialtypeid) {
        this.materialtypeid = materialtypeid;
    }

    @Column(name="CREATED", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name="CREATED_BY", nullable=false)
    public long getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="MODIFIED", length=26)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Column(name="MODIFIED_BY")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name="VALID", nullable=false)
    public int getValid() {
        return this.valid;
    }
    
    public void setValid(int valid) {
        this.valid = valid;
    }

    @Column(name="CONTAINERALIAS", length=100)
    public String getContaineralias() {
        return this.containeralias;
    }
    
    public void setContaineralias(String containeralias) {
        this.containeralias = containeralias;
    }

    @Column(name="DATE", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name="INITIALS", length=30)
    public String getInitials() {
        return this.initials;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Column(name="LOT", nullable=false)
    public int getLot() {
        return this.lot;
    }
    
    public void setLot(int lot) {
        this.lot = lot;
    }

    @Column(name="LOCATION", length=20)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof T20091208213523ExceptionId) ) return false;
		 T20091208213523ExceptionId castOther = ( T20091208213523ExceptionId ) other; 
         
		 return (this.getContainerid()==castOther.getContainerid())
 && (this.getContainertypeid()==castOther.getContainertypeid())
 && ( (this.getContainername()==castOther.getContainername()) || ( this.getContainername()!=null && castOther.getContainername()!=null && this.getContainername().equals(castOther.getContainername()) ) )
 && ( (this.getFreezerid()==castOther.getFreezerid()) || ( this.getFreezerid()!=null && castOther.getFreezerid()!=null && this.getFreezerid().equals(castOther.getFreezerid()) ) )
 && ( (this.getShelf()==castOther.getShelf()) || ( this.getShelf()!=null && castOther.getShelf()!=null && this.getShelf().equals(castOther.getShelf()) ) )
 && (this.getDiscarded()==castOther.getDiscarded())
 && (this.getShippedout()==castOther.getShippedout())
 && ( (this.getShippeddate()==castOther.getShippeddate()) || ( this.getShippeddate()!=null && castOther.getShippeddate()!=null && this.getShippeddate().equals(castOther.getShippeddate()) ) )
 && ( (this.getShippedtoid()==castOther.getShippedtoid()) || ( this.getShippedtoid()!=null && castOther.getShippedtoid()!=null && this.getShippedtoid().equals(castOther.getShippedtoid()) ) )
 && ( (this.getComments()==castOther.getComments()) || ( this.getComments()!=null && castOther.getComments()!=null && this.getComments().equals(castOther.getComments()) ) )
 && ( (this.getStock()==castOther.getStock()) || ( this.getStock()!=null && castOther.getStock()!=null && this.getStock().equals(castOther.getStock()) ) )
 && (this.getMaterialtypeid()==castOther.getMaterialtypeid())
 && ( (this.getCreated()==castOther.getCreated()) || ( this.getCreated()!=null && castOther.getCreated()!=null && this.getCreated().equals(castOther.getCreated()) ) )
 && (this.getCreatedBy()==castOther.getCreatedBy())
 && ( (this.getModified()==castOther.getModified()) || ( this.getModified()!=null && castOther.getModified()!=null && this.getModified().equals(castOther.getModified()) ) )
 && ( (this.getModifiedBy()==castOther.getModifiedBy()) || ( this.getModifiedBy()!=null && castOther.getModifiedBy()!=null && this.getModifiedBy().equals(castOther.getModifiedBy()) ) )
 && (this.getValid()==castOther.getValid())
 && ( (this.getContaineralias()==castOther.getContaineralias()) || ( this.getContaineralias()!=null && castOther.getContaineralias()!=null && this.getContaineralias().equals(castOther.getContaineralias()) ) )
 && ( (this.getDate()==castOther.getDate()) || ( this.getDate()!=null && castOther.getDate()!=null && this.getDate().equals(castOther.getDate()) ) )
 && ( (this.getInitials()==castOther.getInitials()) || ( this.getInitials()!=null && castOther.getInitials()!=null && this.getInitials().equals(castOther.getInitials()) ) )
 && (this.getLot()==castOther.getLot())
 && ( (this.getLocation()==castOther.getLocation()) || ( this.getLocation()!=null && castOther.getLocation()!=null && this.getLocation().equals(castOther.getLocation()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getContainerid();
         result = 37 * result + this.getContainertypeid();
         result = 37 * result + ( getContainername() == null ? 0 : this.getContainername().hashCode() );
         result = 37 * result + ( getFreezerid() == null ? 0 : this.getFreezerid().hashCode() );
         result = 37 * result + ( getShelf() == null ? 0 : this.getShelf().hashCode() );
         result = 37 * result + this.getDiscarded();
         result = 37 * result + this.getShippedout();
         result = 37 * result + ( getShippeddate() == null ? 0 : this.getShippeddate().hashCode() );
         result = 37 * result + ( getShippedtoid() == null ? 0 : this.getShippedtoid().hashCode() );
         result = 37 * result + ( getComments() == null ? 0 : this.getComments().hashCode() );
         result = 37 * result + ( getStock() == null ? 0 : this.getStock().hashCode() );
         result = 37 * result + this.getMaterialtypeid();
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + (int) this.getCreatedBy();
         result = 37 * result + ( getModified() == null ? 0 : this.getModified().hashCode() );
         result = 37 * result + ( getModifiedBy() == null ? 0 : this.getModifiedBy().hashCode() );
         result = 37 * result + this.getValid();
         result = 37 * result + ( getContaineralias() == null ? 0 : this.getContaineralias().hashCode() );
         result = 37 * result + ( getDate() == null ? 0 : this.getDate().hashCode() );
         result = 37 * result + ( getInitials() == null ? 0 : this.getInitials().hashCode() );
         result = 37 * result + this.getLot();
         result = 37 * result + ( getLocation() == null ? 0 : this.getLocation().hashCode() );
         return result;
   }   


}


