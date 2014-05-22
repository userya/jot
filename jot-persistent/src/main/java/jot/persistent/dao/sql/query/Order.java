package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;

public interface Order extends SqlPart{

	SelectColumn getColumn();
	
}
