package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.AliasMap;
import jot.persistent.dao.sql.cnd.CndColumn;
import jot.persistent.dao.sql.function.Function;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.model.physical.Column;

public class CndColumnImpl implements CndColumn {

	@Override
	public Column getColumn() {
		return null;
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
	public void appendSql(StringBuilder sql) {
		
	}

	@Override
	public SelectPart getSelectPart() {
		return null;
	}

	@Override
	public String getColumnAlias() {
		SelectPart sp = getSelectPart();
		String c = sp.getAlias() + "_" + getColumn().getName();
		return c;
	}

	@Override
	public String getColumnName() {
		SelectPart sp = getSelectPart();
		String c = sp.getAlias() + "." + getColumn().getName();
		return c;
	}

}
