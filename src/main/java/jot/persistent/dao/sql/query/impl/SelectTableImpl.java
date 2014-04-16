package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.query.SelectTable;
import jot.persistent.model.physical.Column;
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

	@Override
	public String getColumnAlias(Column column) {
		String c = getAlias() + "_" + column.getName();
		return c;
	}

	@Override
	public String getColumnName(Column column) {
		String c = getAlias() + "." + column.getName();
		return c;
	}

	@Override
	public void appendSql(SQL sql) {
		sql.append(table.getName());
	}

}
