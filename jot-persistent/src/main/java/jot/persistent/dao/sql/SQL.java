package jot.persistent.dao.sql;

import java.util.ArrayList;
import java.util.List;

public class SQL {

	private StringBuilder sql = new StringBuilder();

	private List<Object> parameters = new ArrayList<Object>();

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.sql.toString()).append("\nparameters:[");
		for (int i = 0; i < parameters.size(); i++) {
			Object v = parameters.get(i);
			sb.append(String.valueOf(v));
			if (i != parameters.size() - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
