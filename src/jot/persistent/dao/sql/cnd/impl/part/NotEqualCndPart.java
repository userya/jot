package jot.persistent.dao.sql.cnd.impl.part;

import jot.persistent.dao.sql.SQL;


public class NotEqualCndPart extends BaseCndPartImpl {

	@Override
	public void appendSqlPart(SQL sql) {
		getCndLeft().appendSql(sql);
		sql.append(" <> ");
		getCndRight().appendSql(sql);
	}

}
