package jot.persistent.dao.sql.cnd;

import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.impl.CndSectionImpl;
import jot.persistent.dao.sql.cnd.impl.part.EqualCndPart;

/**
 * TODO
 * @author user
 *
 */
public class CndBuilder implements CndSection {

	private CndSectionImpl section = new CndSectionImpl();

	public CndBuilder addEqualCndPart(EqualCndPart part){
		section.addCndPart(part);
		return this;
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
	public CndRelation getCndRelation() {
		return null;
	}

	@Override
	public void setCndRelation(CndRelation cndRelation) {
		
	}

	@Override
	public CndOperation getCndOperation() {
		return null;
	}

	@Override
	public CndField getCndLeft() {
		return null;
	}

	@Override
	public CndField getCndRight() {
		return null;
	}

	@Override
	public boolean isNot() {
		return false;
	}

}
