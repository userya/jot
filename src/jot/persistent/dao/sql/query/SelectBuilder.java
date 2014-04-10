package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.query.impl.SelectImpl;

public class SelectBuilder {

	private SelectImpl instance = new SelectImpl();

	public SelectBuilder setMainSelectPart(SelectPart sp) {
		instance.setMainSelectPart(sp);
		return this;
	}

	public SelectBuilder addJoin(Join join) {
		instance.getJoins().add(join);
		return this;
	}

}
