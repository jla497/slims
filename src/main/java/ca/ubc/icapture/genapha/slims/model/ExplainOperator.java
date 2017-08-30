package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ExplainOperator generated by hbm2java
 */
@Entity
@Table(name="EXPLAIN_OPERATOR"
    ,schema="ALLERGEN"
)
public class ExplainOperator  implements java.io.Serializable {


     private ExplainOperatorId id;
     private ExplainStatement explainStatement;

    public ExplainOperator() {
    }

    public ExplainOperator(ExplainOperatorId id, ExplainStatement explainStatement) {
       this.id = id;
       this.explainStatement = explainStatement;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="explainRequester", column=@Column(name="EXPLAIN_REQUESTER", nullable=false, length=128) ), 
        @AttributeOverride(name="explainTime", column=@Column(name="EXPLAIN_TIME", nullable=false, length=26) ), 
        @AttributeOverride(name="sourceName", column=@Column(name="SOURCE_NAME", nullable=false, length=128) ), 
        @AttributeOverride(name="sourceSchema", column=@Column(name="SOURCE_SCHEMA", nullable=false, length=128) ), 
        @AttributeOverride(name="sourceVersion", column=@Column(name="SOURCE_VERSION", nullable=false, length=64) ), 
        @AttributeOverride(name="explainLevel", column=@Column(name="EXPLAIN_LEVEL", nullable=false, length=1) ), 
        @AttributeOverride(name="stmtno", column=@Column(name="STMTNO", nullable=false) ), 
        @AttributeOverride(name="sectno", column=@Column(name="SECTNO", nullable=false) ), 
        @AttributeOverride(name="operatorId", column=@Column(name="OPERATOR_ID", nullable=false) ), 
        @AttributeOverride(name="operatorType", column=@Column(name="OPERATOR_TYPE", nullable=false, length=6) ), 
        @AttributeOverride(name="totalCost", column=@Column(name="TOTAL_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="ioCost", column=@Column(name="IO_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="cpuCost", column=@Column(name="CPU_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="firstRowCost", column=@Column(name="FIRST_ROW_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="reTotalCost", column=@Column(name="RE_TOTAL_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="reIoCost", column=@Column(name="RE_IO_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="reCpuCost", column=@Column(name="RE_CPU_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="commCost", column=@Column(name="COMM_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="firstCommCost", column=@Column(name="FIRST_COMM_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="buffers", column=@Column(name="BUFFERS", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="remoteTotalCost", column=@Column(name="REMOTE_TOTAL_COST", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="remoteCommCost", column=@Column(name="REMOTE_COMM_COST", nullable=false, precision=53, scale=0) ) } )
    public ExplainOperatorId getId() {
        return this.id;
    }
    
    public void setId(ExplainOperatorId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="EXPLAIN_REQUESTER", referencedColumnName="EXPLAIN_REQUESTER", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="EXPLAIN_TIME", referencedColumnName="EXPLAIN_TIME", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="SOURCE_NAME", referencedColumnName="SOURCE_NAME", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="SOURCE_SCHEMA", referencedColumnName="SOURCE_SCHEMA", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="SOURCE_VERSION", referencedColumnName="SOURCE_VERSION", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="EXPLAIN_LEVEL", referencedColumnName="EXPLAIN_LEVEL", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="STMTNO", referencedColumnName="STMTNO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="SECTNO", referencedColumnName="SECTNO", nullable=false, insertable=false, updatable=false) } )
    public ExplainStatement getExplainStatement() {
        return this.explainStatement;
    }
    
    public void setExplainStatement(ExplainStatement explainStatement) {
        this.explainStatement = explainStatement;
    }




}


