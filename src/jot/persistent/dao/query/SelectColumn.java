package jot.persistent.dao.query;

import jot.persistent.dao.function.Function;
import jot.persistent.model.physical.Column;

public interface SelectColumn {

	Column getColumn();
	
	/**
	 * 是否有函数
	 * @return
	 */
	boolean hasFunction();
	
	/**
	 * 函数
	 * @return
	 */
	Function getFunction();
	
}
