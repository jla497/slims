package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AdviseIndex generated by hbm2java
 */
@Entity
@Table(name="ADVISE_INDEX"
    ,schema="ALLERGEN"
)
public class AdviseIndex  implements java.io.Serializable {


     private AdviseIndexId id;
     private AdviseInstance adviseInstance;

    public AdviseIndex() {
    }

	
    public AdviseIndex(AdviseIndexId id) {
        this.id = id;
    }
    public AdviseIndex(AdviseIndexId id, AdviseInstance adviseInstance) {
       this.id = id;
       this.adviseInstance = adviseInstance;
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
        @AttributeOverride(name="queryno", column=@Column(name="QUERYNO", nullable=false) ), 
        @AttributeOverride(name="querytag", column=@Column(name="QUERYTAG", nullable=false, length=20) ), 
        @AttributeOverride(name="name", column=@Column(name="NAME", nullable=false, length=128) ), 
        @AttributeOverride(name="creator", column=@Column(name="CREATOR", nullable=false, length=128) ), 
        @AttributeOverride(name="tbname", column=@Column(name="TBNAME", nullable=false, length=128) ), 
        @AttributeOverride(name="tbcreator", column=@Column(name="TBCREATOR", nullable=false, length=128) ), 
        @AttributeOverride(name="colnames", column=@Column(name="COLNAMES", nullable=false) ), 
        @AttributeOverride(name="uniquerule", column=@Column(name="UNIQUERULE", nullable=false, length=1) ), 
        @AttributeOverride(name="colcount", column=@Column(name="COLCOUNT", nullable=false) ), 
        @AttributeOverride(name="iid", column=@Column(name="IID", nullable=false) ), 
        @AttributeOverride(name="nleaf", column=@Column(name="NLEAF", nullable=false) ), 
        @AttributeOverride(name="nlevels", column=@Column(name="NLEVELS", nullable=false) ), 
        @AttributeOverride(name="firstkeycard", column=@Column(name="FIRSTKEYCARD", nullable=false) ), 
        @AttributeOverride(name="fullkeycard", column=@Column(name="FULLKEYCARD", nullable=false) ), 
        @AttributeOverride(name="clusterratio", column=@Column(name="CLUSTERRATIO", nullable=false) ), 
        @AttributeOverride(name="clusterfactor", column=@Column(name="CLUSTERFACTOR", nullable=false, precision=53, scale=0) ), 
        @AttributeOverride(name="userdefined", column=@Column(name="USERDEFINED", nullable=false) ), 
        @AttributeOverride(name="systemRequired", column=@Column(name="SYSTEM_REQUIRED", nullable=false) ), 
        @AttributeOverride(name="createTime", column=@Column(name="CREATE_TIME", nullable=false, length=26) ), 
        @AttributeOverride(name="statsTime", column=@Column(name="STATS_TIME", length=26) ), 
        @AttributeOverride(name="pageFetchPairs", column=@Column(name="PAGE_FETCH_PAIRS", nullable=false, length=254) ), 
        @AttributeOverride(name="remarks", column=@Column(name="REMARKS", length=254) ), 
        @AttributeOverride(name="definer", column=@Column(name="DEFINER", nullable=false, length=128) ), 
        @AttributeOverride(name="converted", column=@Column(name="CONVERTED", nullable=false, length=1) ), 
        @AttributeOverride(name="sequentialPages", column=@Column(name="SEQUENTIAL_PAGES", nullable=false) ), 
        @AttributeOverride(name="density", column=@Column(name="DENSITY", nullable=false) ), 
        @AttributeOverride(name="first2keycard", column=@Column(name="FIRST2KEYCARD", nullable=false) ), 
        @AttributeOverride(name="first3keycard", column=@Column(name="FIRST3KEYCARD", nullable=false) ), 
        @AttributeOverride(name="first4keycard", column=@Column(name="FIRST4KEYCARD", nullable=false) ), 
        @AttributeOverride(name="pctfree", column=@Column(name="PCTFREE", nullable=false) ), 
        @AttributeOverride(name="uniqueColcount", column=@Column(name="UNIQUE_COLCOUNT", nullable=false) ), 
        @AttributeOverride(name="minpctused", column=@Column(name="MINPCTUSED", nullable=false) ), 
        @AttributeOverride(name="reverseScans", column=@Column(name="REVERSE_SCANS", nullable=false, length=1) ), 
        @AttributeOverride(name="useIndex", column=@Column(name="USE_INDEX", length=1) ), 
        @AttributeOverride(name="creationText", column=@Column(name="CREATION_TEXT", nullable=false) ), 
        @AttributeOverride(name="packedDesc", column=@Column(name="PACKED_DESC") ), 
        @AttributeOverride(name="runId", column=@Column(name="RUN_ID", length=26) ), 
        @AttributeOverride(name="indextype", column=@Column(name="INDEXTYPE", nullable=false, length=4) ), 
        @AttributeOverride(name="exists", column=@Column(name="EXISTS", nullable=false, length=1) ), 
        @AttributeOverride(name="ridtoblock", column=@Column(name="RIDTOBLOCK", nullable=false, length=1) ) } )
    public AdviseIndexId getId() {
        return this.id;
    }
    
    public void setId(AdviseIndexId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RUN_ID", insertable=false, updatable=false)
    public AdviseInstance getAdviseInstance() {
        return this.adviseInstance;
    }
    
    public void setAdviseInstance(AdviseInstance adviseInstance) {
        this.adviseInstance = adviseInstance;
    }




}

