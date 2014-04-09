package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;

/**
 * 查询主体标志
 * @author user
 *
 */
public interface SelectPart extends SqlPart {
	
	String getAlias();
	
	void setAlias(String alias);
	
}
