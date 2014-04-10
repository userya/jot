package jot.persistent.dao.sql.query;

public enum JoinType {
	
	
	INNER_JOIN("inner join"), LEFT_JOIN("left join"), RIGHT_JOIN ("right join");
	String key;
	JoinType(String key) {
		this.key = key;
	}
	
	public String getKeyWord(){
		return key;
	}
}
