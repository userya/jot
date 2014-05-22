package jot.persistent.dao.sql.cnd.impl.part;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndField;
import jot.persistent.dao.sql.cnd.CndOperation;
import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.CndRelation;

public abstract class BaseCndPartImpl implements CndPart {

	private CndRelation cndRelation;

	private CndOperation cndOperation;
	private CndField cndLeft;
	private CndField cndRight;
	private boolean not;

	@Override
	public CndOperation getCndOperation() {
		return cndOperation;
	}

	@Override
	public CndField getCndRight() {
		return cndRight;
	}

	public CndField getCndLeft() {
		return cndLeft;
	}

	public void setCndLeft(CndField cndLeft) {
		this.cndLeft = cndLeft;
	}

	public void setCndOperation(CndOperation cndOperation) {
		this.cndOperation = cndOperation;
	}

	public void setCndRight(CndField cndRight) {
		this.cndRight = cndRight;
	}

	@Override
	public boolean isNot() {
		return not;
	}

	public void setNot(boolean not) {
		this.not = not;
	}

	@Override
	public CndRelation getCndRelation() {
		return cndRelation;
	}

	public void setCndRelation(CndRelation cndRelation) {
		this.cndRelation = cndRelation;
	}

	@Override
	public void appendSql(SQL sql) {
		if (isNot()) {
			sql.append("NOT (");
		}
		appendSqlPart(sql);
		if (isNot()) {
			sql.append(") ");
		}
	}

	abstract protected void appendSqlPart(SQL sql);
}
