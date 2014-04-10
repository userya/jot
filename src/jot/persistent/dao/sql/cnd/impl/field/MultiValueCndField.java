package jot.persistent.dao.sql.cnd.impl.field;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndField;

public class MultiValueCndField implements CndField {

	private List<Object> values = new ArrayList<>();

	public List<Object> getValues() {
		return values;
	}

	public void setValues(List<Object> values) {
		this.values = values;
	}

	@Override
	public void appendSql(SQL sql) {
		
	}

}