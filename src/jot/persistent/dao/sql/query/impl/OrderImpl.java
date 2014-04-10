package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.query.Order;
import jot.persistent.dao.sql.query.SelectColumn;

public class OrderImpl implements Order {

	private SelectColumn column;

	@Override
	public void appendSql(SQL sql) {
		sql.append(column.getColumnName());
	}

	public SelectColumn getColumn() {
		return column;
	}

	public void setColumn(SelectColumn column) {
		this.column = column;
	}

}
