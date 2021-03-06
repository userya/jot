package jot.persistent.model.physical.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.Table;

public class TableImpl implements Table {

	private String name;
	private String primaryColumnName;
	private List<Column> columns = new ArrayList<>();

	public Table addColumn(Column column) {
		if (column != null) {
			columns.add(column);
		}
		return this;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPrimaryColumnName() {
		return primaryColumnName;
	}

	@Override
	public List<Column> getColumns() {
		return columns;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrimaryColumnName(String primaryColumnName) {
		this.primaryColumnName = primaryColumnName;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

}
