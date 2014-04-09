package jot.persistent.dao.sql.query.impl;

import java.util.List;

import jot.persistent.dao.sql.AliasGenerator;
import jot.persistent.dao.sql.AliasMap;
import jot.persistent.dao.sql.AliasMapImpl;
import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.query.Group;
import jot.persistent.dao.sql.query.Having;
import jot.persistent.dao.sql.query.Join;
import jot.persistent.dao.sql.query.Order;
import jot.persistent.dao.sql.query.Select;
import jot.persistent.dao.sql.query.SelectColumn;
import jot.persistent.dao.sql.query.SelectPart;

public class SelectImpl implements Select {

	@Override
	public boolean isDistinct() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SelectColumn> getSelectColumns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SelectPart getMainSelectPart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Join> getJoins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CndPart> getConditions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Having getHaving() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appendSql(StringBuilder sql, AliasMap aliasMap) {
		sql.append("select");
		if (isDistinct()) {
			sql.append("distinct");
		}
		List<SelectColumn> columns = this.getSelectColumns();
		if(columns == null || columns.isEmpty()) {
			//TODO
			throw new RuntimeException("没有找到查询字段");
		}
		
	}

	@Override
	public String getSql(int level) {
		AliasGenerator aliasGenerator = new AliasGenerator(level);
		AliasMap aliasMap = new AliasMapImpl();
		SelectPart main = getMainSelectPart();
		String mainAlias = aliasGenerator.getNextAlias();
		aliasMap.registAlias(main, mainAlias);
		List<Join> joins = getJoins();
		if (joins != null) {
			for (Join join : joins) {
				SelectPart sp = join.getSelectPart();
				String jAlias = aliasGenerator.getNextAlias();
				aliasMap.registAlias(sp, jAlias);
			}
		}
		StringBuilder sql = new StringBuilder();
		appendSql(sql, aliasMap);
		return sql.toString();
	}

}
