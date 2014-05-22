package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;
import jot.persistent.dao.sql.cnd.CndSection;

public interface Having extends SqlPart{

	CndSection getCndSection();
	
}
