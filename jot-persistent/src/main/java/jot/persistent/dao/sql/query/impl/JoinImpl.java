package jot.persistent.dao.sql.query.impl;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.query.Join;
import jot.persistent.dao.sql.query.JoinType;
import jot.persistent.dao.sql.query.Select;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.dao.sql.query.SelectTable;

public class JoinImpl implements Join {

	private SelectPart selectPart;
	private JoinType joinType;
	private CndSection joinCnd;

	@Override
	public void appendSql(SQL sql) {
		sql.append(" ").append(joinType.getKeyWord()).append(" ");
		if(selectPart instanceof Select) {
			sql.append("(");
			selectPart.appendSql(sql);
			sql.append(")");
		}else if(selectPart instanceof SelectTable){
			selectPart.appendSql(sql);			
		}
		sql.append(" as ").append(selectPart.getAlias());
		sql.append(" on ");
		joinCnd.appendSql(sql);
	}

	public SelectPart getSelectPart() {
		return selectPart;
	}

	public void setSelectPart(SelectPart selectPart) {
		this.selectPart = selectPart;
	}

	public JoinType getJoinType() {
		return joinType;
	}

	public void setJoinType(JoinType joinType) {
		this.joinType = joinType;
	}

	public CndSection getJoinCnd() {
		return joinCnd;
	}

	public void setJoinCnd(CndSection joinCnd) {
		this.joinCnd = joinCnd;
	}

}
