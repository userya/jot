package jot.persistent.model;

import jot.persistent.model.physical.Table;

public interface Relation {

	Table getTargetTable();

	String getSourceColumnName();

	String getTargetColumnName();

	RelationType getRelationType();

}
