package jot.persistent.dao.sql.insert;

import jot.persistent.model.physical.Table;

public interface Insert {

	Table getTable();

	/**
	 * 生成SQL
	 * @return
	 */
	String getSql();
	
}
