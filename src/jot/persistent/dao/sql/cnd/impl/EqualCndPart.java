package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.cnd.CndOperationType;

public class EqualCndPart extends BaseCndPartImpl {

	public EqualCndPart() {
		this.setCndOperation(new CndOperationImpl(CndOperationType.equals));
	}
	
}
