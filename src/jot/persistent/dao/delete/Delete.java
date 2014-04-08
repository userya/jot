package jot.persistent.dao.delete;

import java.util.List;

import jot.persistent.dao.cnd.CndPart;

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
