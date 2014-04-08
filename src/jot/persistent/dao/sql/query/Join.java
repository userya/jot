package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.cnd.CndPart;

public interface Join {

	SelectPart getSelectPart();
	
	String getJoinType();
	
	CndPart getJoinCnd();
	
}
