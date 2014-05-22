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
	 * 与前面一个条件的关系,不参与到appendSql中去
	 * @return
	 */
	CndRelation getCndRelation();
	
	void setCndRelation(CndRelation cndRelation);
	
	CndOperation getCndOperation();
	
	CndField getCndLeft();
	
	CndField getCndRight();
	
	boolean isNot();
}
