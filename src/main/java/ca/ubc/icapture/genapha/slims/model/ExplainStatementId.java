package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExplainStatementId generated by hbm2java
 */
@Embeddable
public class ExplainStatementId  implements java.io.Serializable {


     private String explainRequester;
     private Date explainTime;
     private String sourceName;
     private String sourceSchema;
     private String sourceVersion;
     private char explainLevel;
     private int stmtno;
     private int sectno;

    public ExplainStatementId() {
    }

    public ExplainStatementId(String explainRequester, Date explainTime, String sourceName, String sourceSchema, String sourceVersion, char explainLevel, int stmtno, int sectno) {
       this.explainRequester = explainRequester;
       this.explainTime = explainTime;
       this.sourceName = sourceName;
       this.sourceSchema = sourceSchema;
       this.sourceVersion = sourceVersion;
       this.explainLevel = explainLevel;
       this.stmtno = stmtno;
       this.sectno = sectno;
    }
   

    @Column(name="EXPLAIN_REQUESTER", nullable=false, length=128)
    public String getExplainRequester() {
        return this.explainRequester;
    }
    
    public void setExplainRequester(String explainRequester) {
        this.explainRequester = explainRequester;
    }

    @Column(name="EXPLAIN_TIME", nullable=false, length=26)
    public Date getExplainTime() {
        return this.explainTime;
    }
    
    public void setExplainTime(Date explainTime) {
        this.explainTime = explainTime;
    }

    @Column(name="SOURCE_NAME", nullable=false, length=128)
    public String getSourceName() {
        return this.sourceName;
    }
    
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @Column(name="SOURCE_SCHEMA", nullable=false, length=128)
    public String getSourceSchema() {
        return this.sourceSchema;
    }
    
    public void setSourceSchema(String sourceSchema) {
        this.sourceSchema = sourceSchema;
    }

    @Column(name="SOURCE_VERSION", nullable=false, length=64)
    public String getSourceVersion() {
        return this.sourceVersion;
    }
    
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    @Column(name="EXPLAIN_LEVEL", nullable=false, length=1)
    public char getExplainLevel() {
        return this.explainLevel;
    }
    
    public void setExplainLevel(char explainLevel) {
        this.explainLevel = explainLevel;
    }

    @Column(name="STMTNO", nullable=false)
    public int getStmtno() {
        return this.stmtno;
    }
    
    public void setStmtno(int stmtno) {
        this.stmtno = stmtno;
    }

    @Column(name="SECTNO", nullable=false)
    public int getSectno() {
        return this.sectno;
    }
    
    public void setSectno(int sectno) {
        this.sectno = sectno;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExplainStatementId) ) return false;
		 ExplainStatementId castOther = ( ExplainStatementId ) other; 
         
		 return ( (this.getExplainRequester()==castOther.getExplainRequester()) || ( this.getExplainRequester()!=null && castOther.getExplainRequester()!=null && this.getExplainRequester().equals(castOther.getExplainRequester()) ) )
 && ( (this.getExplainTime()==castOther.getExplainTime()) || ( this.getExplainTime()!=null && castOther.getExplainTime()!=null && this.getExplainTime().equals(castOther.getExplainTime()) ) )
 && ( (this.getSourceName()==castOther.getSourceName()) || ( this.getSourceName()!=null && castOther.getSourceName()!=null && this.getSourceName().equals(castOther.getSourceName()) ) )
 && ( (this.getSourceSchema()==castOther.getSourceSchema()) || ( this.getSourceSchema()!=null && castOther.getSourceSchema()!=null && this.getSourceSchema().equals(castOther.getSourceSchema()) ) )
 && ( (this.getSourceVersion()==castOther.getSourceVersion()) || ( this.getSourceVersion()!=null && castOther.getSourceVersion()!=null && this.getSourceVersion().equals(castOther.getSourceVersion()) ) )
 && (this.getExplainLevel()==castOther.getExplainLevel())
 && (this.getStmtno()==castOther.getStmtno())
 && (this.getSectno()==castOther.getSectno());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getExplainRequester() == null ? 0 : this.getExplainRequester().hashCode() );
         result = 37 * result + ( getExplainTime() == null ? 0 : this.getExplainTime().hashCode() );
         result = 37 * result + ( getSourceName() == null ? 0 : this.getSourceName().hashCode() );
         result = 37 * result + ( getSourceSchema() == null ? 0 : this.getSourceSchema().hashCode() );
         result = 37 * result + ( getSourceVersion() == null ? 0 : this.getSourceVersion().hashCode() );
         result = 37 * result + this.getExplainLevel();
         result = 37 * result + this.getStmtno();
         result = 37 * result + this.getSectno();
         return result;
   }   


}


