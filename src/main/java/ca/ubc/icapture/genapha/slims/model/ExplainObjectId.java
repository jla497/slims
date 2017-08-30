package ca.ubc.icapture.genapha.slims.model;
// Generated May 30, 2017 4:12:31 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExplainObjectId generated by hbm2java
 */
@Embeddable
public class ExplainObjectId  implements java.io.Serializable {


     private String explainRequester;
     private Date explainTime;
     private String sourceName;
     private String sourceSchema;
     private String sourceVersion;
     private char explainLevel;
     private int stmtno;
     private int sectno;
     private String objectSchema;
     private String objectName;
     private String objectType;
     private Date createTime;
     private Date statisticsTime;
     private short columnCount;
     private long rowCount;
     private int width;
     private long pages;
     private char distinct;
     private String tablespaceName;
     private double overhead;
     private double transferRate;
     private int prefetchsize;
     private int extentsize;
     private double cluster;
     private long nleaf;
     private int nlevels;
     private long fullkeycard;
     private long overflow;
     private long firstkeycard;
     private long first2keycard;
     private long first3keycard;
     private long first4keycard;
     private long sequentialPages;
     private int density;
     private char statsSrc;
     private double averageSequenceGap;
     private double averageSequenceFetchGap;
     private double averageSequencePages;
     private double averageSequenceFetchPages;
     private double averageRandomPages;
     private double averageRandomFetchPages;
     private long numrids;
     private long numridsDeleted;
     private long numEmptyLeafs;
     private long activeBlocks;
     private int numDataParts;

    public ExplainObjectId() {
    }

	
    public ExplainObjectId(String explainRequester, Date explainTime, String sourceName, String sourceSchema, String sourceVersion, char explainLevel, int stmtno, int sectno, String objectSchema, String objectName, String objectType, short columnCount, long rowCount, int width, long pages, char distinct, double overhead, double transferRate, int prefetchsize, int extentsize, double cluster, long nleaf, int nlevels, long fullkeycard, long overflow, long firstkeycard, long first2keycard, long first3keycard, long first4keycard, long sequentialPages, int density, char statsSrc, double averageSequenceGap, double averageSequenceFetchGap, double averageSequencePages, double averageSequenceFetchPages, double averageRandomPages, double averageRandomFetchPages, long numrids, long numridsDeleted, long numEmptyLeafs, long activeBlocks, int numDataParts) {
        this.explainRequester = explainRequester;
        this.explainTime = explainTime;
        this.sourceName = sourceName;
        this.sourceSchema = sourceSchema;
        this.sourceVersion = sourceVersion;
        this.explainLevel = explainLevel;
        this.stmtno = stmtno;
        this.sectno = sectno;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.objectType = objectType;
        this.columnCount = columnCount;
        this.rowCount = rowCount;
        this.width = width;
        this.pages = pages;
        this.distinct = distinct;
        this.overhead = overhead;
        this.transferRate = transferRate;
        this.prefetchsize = prefetchsize;
        this.extentsize = extentsize;
        this.cluster = cluster;
        this.nleaf = nleaf;
        this.nlevels = nlevels;
        this.fullkeycard = fullkeycard;
        this.overflow = overflow;
        this.firstkeycard = firstkeycard;
        this.first2keycard = first2keycard;
        this.first3keycard = first3keycard;
        this.first4keycard = first4keycard;
        this.sequentialPages = sequentialPages;
        this.density = density;
        this.statsSrc = statsSrc;
        this.averageSequenceGap = averageSequenceGap;
        this.averageSequenceFetchGap = averageSequenceFetchGap;
        this.averageSequencePages = averageSequencePages;
        this.averageSequenceFetchPages = averageSequenceFetchPages;
        this.averageRandomPages = averageRandomPages;
        this.averageRandomFetchPages = averageRandomFetchPages;
        this.numrids = numrids;
        this.numridsDeleted = numridsDeleted;
        this.numEmptyLeafs = numEmptyLeafs;
        this.activeBlocks = activeBlocks;
        this.numDataParts = numDataParts;
    }
    public ExplainObjectId(String explainRequester, Date explainTime, String sourceName, String sourceSchema, String sourceVersion, char explainLevel, int stmtno, int sectno, String objectSchema, String objectName, String objectType, Date createTime, Date statisticsTime, short columnCount, long rowCount, int width, long pages, char distinct, String tablespaceName, double overhead, double transferRate, int prefetchsize, int extentsize, double cluster, long nleaf, int nlevels, long fullkeycard, long overflow, long firstkeycard, long first2keycard, long first3keycard, long first4keycard, long sequentialPages, int density, char statsSrc, double averageSequenceGap, double averageSequenceFetchGap, double averageSequencePages, double averageSequenceFetchPages, double averageRandomPages, double averageRandomFetchPages, long numrids, long numridsDeleted, long numEmptyLeafs, long activeBlocks, int numDataParts) {
       this.explainRequester = explainRequester;
       this.explainTime = explainTime;
       this.sourceName = sourceName;
       this.sourceSchema = sourceSchema;
       this.sourceVersion = sourceVersion;
       this.explainLevel = explainLevel;
       this.stmtno = stmtno;
       this.sectno = sectno;
       this.objectSchema = objectSchema;
       this.objectName = objectName;
       this.objectType = objectType;
       this.createTime = createTime;
       this.statisticsTime = statisticsTime;
       this.columnCount = columnCount;
       this.rowCount = rowCount;
       this.width = width;
       this.pages = pages;
       this.distinct = distinct;
       this.tablespaceName = tablespaceName;
       this.overhead = overhead;
       this.transferRate = transferRate;
       this.prefetchsize = prefetchsize;
       this.extentsize = extentsize;
       this.cluster = cluster;
       this.nleaf = nleaf;
       this.nlevels = nlevels;
       this.fullkeycard = fullkeycard;
       this.overflow = overflow;
       this.firstkeycard = firstkeycard;
       this.first2keycard = first2keycard;
       this.first3keycard = first3keycard;
       this.first4keycard = first4keycard;
       this.sequentialPages = sequentialPages;
       this.density = density;
       this.statsSrc = statsSrc;
       this.averageSequenceGap = averageSequenceGap;
       this.averageSequenceFetchGap = averageSequenceFetchGap;
       this.averageSequencePages = averageSequencePages;
       this.averageSequenceFetchPages = averageSequenceFetchPages;
       this.averageRandomPages = averageRandomPages;
       this.averageRandomFetchPages = averageRandomFetchPages;
       this.numrids = numrids;
       this.numridsDeleted = numridsDeleted;
       this.numEmptyLeafs = numEmptyLeafs;
       this.activeBlocks = activeBlocks;
       this.numDataParts = numDataParts;
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

    @Column(name="OBJECT_SCHEMA", nullable=false, length=128)
    public String getObjectSchema() {
        return this.objectSchema;
    }
    
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Column(name="OBJECT_NAME", nullable=false, length=128)
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Column(name="OBJECT_TYPE", nullable=false, length=2)
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Column(name="CREATE_TIME", length=26)
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name="STATISTICS_TIME", length=26)
    public Date getStatisticsTime() {
        return this.statisticsTime;
    }
    
    public void setStatisticsTime(Date statisticsTime) {
        this.statisticsTime = statisticsTime;
    }

    @Column(name="COLUMN_COUNT", nullable=false)
    public short getColumnCount() {
        return this.columnCount;
    }
    
    public void setColumnCount(short columnCount) {
        this.columnCount = columnCount;
    }

    @Column(name="ROW_COUNT", nullable=false)
    public long getRowCount() {
        return this.rowCount;
    }
    
    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
    }

    @Column(name="WIDTH", nullable=false)
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    @Column(name="PAGES", nullable=false)
    public long getPages() {
        return this.pages;
    }
    
    public void setPages(long pages) {
        this.pages = pages;
    }

    @Column(name="DISTINCT", nullable=false, length=1)
    public char getDistinct() {
        return this.distinct;
    }
    
    public void setDistinct(char distinct) {
        this.distinct = distinct;
    }

    @Column(name="TABLESPACE_NAME", length=128)
    public String getTablespaceName() {
        return this.tablespaceName;
    }
    
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Column(name="OVERHEAD", nullable=false, precision=53, scale=0)
    public double getOverhead() {
        return this.overhead;
    }
    
    public void setOverhead(double overhead) {
        this.overhead = overhead;
    }

    @Column(name="TRANSFER_RATE", nullable=false, precision=53, scale=0)
    public double getTransferRate() {
        return this.transferRate;
    }
    
    public void setTransferRate(double transferRate) {
        this.transferRate = transferRate;
    }

    @Column(name="PREFETCHSIZE", nullable=false)
    public int getPrefetchsize() {
        return this.prefetchsize;
    }
    
    public void setPrefetchsize(int prefetchsize) {
        this.prefetchsize = prefetchsize;
    }

    @Column(name="EXTENTSIZE", nullable=false)
    public int getExtentsize() {
        return this.extentsize;
    }
    
    public void setExtentsize(int extentsize) {
        this.extentsize = extentsize;
    }

    @Column(name="CLUSTER", nullable=false, precision=53, scale=0)
    public double getCluster() {
        return this.cluster;
    }
    
    public void setCluster(double cluster) {
        this.cluster = cluster;
    }

    @Column(name="NLEAF", nullable=false)
    public long getNleaf() {
        return this.nleaf;
    }
    
    public void setNleaf(long nleaf) {
        this.nleaf = nleaf;
    }

    @Column(name="NLEVELS", nullable=false)
    public int getNlevels() {
        return this.nlevels;
    }
    
    public void setNlevels(int nlevels) {
        this.nlevels = nlevels;
    }

    @Column(name="FULLKEYCARD", nullable=false)
    public long getFullkeycard() {
        return this.fullkeycard;
    }
    
    public void setFullkeycard(long fullkeycard) {
        this.fullkeycard = fullkeycard;
    }

    @Column(name="OVERFLOW", nullable=false)
    public long getOverflow() {
        return this.overflow;
    }
    
    public void setOverflow(long overflow) {
        this.overflow = overflow;
    }

    @Column(name="FIRSTKEYCARD", nullable=false)
    public long getFirstkeycard() {
        return this.firstkeycard;
    }
    
    public void setFirstkeycard(long firstkeycard) {
        this.firstkeycard = firstkeycard;
    }

    @Column(name="FIRST2KEYCARD", nullable=false)
    public long getFirst2keycard() {
        return this.first2keycard;
    }
    
    public void setFirst2keycard(long first2keycard) {
        this.first2keycard = first2keycard;
    }

    @Column(name="FIRST3KEYCARD", nullable=false)
    public long getFirst3keycard() {
        return this.first3keycard;
    }
    
    public void setFirst3keycard(long first3keycard) {
        this.first3keycard = first3keycard;
    }

    @Column(name="FIRST4KEYCARD", nullable=false)
    public long getFirst4keycard() {
        return this.first4keycard;
    }
    
    public void setFirst4keycard(long first4keycard) {
        this.first4keycard = first4keycard;
    }

    @Column(name="SEQUENTIAL_PAGES", nullable=false)
    public long getSequentialPages() {
        return this.sequentialPages;
    }
    
    public void setSequentialPages(long sequentialPages) {
        this.sequentialPages = sequentialPages;
    }

    @Column(name="DENSITY", nullable=false)
    public int getDensity() {
        return this.density;
    }
    
    public void setDensity(int density) {
        this.density = density;
    }

    @Column(name="STATS_SRC", nullable=false, length=1)
    public char getStatsSrc() {
        return this.statsSrc;
    }
    
    public void setStatsSrc(char statsSrc) {
        this.statsSrc = statsSrc;
    }

    @Column(name="AVERAGE_SEQUENCE_GAP", nullable=false, precision=53, scale=0)
    public double getAverageSequenceGap() {
        return this.averageSequenceGap;
    }
    
    public void setAverageSequenceGap(double averageSequenceGap) {
        this.averageSequenceGap = averageSequenceGap;
    }

    @Column(name="AVERAGE_SEQUENCE_FETCH_GAP", nullable=false, precision=53, scale=0)
    public double getAverageSequenceFetchGap() {
        return this.averageSequenceFetchGap;
    }
    
    public void setAverageSequenceFetchGap(double averageSequenceFetchGap) {
        this.averageSequenceFetchGap = averageSequenceFetchGap;
    }

    @Column(name="AVERAGE_SEQUENCE_PAGES", nullable=false, precision=53, scale=0)
    public double getAverageSequencePages() {
        return this.averageSequencePages;
    }
    
    public void setAverageSequencePages(double averageSequencePages) {
        this.averageSequencePages = averageSequencePages;
    }

    @Column(name="AVERAGE_SEQUENCE_FETCH_PAGES", nullable=false, precision=53, scale=0)
    public double getAverageSequenceFetchPages() {
        return this.averageSequenceFetchPages;
    }
    
    public void setAverageSequenceFetchPages(double averageSequenceFetchPages) {
        this.averageSequenceFetchPages = averageSequenceFetchPages;
    }

    @Column(name="AVERAGE_RANDOM_PAGES", nullable=false, precision=53, scale=0)
    public double getAverageRandomPages() {
        return this.averageRandomPages;
    }
    
    public void setAverageRandomPages(double averageRandomPages) {
        this.averageRandomPages = averageRandomPages;
    }

    @Column(name="AVERAGE_RANDOM_FETCH_PAGES", nullable=false, precision=53, scale=0)
    public double getAverageRandomFetchPages() {
        return this.averageRandomFetchPages;
    }
    
    public void setAverageRandomFetchPages(double averageRandomFetchPages) {
        this.averageRandomFetchPages = averageRandomFetchPages;
    }

    @Column(name="NUMRIDS", nullable=false)
    public long getNumrids() {
        return this.numrids;
    }
    
    public void setNumrids(long numrids) {
        this.numrids = numrids;
    }

    @Column(name="NUMRIDS_DELETED", nullable=false)
    public long getNumridsDeleted() {
        return this.numridsDeleted;
    }
    
    public void setNumridsDeleted(long numridsDeleted) {
        this.numridsDeleted = numridsDeleted;
    }

    @Column(name="NUM_EMPTY_LEAFS", nullable=false)
    public long getNumEmptyLeafs() {
        return this.numEmptyLeafs;
    }
    
    public void setNumEmptyLeafs(long numEmptyLeafs) {
        this.numEmptyLeafs = numEmptyLeafs;
    }

    @Column(name="ACTIVE_BLOCKS", nullable=false)
    public long getActiveBlocks() {
        return this.activeBlocks;
    }
    
    public void setActiveBlocks(long activeBlocks) {
        this.activeBlocks = activeBlocks;
    }

    @Column(name="NUM_DATA_PARTS", nullable=false)
    public int getNumDataParts() {
        return this.numDataParts;
    }
    
    public void setNumDataParts(int numDataParts) {
        this.numDataParts = numDataParts;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExplainObjectId) ) return false;
		 ExplainObjectId castOther = ( ExplainObjectId ) other; 
         
		 return ( (this.getExplainRequester()==castOther.getExplainRequester()) || ( this.getExplainRequester()!=null && castOther.getExplainRequester()!=null && this.getExplainRequester().equals(castOther.getExplainRequester()) ) )
 && ( (this.getExplainTime()==castOther.getExplainTime()) || ( this.getExplainTime()!=null && castOther.getExplainTime()!=null && this.getExplainTime().equals(castOther.getExplainTime()) ) )
 && ( (this.getSourceName()==castOther.getSourceName()) || ( this.getSourceName()!=null && castOther.getSourceName()!=null && this.getSourceName().equals(castOther.getSourceName()) ) )
 && ( (this.getSourceSchema()==castOther.getSourceSchema()) || ( this.getSourceSchema()!=null && castOther.getSourceSchema()!=null && this.getSourceSchema().equals(castOther.getSourceSchema()) ) )
 && ( (this.getSourceVersion()==castOther.getSourceVersion()) || ( this.getSourceVersion()!=null && castOther.getSourceVersion()!=null && this.getSourceVersion().equals(castOther.getSourceVersion()) ) )
 && (this.getExplainLevel()==castOther.getExplainLevel())
 && (this.getStmtno()==castOther.getStmtno())
 && (this.getSectno()==castOther.getSectno())
 && ( (this.getObjectSchema()==castOther.getObjectSchema()) || ( this.getObjectSchema()!=null && castOther.getObjectSchema()!=null && this.getObjectSchema().equals(castOther.getObjectSchema()) ) )
 && ( (this.getObjectName()==castOther.getObjectName()) || ( this.getObjectName()!=null && castOther.getObjectName()!=null && this.getObjectName().equals(castOther.getObjectName()) ) )
 && ( (this.getObjectType()==castOther.getObjectType()) || ( this.getObjectType()!=null && castOther.getObjectType()!=null && this.getObjectType().equals(castOther.getObjectType()) ) )
 && ( (this.getCreateTime()==castOther.getCreateTime()) || ( this.getCreateTime()!=null && castOther.getCreateTime()!=null && this.getCreateTime().equals(castOther.getCreateTime()) ) )
 && ( (this.getStatisticsTime()==castOther.getStatisticsTime()) || ( this.getStatisticsTime()!=null && castOther.getStatisticsTime()!=null && this.getStatisticsTime().equals(castOther.getStatisticsTime()) ) )
 && (this.getColumnCount()==castOther.getColumnCount())
 && (this.getRowCount()==castOther.getRowCount())
 && (this.getWidth()==castOther.getWidth())
 && (this.getPages()==castOther.getPages())
 && (this.getDistinct()==castOther.getDistinct())
 && ( (this.getTablespaceName()==castOther.getTablespaceName()) || ( this.getTablespaceName()!=null && castOther.getTablespaceName()!=null && this.getTablespaceName().equals(castOther.getTablespaceName()) ) )
 && (this.getOverhead()==castOther.getOverhead())
 && (this.getTransferRate()==castOther.getTransferRate())
 && (this.getPrefetchsize()==castOther.getPrefetchsize())
 && (this.getExtentsize()==castOther.getExtentsize())
 && (this.getCluster()==castOther.getCluster())
 && (this.getNleaf()==castOther.getNleaf())
 && (this.getNlevels()==castOther.getNlevels())
 && (this.getFullkeycard()==castOther.getFullkeycard())
 && (this.getOverflow()==castOther.getOverflow())
 && (this.getFirstkeycard()==castOther.getFirstkeycard())
 && (this.getFirst2keycard()==castOther.getFirst2keycard())
 && (this.getFirst3keycard()==castOther.getFirst3keycard())
 && (this.getFirst4keycard()==castOther.getFirst4keycard())
 && (this.getSequentialPages()==castOther.getSequentialPages())
 && (this.getDensity()==castOther.getDensity())
 && (this.getStatsSrc()==castOther.getStatsSrc())
 && (this.getAverageSequenceGap()==castOther.getAverageSequenceGap())
 && (this.getAverageSequenceFetchGap()==castOther.getAverageSequenceFetchGap())
 && (this.getAverageSequencePages()==castOther.getAverageSequencePages())
 && (this.getAverageSequenceFetchPages()==castOther.getAverageSequenceFetchPages())
 && (this.getAverageRandomPages()==castOther.getAverageRandomPages())
 && (this.getAverageRandomFetchPages()==castOther.getAverageRandomFetchPages())
 && (this.getNumrids()==castOther.getNumrids())
 && (this.getNumridsDeleted()==castOther.getNumridsDeleted())
 && (this.getNumEmptyLeafs()==castOther.getNumEmptyLeafs())
 && (this.getActiveBlocks()==castOther.getActiveBlocks())
 && (this.getNumDataParts()==castOther.getNumDataParts());
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
         result = 37 * result + ( getObjectSchema() == null ? 0 : this.getObjectSchema().hashCode() );
         result = 37 * result + ( getObjectName() == null ? 0 : this.getObjectName().hashCode() );
         result = 37 * result + ( getObjectType() == null ? 0 : this.getObjectType().hashCode() );
         result = 37 * result + ( getCreateTime() == null ? 0 : this.getCreateTime().hashCode() );
         result = 37 * result + ( getStatisticsTime() == null ? 0 : this.getStatisticsTime().hashCode() );
         result = 37 * result + this.getColumnCount();
         result = 37 * result + (int) this.getRowCount();
         result = 37 * result + this.getWidth();
         result = 37 * result + (int) this.getPages();
         result = 37 * result + this.getDistinct();
         result = 37 * result + ( getTablespaceName() == null ? 0 : this.getTablespaceName().hashCode() );
         result = 37 * result + (int) this.getOverhead();
         result = 37 * result + (int) this.getTransferRate();
         result = 37 * result + this.getPrefetchsize();
         result = 37 * result + this.getExtentsize();
         result = 37 * result + (int) this.getCluster();
         result = 37 * result + (int) this.getNleaf();
         result = 37 * result + this.getNlevels();
         result = 37 * result + (int) this.getFullkeycard();
         result = 37 * result + (int) this.getOverflow();
         result = 37 * result + (int) this.getFirstkeycard();
         result = 37 * result + (int) this.getFirst2keycard();
         result = 37 * result + (int) this.getFirst3keycard();
         result = 37 * result + (int) this.getFirst4keycard();
         result = 37 * result + (int) this.getSequentialPages();
         result = 37 * result + this.getDensity();
         result = 37 * result + this.getStatsSrc();
         result = 37 * result + (int) this.getAverageSequenceGap();
         result = 37 * result + (int) this.getAverageSequenceFetchGap();
         result = 37 * result + (int) this.getAverageSequencePages();
         result = 37 * result + (int) this.getAverageSequenceFetchPages();
         result = 37 * result + (int) this.getAverageRandomPages();
         result = 37 * result + (int) this.getAverageRandomFetchPages();
         result = 37 * result + (int) this.getNumrids();
         result = 37 * result + (int) this.getNumridsDeleted();
         result = 37 * result + (int) this.getNumEmptyLeafs();
         result = 37 * result + (int) this.getActiveBlocks();
         result = 37 * result + this.getNumDataParts();
         return result;
   }   


}

