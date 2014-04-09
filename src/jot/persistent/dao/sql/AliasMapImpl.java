package jot.persistent.dao.sql;

import java.util.HashMap;

import jot.persistent.dao.sql.query.SelectPart;

public class AliasMapImpl extends HashMap<SelectPart, String> implements AliasMap {

	private static final long serialVersionUID = 6542033149344095933L;
	
	public AliasMapImpl(int level) {
		super();
		this.level = level;
	}
	
	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public void registAlias(SelectPart select, String alias) {
		this.put(select, alias);
	}

	@Override
	public String getAlias(SelectPart select) {
		return this.get(select);
	}

}
