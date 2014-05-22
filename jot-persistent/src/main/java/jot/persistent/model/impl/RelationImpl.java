package jot.persistent.model.impl;

import jot.persistent.model.Relation;
import jot.persistent.model.RelationType;
import jot.persistent.model.physical.Table;

public class RelationImpl implements Relation {

	private Table targetTable;
	private String sourceColumnName;
	private String targetColumnName;
	private RelationType relationType;
	
	public Table getTargetTable() {
		return targetTable;
	}
	public void setTargetTable(Table targetTable) {
		this.targetTable = targetTable;
	}
	public String getSourceColumnName() {
		return sourceColumnName;
	}
	public void setSourceColumnName(String sourceColumnName) {
		this.sourceColumnName = sourceColumnName;
	}
	public String getTargetColumnName() {
		return targetColumnName;
	}
	public void setTargetColumnName(String targetColumnName) {
		this.targetColumnName = targetColumnName;
	}
	public RelationType getRelationType() {
		return relationType;
	}
	public void setRelationType(RelationType relationType) {
		this.relationType = relationType;
	}
	
	
	
}
