package jot.persistent.dao.sql.cnd;

import jot.persistent.dao.sql.SqlPart;
import jot.persistent.dao.sql.function.Function;
import jot.persistent.model.physical.Column;

public interface CndColumn extends SqlPart {
	
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
