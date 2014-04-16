package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.cnd.CndOperation;
import jot.persistent.dao.sql.cnd.CndOperationType;

public class CndOperationImpl implements CndOperation {

	private CndOperationType type;
	
	public CndOperationImpl(CndOperationType type) {
		this.type = type;
	}
	
	@Override
	public CndOperationType getOperationType() {
		return type;
	}

}
