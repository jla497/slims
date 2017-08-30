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
 * AdviseTable generated by hbm2java
 */
@Entity
@Table(name="ADVISE_TABLE"
    ,schema="ALLERGEN"
)
public class AdviseTable  implements java.io.Serializable {


     private AdviseTableId id;
     private AdviseInstance adviseInstance;

    public AdviseTable() {
    }

	
    public AdviseTable(AdviseTableId id) {
        this.id = id;
    }
    public AdviseTable(AdviseTableId id, AdviseInstance adviseInstance) {
       this.id = id;
       this.adviseInstance = adviseInstance;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="runId", column=@Column(name="RUN_ID", length=26) ), 
        @AttributeOverride(name="tableName", column=@Column(name="TABLE_NAME", nullable=false, length=128) ), 
        @AttributeOverride(name="tableSchema", column=@Column(name="TABLE_SCHEMA", nullable=false, length=128) ), 
        @AttributeOverride(name="tablespace", column=@Column(name="TABLESPACE", nullable=false, length=128) ), 
        @AttributeOverride(name="selectionFlag", column=@Column(name="SELECTION_FLAG", nullable=false, length=8) ), 
        @AttributeOverride(name="tableExists", column=@Column(name="TABLE_EXISTS", nullable=false, length=1) ), 
        @AttributeOverride(name="useTable", column=@Column(name="USE_TABLE", nullable=false, length=1) ), 
        @AttributeOverride(name="genColumns", column=@Column(name="GEN_COLUMNS", nullable=false) ), 
        @AttributeOverride(name="organizeBy", column=@Column(name="ORGANIZE_BY", nullable=false) ), 
        @AttributeOverride(name="creationText", column=@Column(name="CREATION_TEXT", nullable=false) ), 
        @AttributeOverride(name="alterCommand", column=@Column(name="ALTER_COMMAND", nullable=false) ), 
        @AttributeOverride(name="diskuse", column=@Column(name="DISKUSE", nullable=false, precision=53, scale=0) ) } )
    public AdviseTableId getId() {
        return this.id;
    }
    
    public void setId(AdviseTableId id) {
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


