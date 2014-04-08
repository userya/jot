package jot.persistent.dao.query;

import jot.persistent.dao.cnd.CndPart;

public interface Join {

	SelectPart getSelectPart();
	
	String getJoinType();
	
	CndPart getJoinCnd();
	
}
