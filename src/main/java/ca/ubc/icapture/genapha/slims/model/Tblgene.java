package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblgene generated by hbm2java
 */
@Entity
@Table(name="TBLGENE"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="NAME") 
)
public class Tblgene  implements java.io.Serializable {


     private int geneid;
     private String name;
     private short public_;
     private Long entrezgeneid;
     private String arm;
     @JsonIgnore
     private Set<Tblgenelink> tblgenelinks = new HashSet<Tblgenelink>(0);
     @JsonIgnore
     private Set<Tblsnp> tblsnps = new HashSet<Tblsnp>(0);
      @JsonIgnore
     private Set<Tblgenesetlookup> tblgenesetlookups = new HashSet<Tblgenesetlookup>(0);
      @JsonIgnore
      private Set<Tblgenaphausers> tblgenaphauserses = new HashSet<Tblgenaphausers>(0);
      @JsonIgnore
      private Set<Tblgenealias> tblgenealiases = new HashSet<Tblgenealias>(0);

    public Tblgene() {
    }

	
    public Tblgene(int geneid, String name, short public_) {
        this.geneid = geneid;
        this.name = name;
        this.public_ = public_;
    }
    public Tblgene(int geneid, String name, short public_, Long entrezgeneid, String arm, Set<Tblgenelink> tblgenelinks, Set<Tblsnp> tblsnps, Set<Tblgenesetlookup> tblgenesetlookups, Set<Tblgenaphausers> tblgenaphauserses, Set<Tblgenealias> tblgenealiases) {
       this.geneid = geneid;
       this.name = name;
       this.public_ = public_;
       this.entrezgeneid = entrezgeneid;
       this.arm = arm;
       this.tblgenelinks = tblgenelinks;
       this.tblsnps = tblsnps;
       this.tblgenesetlookups = tblgenesetlookups;
       this.tblgenaphauserses = tblgenaphauserses;
       this.tblgenealiases = tblgenealiases;
    }
   
     @Id 
    
    @Column(name="GENEID", unique=true, nullable=false)
    public int getGeneid() {
        return this.geneid;
    }
    
    public void setGeneid(int geneid) {
        this.geneid = geneid;
    }
    
    @Column(name="NAME", unique=true, nullable=false, length=25)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="PUBLIC", nullable=false)
    public short getPublic_() {
        return this.public_;
    }
    
    public void setPublic_(short public_) {
        this.public_ = public_;
    }
    
    @Column(name="ENTREZGENEID")
    public Long getEntrezgeneid() {
        return this.entrezgeneid;
    }
    
    public void setEntrezgeneid(Long entrezgeneid) {
        this.entrezgeneid = entrezgeneid;
    }
    
    @Column(name="ARM", length=1)
    public String getArm() {
        return this.arm;
    }
    
    public void setArm(String arm) {
        this.arm = arm;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblgene")
    public Set<Tblgenelink> getTblgenelinks() {
        return this.tblgenelinks;
    }
    
    public void setTblgenelinks(Set<Tblgenelink> tblgenelinks) {
        this.tblgenelinks = tblgenelinks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblgene")
    public Set<Tblsnp> getTblsnps() {
        return this.tblsnps;
    }
    
    public void setTblsnps(Set<Tblsnp> tblsnps) {
        this.tblsnps = tblsnps;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblgenes")
    public Set<Tblgenesetlookup> getTblgenesetlookups() {
        return this.tblgenesetlookups;
    }
    
    public void setTblgenesetlookups(Set<Tblgenesetlookup> tblgenesetlookups) {
        this.tblgenesetlookups = tblgenesetlookups;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblgenes")
    public Set<Tblgenaphausers> getTblgenaphauserses() {
        return this.tblgenaphauserses;
    }
    
    public void setTblgenaphauserses(Set<Tblgenaphausers> tblgenaphauserses) {
        this.tblgenaphauserses = tblgenaphauserses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tblgene")
    public Set<Tblgenealias> getTblgenealiases() {
        return this.tblgenealiases;
    }
    
    public void setTblgenealiases(Set<Tblgenealias> tblgenealiases) {
        this.tblgenealiases = tblgenealiases;
    }




}

