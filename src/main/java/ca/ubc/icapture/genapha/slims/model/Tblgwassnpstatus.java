package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tblgwassnpstatus generated by hbm2java
 */
@Entity
@Table(name="TBLGWASSNPSTATUS"
    ,schema="ALLERGEN"
)
public class Tblgwassnpstatus  implements java.io.Serializable {


     private TblgwassnpstatusId id;
     private Short genotyped;
     private Short passedqc;
     private String beaglehapmap2r2;
     private String beaglehapmap3r2;
     private String machhapmap2r2;
     private String machhapmap3r2;
     private String name;
     private Short chromosome;
     private Character majorallele;
     private Character minorallele;
     private Integer position;

    public Tblgwassnpstatus() {
    }

	
    public Tblgwassnpstatus(TblgwassnpstatusId id) {
        this.id = id;
    }
    public Tblgwassnpstatus(TblgwassnpstatusId id, Short genotyped, Short passedqc, String beaglehapmap2r2, String beaglehapmap3r2, String machhapmap2r2, String machhapmap3r2, String name, Short chromosome, Character majorallele, Character minorallele, Integer position) {
       this.id = id;
       this.genotyped = genotyped;
       this.passedqc = passedqc;
       this.beaglehapmap2r2 = beaglehapmap2r2;
       this.beaglehapmap3r2 = beaglehapmap3r2;
       this.machhapmap2r2 = machhapmap2r2;
       this.machhapmap3r2 = machhapmap3r2;
       this.name = name;
       this.chromosome = chromosome;
       this.majorallele = majorallele;
       this.minorallele = minorallele;
       this.position = position;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="gwasdatasetid", column=@Column(name="GWASDATASETID", nullable=false) ), 
        @AttributeOverride(name="rsnumber", column=@Column(name="RSNUMBER", nullable=false, length=60) ) } )
    public TblgwassnpstatusId getId() {
        return this.id;
    }
    
    public void setId(TblgwassnpstatusId id) {
        this.id = id;
    }
    
    @Column(name="GENOTYPED")
    public Short getGenotyped() {
        return this.genotyped;
    }
    
    public void setGenotyped(Short genotyped) {
        this.genotyped = genotyped;
    }
    
    @Column(name="PASSEDQC")
    public Short getPassedqc() {
        return this.passedqc;
    }
    
    public void setPassedqc(Short passedqc) {
        this.passedqc = passedqc;
    }
    
    @Column(name="BEAGLEHAPMAP2R2", length=10)
    public String getBeaglehapmap2r2() {
        return this.beaglehapmap2r2;
    }
    
    public void setBeaglehapmap2r2(String beaglehapmap2r2) {
        this.beaglehapmap2r2 = beaglehapmap2r2;
    }
    
    @Column(name="BEAGLEHAPMAP3R2", length=10)
    public String getBeaglehapmap3r2() {
        return this.beaglehapmap3r2;
    }
    
    public void setBeaglehapmap3r2(String beaglehapmap3r2) {
        this.beaglehapmap3r2 = beaglehapmap3r2;
    }
    
    @Column(name="MACHHAPMAP2R2", length=10)
    public String getMachhapmap2r2() {
        return this.machhapmap2r2;
    }
    
    public void setMachhapmap2r2(String machhapmap2r2) {
        this.machhapmap2r2 = machhapmap2r2;
    }
    
    @Column(name="MACHHAPMAP3R2", length=10)
    public String getMachhapmap3r2() {
        return this.machhapmap3r2;
    }
    
    public void setMachhapmap3r2(String machhapmap3r2) {
        this.machhapmap3r2 = machhapmap3r2;
    }
    
    @Column(name="NAME", length=5)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="CHROMOSOME")
    public Short getChromosome() {
        return this.chromosome;
    }
    
    public void setChromosome(Short chromosome) {
        this.chromosome = chromosome;
    }
    
    @Column(name="MAJORALLELE", length=1)
    public Character getMajorallele() {
        return this.majorallele;
    }
    
    public void setMajorallele(Character majorallele) {
        this.majorallele = majorallele;
    }
    
    @Column(name="MINORALLELE", length=1)
    public Character getMinorallele() {
        return this.minorallele;
    }
    
    public void setMinorallele(Character minorallele) {
        this.minorallele = minorallele;
    }
    
    @Column(name="POSITION")
    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }




}


