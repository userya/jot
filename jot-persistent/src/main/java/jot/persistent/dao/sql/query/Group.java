package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;

public interface Group extends SqlPart {

	SelectColumn getColumn();
	
}
