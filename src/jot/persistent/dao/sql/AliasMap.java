package jot.persistent.dao.sql;

import jot.persistent.dao.sql.query.SelectPart;

/**
 * 别名
 * 
 * @author JJ
 * 
 */
public interface AliasMap {

	void registAlias(SelectPart select, String alias);

	String getAlias(SelectPart select);
	
	int getLevel();
}
