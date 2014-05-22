package jot.persistent.dao.sql.update;

import java.util.List;

import jot.persistent.dao.sql.cnd.CndPart;


public interface Update {

	UpdateTable getTable();
	
	List<CndPart> getCndPart();
	
	/**
	 * 生成SQL
	 * @return
	 */
	String getSql();
}
