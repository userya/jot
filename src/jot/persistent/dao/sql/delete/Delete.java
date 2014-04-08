package jot.persistent.dao.sql.delete;

import java.util.List;

import jot.persistent.dao.sql.cnd.CndPart;

public interface Delete {

	DeleteTable getTable();

	List<CndPart> getCondition();

	/**
	 * 生成SQL
	 * 
	 * @return
	 */
	String getSql();
}
