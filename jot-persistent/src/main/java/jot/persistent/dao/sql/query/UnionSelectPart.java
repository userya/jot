package jot.persistent.dao.sql.query;

public interface UnionSelectPart {

	boolean isUnionAll();

	SelectPart getSelectPart();

}
