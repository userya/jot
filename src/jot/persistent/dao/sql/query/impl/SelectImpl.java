package jot.persistent.dao.sql.query.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.AliasGenerator;
import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.Where;
import jot.persistent.dao.sql.query.Groups;
import jot.persistent.dao.sql.query.Having;
import jot.persistent.dao.sql.query.Join;
import jot.persistent.dao.sql.query.Orders;
import jot.persistent.dao.sql.query.Select;
import jot.persistent.dao.sql.query.SelectColumn;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.dao.sql.query.SelectTable;
import jot.persistent.model.physical.Column;

public class SelectImpl implements Select {

	private boolean distinct;
	private List<SelectColumn> selectColumns = new ArrayList<>();
	private SelectPart mainSelectPart;
	private List<Join> joins  = new ArrayList<>();
	private Orders orders;
	private Groups groups;
	private Having having;
	private String alias;
	private Where where;
	

	@Override
	public String getColumnAlias(Column column) {
		List<SelectColumn> sc = getSelectColumns();
		for (SelectColumn selectColumn : sc) {
			if (selectColumn.getColumn().equals(column)) {
				return getAlias() + "_" + selectColumn.getColumnAlias();
			}
		}
		return null;
	}

	@Override
	public String getColumnName(Column column) {
		List<SelectColumn> sc = getSelectColumns();
		for (SelectColumn selectColumn : sc) {
			if (selectColumn.getColumn().equals(column)) {
				return getAlias() + "." + selectColumn.getColumnAlias();
			}
		}
		return null;
	}

	@Override
	public void appendSql(SQL sql) {
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
		if (main instanceof Select) {
			Select select = (Select) main;
			select.build(++level);
		}
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
	public boolean isDistinct() {
		return distinct;
	}

	@Override
	public List<SelectColumn> getSelectColumns() {
		return selectColumns;
	}

	@Override
	public SelectPart getMainSelectPart() {
		return mainSelectPart;
	}

	@Override
	public List<Join> getJoins() {
		return joins;
	}

	@Override
	public Orders getOrders() {
		return orders;
	}

	@Override
	public Groups getGroups() {
		return groups;
	}

	@Override
	public Having getHaving() {
		return having;
	}

	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public Where getWhere() {
		return where;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public void setSelectColumns(List<SelectColumn> selectColumns) {
		this.selectColumns = selectColumns;
	}

	public void setMainSelectPart(SelectPart mainSelectPart) {
		this.mainSelectPart = mainSelectPart;
	}

	public void setJoins(List<Join> joins) {
		this.joins = joins;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	public void setHaving(Having having) {
		this.having = having;
	}

	public void setWhere(Where where) {
		this.where = where;
	}

}
