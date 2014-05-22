package jot.persistent.model;

import java.util.List;

import jot.persistent.model.physical.Table;

public interface Entity {

	Table getTable();

	List<Relation> getRelations();

}
