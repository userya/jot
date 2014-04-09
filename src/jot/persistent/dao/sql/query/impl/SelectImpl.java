package jot.persistent.dao.sql.query.impl;

import java.util.List;

import jot.persistent.dao.sql.AliasGenerator;
import jot.persistent.dao.sql.AliasMap;
import jot.persistent.dao.sql.AliasMapImpl;
import jot.persistent.dao.sql.cnd.Where;
import jot.persistent.dao.sql.query.Groups;
import jot.persistent.dao.sql.query.Having;
import jot.persistent.dao.sql.query.Join;
import jot.persistent.dao.sql.query.Orders;
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
	public Orders getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Groups getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Having getHaving() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appendSql(StringBuilder sql) {
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
			sql.append(selectColumn.getColumnName());
			// alias
			sql.append(" ");
			sql.append(selectColumn.getColumnAlias());
			if (i != columns.size() - 1) {
				sql.append(",");
			}
		}
		sql.append(" from ");
		SelectPart sp = this.getMainSelectPart();
		if (sp instanceof Select) {
			sql.append("(");
			sp.appendSql(sql);
			sql.append(")");
		} else if (sp instanceof SelectTable) {
			sp.appendSql(sql);
		}
		sql.append(" as ");
		sql.append(sp.getAlias());
		if (this.getJoins() != null) {
			for (int i = 0; i < this.getJoins().size(); i++) {
				Join join = getJoins().get(i);
				join.appendSql(sql);
			}
		}
		if (this.getWhere() != null) {
			getWhere().appendSql(sql);
		}
		if (this.getGroups() != null) {
			getGroups().appendSql(sql);
		}
		if (this.getHaving() != null) {
			getHaving().appendSql(sql);
		}
		if (this.getOrders() != null) {
			getOrders().appendSql(sql);
		}
	}

	

	/**
	 * select a1,a2 from xx a join xx1 b on a.id = b.id where xx = ?
	 * 
	 * select a1,a2 from (select aa as a1,bb as b1from xx where xx = ?) bb left
	 * join xx on bb.a1 = xx.id where xx = ?
	 */
	public void build(int level) {
		// 分配别名：表别名，字段别名
		AliasGenerator aliasGenerator = new AliasGenerator(level);
		SelectPart main = getMainSelectPart();
		String mainAlias = aliasGenerator.getNextAlias();
		main.setAlias(mainAlias);
		List<Join> joins = getJoins();
		if (joins != null) {
			for (Join join : joins) {
				SelectPart sp = join.getSelectPart();
				String jAlias = aliasGenerator.getNextAlias();
				sp.setAlias(jAlias);
				if (sp instanceof Select) {
					Select select = (Select) sp;
					select.build(++level);
				}
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
		appendSql(sql);
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

	@Override
	public Where getWhere() {
		return null;
	}

}
