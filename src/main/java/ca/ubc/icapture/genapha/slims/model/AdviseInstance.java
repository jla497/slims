package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AdviseInstance generated by hbm2java
 */
@Entity
@Table(name="ADVISE_INSTANCE"
    ,schema="ALLERGEN"
)
public class AdviseInstance  implements java.io.Serializable {


     private Date startTime;
     private Date endTime;
     private String mode;
     private String wkldCompression;
     private String status;
     private Set<AdviseIndex> adviseIndexes = new HashSet<AdviseIndex>(0);
     private Set<AdvisePartition> advisePartitions = new HashSet<AdvisePartition>(0);
     private Set<AdviseTable> adviseTables = new HashSet<AdviseTable>(0);
     private Set<AdviseMqt> adviseMqts = new HashSet<AdviseMqt>(0);

    public AdviseInstance() {
    }

	
    public AdviseInstance(Date startTime, Date endTime, String mode, String wkldCompression, String status) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.mode = mode;
        this.wkldCompression = wkldCompression;
        this.status = status;
    }
    public AdviseInstance(Date startTime, Date endTime, String mode, String wkldCompression, String status, Set<AdviseIndex> adviseIndexes, Set<AdvisePartition> advisePartitions, Set<AdviseTable> adviseTables, Set<AdviseMqt> adviseMqts) {
       this.startTime = startTime;
       this.endTime = endTime;
       this.mode = mode;
       this.wkldCompression = wkldCompression;
       this.status = status;
       this.adviseIndexes = adviseIndexes;
       this.advisePartitions = advisePartitions;
       this.adviseTables = adviseTables;
       this.adviseMqts = adviseMqts;
    }
   
     @Id 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_TIME", unique=true, nullable=false, length=26)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_TIME", nullable=false, length=26)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="MODE", nullable=false, length=4)
    public String getMode() {
        return this.mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }
    
    @Column(name="WKLD_COMPRESSION", nullable=false, length=4)
    public String getWkldCompression() {
        return this.wkldCompression;
    }
    
    public void setWkldCompression(String wkldCompression) {
        this.wkldCompression = wkldCompression;
    }
    
    @Column(name="STATUS", nullable=false, length=9)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adviseInstance")
    public Set<AdviseIndex> getAdviseIndexes() {
        return this.adviseIndexes;
    }
    
    public void setAdviseIndexes(Set<AdviseIndex> adviseIndexes) {
        this.adviseIndexes = adviseIndexes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adviseInstance")
    public Set<AdvisePartition> getAdvisePartitions() {
        return this.advisePartitions;
    }
    
    public void setAdvisePartitions(Set<AdvisePartition> advisePartitions) {
        this.advisePartitions = advisePartitions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adviseInstance")
    public Set<AdviseTable> getAdviseTables() {
        return this.adviseTables;
    }
    
    public void setAdviseTables(Set<AdviseTable> adviseTables) {
        this.adviseTables = adviseTables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adviseInstance")
    public Set<AdviseMqt> getAdviseMqts() {
        return this.adviseMqts;
    }
    
    public void setAdviseMqts(Set<AdviseMqt> adviseMqts) {
        this.adviseMqts = adviseMqts;
    }




}


