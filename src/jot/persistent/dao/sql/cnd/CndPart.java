package jot.persistent.dao.sql.cnd;

import jot.persistent.dao.sql.SqlPart;

/**
 * 查询语句标の
 * 
 * a.id = ?
 * a.id = b.id
 * a.id > b.id
 * a.id between ? and ?
 * exists(select 1 from xx where xx.c1 = a.id)
 * a.id is not null
 * a.id in (?,?,?)
 * sum(a.id) > ?
 * 
 * @author jkyang
 *
 */
public interface CndPart extends SqlPart {
	
	/**
	 * 与前面一个条件的关系
	 * @return
	 */
	CndRelation getCndRelation();
	
	CndOperation getCndOperation();
	
	CndField getLeft();
	
	CndField getCndRight();
	
	boolean isNot();
}
