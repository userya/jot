package jot.persistent.dao.sql.cnd;

import jot.persistent.dao.sql.function.Function;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.model.physical.Column;

public interface CndColumn  {
	
	/**
	 * 字段别名
	 * @return
	 */
	String getColumnAlias();
	
	/**
	 * 字段真实名称
	 * @return
	 */
	String getColumnName();
	
	/**
	 * @return
	 */
	SelectPart getSelectPart();
	
	/**
	 * @return
	 */
	Column getColumn();

	/**
	 * 是否有函数
	 * 
	 * @return
	 */
	boolean hasFunction();

	/**
	 * 函数
	 * 
	 * @return
	 */
	Function getFunction();
}
