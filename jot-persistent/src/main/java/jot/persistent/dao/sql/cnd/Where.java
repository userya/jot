package jot.persistent.dao.sql.cnd;

import jot.persistent.dao.sql.SqlPart;

public interface Where extends SqlPart {

	CndSection getCndSection();
	
	void setCndSection(CndSection cndSection);
	
}
