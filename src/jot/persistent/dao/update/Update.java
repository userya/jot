package jot.persistent.dao.update;

import java.util.List;

import jot.persistent.dao.cnd.CndPart;


public interface Update {

	UpdateTable getTable();
	
	List<CndPart> getCndPart();
	
	/**
	 * 生成SQL
	 * @return
	 */
	String getSql();
}
