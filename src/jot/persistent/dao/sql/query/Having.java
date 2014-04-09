package jot.persistent.dao.sql.query;

import java.util.List;

import jot.persistent.dao.sql.SqlPart;
import jot.persistent.dao.sql.cnd.CndPart;

public interface Having extends SqlPart{

	List<CndPart> getCndParts();
	
}
