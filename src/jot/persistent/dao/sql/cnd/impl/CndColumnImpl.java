package jot.persistent.dao.sql.cnd.impl;

import java.util.List;

import jot.persistent.dao.sql.cnd.CndColumn;
import jot.persistent.dao.sql.function.Function;
import jot.persistent.dao.sql.query.Select;
import jot.persistent.dao.sql.query.SelectColumn;
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
		if(sp instanceof Select) {
			return sp.getAlias() + "_" + getColumn().getName();
		}
		String c = sp.getAlias() + "_" + getColumn().getName();
		return c;
	}

	@Override
	public String getColumnName() {
		SelectPart sp = getSelectPart();
		if(sp instanceof Select) {
			Select s = (Select)sp;
			List<SelectColumn> sc = s.getSelectColumns();
			for (SelectColumn selectColumn : sc) {
				if(selectColumn.getColumn().equals(this.getColumn())){
					return sp.getAlias() + "." + selectColumn.getColumnAlias();
				}
			}
		}
		String c = sp.getAlias() + "." + getColumn().getName();
		return c;
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	public void setSelectPart(SelectPart selectPart) {
		this.selectPart = selectPart;
	}

}
