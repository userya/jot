package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SqlPart;
import jot.persistent.model.physical.Column;

/**
 * 查询主体标志
 * @author user
 *
 */
public interface SelectPart extends SqlPart {
	
	String getAlias();
	
	void setAlias(String alias);
	
	String getColumnAlias(Column column);
	
	String getColumnName(Column column);
	
}
