package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.cnd.Where;

public class WhereImpl implements Where {

	private CndSection cndSection;

	@Override
	public void appendSql(SQL sql) {
		sql.append(" where ");
		cndSection.appendSql(sql);
	}

	public CndSection getCndSection() {
		return cndSection;
	}

	public void setCndSection(CndSection cndSection) {
		this.cndSection = cndSection;
	}

}
