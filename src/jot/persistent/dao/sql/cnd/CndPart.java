package jot.persistent.dao.sql.cnd;

/**
 * 查询语句标の
 * 
 * a.id = ?
 * a.id = b.id
 * a.id between ? and ?
 * exists(select 1 from xx where xx.c1 = a.id)
 * a.id is not null
 * a.id in (?,?,?)
 * sum(a.id) > ?
 * 
 * @author jkyang
 *
 */
public interface CndPart {

	CndField getLeft();
	
	CndOperation getCndOperation();
	
	CndField getCndRight();
}
