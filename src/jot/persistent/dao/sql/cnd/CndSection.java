package jot.persistent.dao.sql.cnd;

import java.util.List;

import jot.persistent.dao.sql.SqlPart;

public interface CndSection extends SqlPart {

	List<CndPart> getCndParts();

}
