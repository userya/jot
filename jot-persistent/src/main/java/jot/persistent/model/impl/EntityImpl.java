package jot.persistent.model.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.model.Entity;
import jot.persistent.model.Relation;
import jot.persistent.model.physical.Table;

public class EntityImpl implements Entity {

	private Table table;
	private List<Relation> relations = new ArrayList<Relation>();

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public List<Relation> getRelations() {
		return relations;
	}

	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

}
