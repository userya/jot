package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.dao.sql.query.UnionSelectPart;

public class UnionSelectPartImpl implements UnionSelectPart{

	private boolean unionAll;
	
	private SelectPart selectPart;

	public boolean isUnionAll() {
		return unionAll;
	}

	public void setUnionAll(boolean unionAll) {
		this.unionAll = unionAll;
	}

	public SelectPart getSelectPart() {
		return selectPart;
	}

	public void setSelectPart(SelectPart selectPart) {
		this.selectPart = selectPart;
	}
	
	
	
}
