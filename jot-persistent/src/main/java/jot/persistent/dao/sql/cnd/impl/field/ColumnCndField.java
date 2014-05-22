package jot.persistent.dao.sql.cnd.impl.field;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndColumn;
import jot.persistent.dao.sql.cnd.CndField;

/**
 * 查询字段
 * @author JJ
 *
 */
public class ColumnCndField implements CndField {
	
	private CndColumn cndColumn;

	public CndColumn getCndColumn() {
		return cndColumn;
	}

	public void setCndColumn(CndColumn cndColumn) {
		this.cndColumn = cndColumn;
	}

	@Override
	public void appendSql(SQL sql) {
		sql.append(this.getCndColumn().getColumnName());
	}
	
}