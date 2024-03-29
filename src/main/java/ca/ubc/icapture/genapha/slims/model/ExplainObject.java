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
 * ExplainObject generated by hbm2java
 */
@Entity
@Table(name="EXPLAIN_OBJECT"
    ,schema="ALLERGEN"
)
public class ExplainObject  implements java.io.Serializable {


     private ExplainObjectId id;
     private ExplainStatement explainStatement;

    public ExplainObject() {
    }

    public ExplainObject(ExplainObjectId id, ExplainStatement explainStatement) {
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
        @AttributeOverride(name="objectSchema", column=@Column(name="OBJECT_SCHEMA", nullable=false, length=128) ), 
        @AttributeOverride(name="objectName", column=@Column(name="OBJECT_NAME", nullable=false, length=128) ), 
        @AttributeOverride(name="objectType", column=@Column(name="OBJECT_TYPE", nullable=false, length=2) ), 
        @AttributeOverride(name="createTime", column=@Column(name="CREATE_TIME", length=26) ), 
        @AttributeOverride(name="statisticsTime", column=@Column(name="STATISTICS_TIME", length=26) ), 
        @AttributeOverride(name="columnCount", column=@Column(name="COLUMN_COUNT", nullable=false) ), 
        @AttributeOverride(name="rowCount", column=@Column(name="ROW_COUNT", nullable=false) ), 
        @AttributeOverride(name="width", column=@Column(name="WIDTH", nullable=false) ), 
        @AttributeOverride(name="pages", column=@Column(name="PAGES", nullable=false) ), 
        @AttributeOverride(name="distinct", column=@Column(name="DISTINCT", nullable=false, length=1) ), 
        @AttributeOverride(name="tablespaceName", column=@Column(name="TABLESPACE_NAME", length=128) ), 
        @AttributeOverride(name="overhead", column=@Column(name="OVERHEAD", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="transferRate", column=@Column(name="TRANSFER_RATE", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="prefetchsize", column=@Column(name="PREFETCHSIZE", nullable=false) ), 
        @AttributeOverride(name="extentsize", column=@Column(name="EXTENTSIZE", nullable=false) ), 
        @AttributeOverride(name="cluster", column=@Column(name="CLUSTER", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="nleaf", column=@Column(name="NLEAF", nullable=false) ), 
        @AttributeOverride(name="nlevels", column=@Column(name="NLEVELS", nullable=false) ), 
        @AttributeOverride(name="fullkeycard", column=@Column(name="FULLKEYCARD", nullable=false) ), 
        @AttributeOverride(name="overflow", column=@Column(name="OVERFLOW", nullable=false) ), 
        @AttributeOverride(name="firstkeycard", column=@Column(name="FIRSTKEYCARD", nullable=false) ), 
        @AttributeOverride(name="first2keycard", column=@Column(name="FIRST2KEYCARD", nullable=false) ), 
        @AttributeOverride(name="first3keycard", column=@Column(name="FIRST3KEYCARD", nullable=false) ), 
        @AttributeOverride(name="first4keycard", column=@Column(name="FIRST4KEYCARD", nullable=false) ), 
        @AttributeOverride(name="sequentialPages", column=@Column(name="SEQUENTIAL_PAGES", nullable=false) ), 
        @AttributeOverride(name="density", column=@Column(name="DENSITY", nullable=false) ), 
        @AttributeOverride(name="statsSrc", column=@Column(name="STATS_SRC", nullable=false, length=1) ), 
        @AttributeOverride(name="averageSequenceGap", column=@Column(name="AVERAGE_SEQUENCE_GAP", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="averageSequenceFetchGap", column=@Column(name="AVERAGE_SEQUENCE_FETCH_GAP", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="averageSequencePages", column=@Column(name="AVERAGE_SEQUENCE_PAGES", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="averageSequenceFetchPages", column=@Column(name="AVERAGE_SEQUENCE_FETCH_PAGES", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="averageRandomPages", column=@Column(name="AVERAGE_RANDOM_PAGES", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="averageRandomFetchPages", column=@Column(name="AVERAGE_RANDOM_FETCH_PAGES", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="numrids", column=@Column(name="NUMRIDS", nullable=false) ), 
        @AttributeOverride(name="numridsDeleted", column=@Column(name="NUMRIDS_DELETED", nullable=false) ), 
        @AttributeOverride(name="numEmptyLeafs", column=@Column(name="NUM_EMPTY_LEAFS", nullable=false) ), 
        @AttributeOverride(name="activeBlocks", column=@Column(name="ACTIVE_BLOCKS", nullable=false) ), 
        @AttributeOverride(name="numDataParts", column=@Column(name="NUM_DATA_PARTS", nullable=false) ) } )
    public ExplainObjectId getId() {
        return this.id;
    }
    
    public void setId(ExplainObjectId id) {
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


