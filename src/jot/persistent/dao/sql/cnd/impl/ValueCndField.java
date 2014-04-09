package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.cnd.CndField;

public class ValueCndField implements CndField {

	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
