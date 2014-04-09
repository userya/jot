package jot.persistent.dao.sql;


/**
 * SQL 部分
 * @author JJ
 *
 */
public interface SqlPart {

	/**
	 * 生成SQL
	 * @return
	 */
	void appendSql(StringBuilder sql, AliasMap aliasMap);
	
}
