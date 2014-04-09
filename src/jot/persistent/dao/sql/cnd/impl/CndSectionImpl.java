package jot.persistent.dao.sql.cnd.impl;

import java.util.List;

import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.CndSection;

public class CndSectionImpl implements CndSection {

	private List<CndPart> cndParts;

	@Override
	public void appendSql(StringBuilder sql) {
		if (cndParts != null && !cndParts.isEmpty()) {
			for (int i = 0; i < cndParts.size(); i++) {
				CndPart cp = cndParts.get(i);
				if(i != 0) {
					sql.append(cp.getCndRelation().name());
				}
				cp.appendSql(sql);
			}
		}
	}

	public List<CndPart> getCndParts() {
		return cndParts;
	}

	public void setCndParts(List<CndPart> cndParts) {
		this.cndParts = cndParts;
	}

}
