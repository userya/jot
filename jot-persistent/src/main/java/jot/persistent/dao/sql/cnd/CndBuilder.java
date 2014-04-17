package jot.persistent.dao.sql.cnd;

import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.impl.CndSectionImpl;
import jot.persistent.dao.sql.cnd.impl.part.BaseCndPartImpl;
import jot.persistent.dao.sql.cnd.impl.part.EqualCndPart;

/**
 * TODO
 * @author user
 *
 */
public class CndBuilder extends BaseCndPartImpl implements CndSection {

	private CndSectionImpl section = new CndSectionImpl();

	public static CndBuilder create(){
		return new CndBuilder();
	}
	
	public CndBuilder addEqualCndPart(EqualCndPart part){
		section.addCndPart(part);
		return this;
	}
	
	public CndBuilder and(CndPart cnd) {
		addCndPart(cnd, CndRelation.AND);
		return this;
	}

	public CndBuilder or(CndPart cnd) {
		addCndPart(cnd, CndRelation.OR);
		return this;
	}

	protected void addCndPart(CndPart cnd, CndRelation rel) {
		cnd.setCndRelation(rel);
		section.addCndPart(cnd);
	}
	
	@Override
	public void appendSql(SQL sql) {
		section.appendSql(sql);
	}

	@Override
	public List<CndPart> getCndParts() {
		return section.getCndParts();
	}

	@Override
	public boolean isEmpty() {
		return section.isEmpty();
	}

	@Override
	public void addCndPart(CndPart part) {
		section.addCndPart(part);
	}

	@Override
	protected void appendSqlPart(SQL sql) {
		//DO Nothing
	}

}
