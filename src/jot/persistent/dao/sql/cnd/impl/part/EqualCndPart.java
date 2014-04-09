package jot.persistent.dao.sql.cnd.impl.part;

import jot.persistent.dao.sql.cnd.CndOperationType;
import jot.persistent.dao.sql.cnd.impl.CndOperationImpl;

public class EqualCndPart extends BaseCndPartImpl {

	public EqualCndPart() {
		this.setCndOperation(new CndOperationImpl(CndOperationType.equals));
	}

	@Override
	public void appendSql(StringBuilder sql) {
		// TODO Auto-generated method stub
		
	}

}
