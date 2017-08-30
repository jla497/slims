package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tblgenelink generated by hbm2java
 */
@Entity
@Table(name="TBLGENELINK"
    ,schema="ALLERGEN"
    , uniqueConstraints = @UniqueConstraint(columnNames={"NAME", "GENEID"}) 
)
public class Tblgenelink  implements java.io.Serializable {


     private long genelinkid;
     private Tblgene tblgene;
     private String name;
     private String url;
     private int sortorder;

    public Tblgenelink() {
    }

    public Tblgenelink(long genelinkid, Tblgene tblgene, String name, String url, int sortorder) {
       this.genelinkid = genelinkid;
       this.tblgene = tblgene;
       this.name = name;
       this.url = url;
       this.sortorder = sortorder;
    }
   
     @Id 
    
    @Column(name="GENELINKID", unique=true, nullable=false)
    public long getGenelinkid() {
        return this.genelinkid;
    }
    
    public void setGenelinkid(long genelinkid) {
        this.genelinkid = genelinkid;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GENEID", nullable=false)
    public Tblgene getTblgene() {
        return this.tblgene;
    }
    
    public void setTblgene(Tblgene tblgene) {
        this.tblgene = tblgene;
    }
    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="URL", nullable=false, length=250)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    @Column(name="SORTORDER", nullable=false)
    public int getSortorder() {
        return this.sortorder;
    }
    
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }




}

