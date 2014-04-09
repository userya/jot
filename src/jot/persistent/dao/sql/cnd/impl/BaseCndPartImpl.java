package jot.persistent.dao.sql.cnd.impl;

import jot.persistent.dao.sql.cnd.CndField;
import jot.persistent.dao.sql.cnd.CndOperation;
import jot.persistent.dao.sql.cnd.CndPart;

public class BaseCndPartImpl implements CndPart {

	private CndOperation cndOperation;
	private CndField cndLeft;
	private CndField cndRight;
	private boolean not;

	@Override
	public CndOperation getCndOperation() {
		return cndOperation;
	}

	@Override
	public CndField getLeft() {
		return cndLeft;
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
}
