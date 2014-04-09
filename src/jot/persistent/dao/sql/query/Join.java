package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;
import jot.persistent.dao.sql.cnd.CndPart;

public interface Join extends SqlPart {

	SelectPart getSelectPart();
	
	String getJoinType();
	
	CndPart getJoinCnd();
	
}
