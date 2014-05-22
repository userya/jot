package jot.persistent.model.physical.impl;

import jot.persistent.model.physical.Column;

public class ColumnImpl implements Column {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
