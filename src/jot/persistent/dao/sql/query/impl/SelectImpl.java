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
import jot.persistent.dao.sql.query.SelectTable;

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
		sql.append("select ");
		if (isDistinct()) {
			sql.append("distinct ");
		}
		List<SelectColumn> columns = this.getSelectColumns();
		if (columns == null || columns.isEmpty()) {
			// TODO
			throw new RuntimeException("没有找到查询字段");
		}
		for (int i = 0; i < columns.size(); i++) {
			SelectColumn selectColumn = columns.get(i);
			SelectPart sp = selectColumn.getSelectPart();
			String alias = aliasMap.getAlias(sp);
			String cname = selectColumn.getColumn().getName();
			sql.append(alias).append(".").append(cname);

			// alias
			sql.append(" ");
			sql.append(alias).append("_").append(cname);
			if (i != columns.size() - 1) {
				sql.append(",");
			}
		}
		SelectPart sp = this.getMainSelectPart();
		if (sp instanceof Select) {

		} else if (sp instanceof SelectTable) {

		}
	}

	public void build() {

	}

	protected void build(int level) {
		// 分配别名：表别名，字段别名
		AliasGenerator aliasGenerator = new AliasGenerator(level);
		SelectPart main = getMainSelectPart();
		String mainAlias = aliasGenerator.getNextAlias();
		List<Join> joins = getJoins();
		if (joins != null) {
			for (Join join : joins) {
				SelectPart sp = join.getSelectPart();
				String jAlias = aliasGenerator.getNextAlias();
				sp.setAlias(jAlias);
			}
		}
	}

	@Override
	public String getSql(int level) {
		AliasGenerator aliasGenerator = new AliasGenerator(level);
		AliasMap aliasMap = new AliasMapImpl(level);
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

	@Override
	public String getAlias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAlias(String alias) {
		// TODO Auto-generated method stub
		
	}

}
