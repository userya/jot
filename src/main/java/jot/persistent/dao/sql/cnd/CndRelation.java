package jot.persistent.dao.sql.cnd;

public enum CndRelation {
	AND("and"), OR("or");

	String key;

	CndRelation(String key) {
		this.key = key;
	}

	public String getKeyWord() {
		return key;
	}
}
