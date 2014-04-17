package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.query.Having;

public class HavingImpl implements Having {

	private CndSection cndSection;
	
	@Override
	public void appendSql(SQL sql) {
		sql.append(" having ");
		cndSection.appendSql(sql);
	}

	public CndSection getCndSection() {
		return cndSection;
	}

	public void setCndSection(CndSection cndSection) {
		this.cndSection = cndSection;
	}

	
	

}
