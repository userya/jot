package jot.persistent.dao.insert;

import jot.persistent.model.physical.Table;

public interface Insert {

	Table getTable();

	/**
	 * 生成SQL
	 * @return
	 */
	String getSql();
	
}
