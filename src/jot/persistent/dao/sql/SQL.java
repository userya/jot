package jot.persistent.dao.sql;

import java.util.ArrayList;
import java.util.List;

public class SQL {

	private StringBuilder sql = new StringBuilder();

	private List<Object> parameters = new ArrayList<>();

	public StringBuilder append(String s) {
		sql.append(s);
		return sql;
	}

	public void addParameter(Object value) {
		parameters.add(value);
	}

	public StringBuilder getSql() {
		return sql;
	}

	public List<Object> getParameters() {
		return parameters;
	}
}
