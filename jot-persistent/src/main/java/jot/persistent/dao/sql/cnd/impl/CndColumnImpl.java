package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.cnd.CndColumn;
import jot.persistent.dao.sql.function.Function;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.model.physical.Column;

public class CndColumnImpl implements CndColumn {

	private Column column;

	private SelectPart selectPart;

	@Override
	public Column getColumn() {
		return column;
	}

	@Override
	public boolean hasFunction() {
		return false;
	}

	@Override
	public Function getFunction() {
		return null;
	}

	@Override
	public SelectPart getSelectPart() {
		return selectPart;
	}

	@Override
	public String getColumnAlias() {
		SelectPart sp = getSelectPart();
		
		return sp.getColumnAlias(column);
	}

	@Override
	public String getColumnName() {
		SelectPart sp = getSelectPart();
		return sp.getColumnName(column);
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	public void setSelectPart(SelectPart selectPart) {
		this.selectPart = selectPart;
	}

}
