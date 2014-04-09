package jot.persistent.model;

import jot.persistent.model.physical.Table;

public interface Relation {

	String getSourceColumnName();
	
	Table getTargetTable();

	String getTargetColumnName();

	RelationType getRelationType();

}
