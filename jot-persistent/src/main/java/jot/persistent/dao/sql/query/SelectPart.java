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
	
	/**
	 * 根据column 得到列的别名作为查询字段的别名
	 * @param column
	 * @return  select [a.xxx] as a_xxx from table a where a.id = ?
	 * 			 select b.* from (select *  from table a) b
	 */
	String getColumnAlias(Column column);
	
	/**
	 *  根据column 得到列的别名作为查询字段名称
	 * @param column
	 * @return select a.xxx as [a_xxx] from table a where a.id = ?
	 */
	String getColumnName(Column column);
	
}
