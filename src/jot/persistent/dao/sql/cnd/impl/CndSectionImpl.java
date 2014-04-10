package jot.persistent.dao.sql.cnd.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.cnd.impl.part.BaseCndPartImpl;

public class CndSectionImpl extends BaseCndPartImpl implements CndSection {

	private List<CndPart> cndParts = new ArrayList<>();

	@Override
	public void appendSql(SQL sql) {
		if (cndParts != null && !cndParts.isEmpty()) {
			for (int i = 0; i < cndParts.size(); i++) {
				CndPart cp = cndParts.get(i);
				boolean isSection = cp instanceof CndSection;
				
				if (i != 0) {
					sql.append(" ");
					sql.append(cp.getCndRelation().name());
					sql.append(" ");
				}
				if(isSection){
					sql.append("(");
				}
				cp.appendSql(sql);
				if(isSection){
					sql.append(")");
				}
			}
		}
	}

	public List<CndPart> getCndParts() {
		return cndParts;
	}

	public void setCndParts(List<CndPart> cndParts) {
		this.cndParts = cndParts;
	}

	@Override
	protected void appendSqlPart(SQL sql) {
		// DO Nothing
	}

}
