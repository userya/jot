package jot.persistent.dao.cnd;

/**
 * 查询语句标の
 * @author user
 *
 */
public interface CndPart {

	CndField getLeft();
	
	CndOperation getCndOperation();
	
	CndField getCndRight();
}
