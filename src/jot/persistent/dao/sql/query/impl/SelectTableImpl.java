package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.query.SelectTable;
import jot.persistent.model.physical.Table;

public class SelectTableImpl implements SelectTable {

	private String alias;
	private Table table;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
	
	public void appendSql(StringBuilder sql) {
		sql.append(table.getName());
	}

}
