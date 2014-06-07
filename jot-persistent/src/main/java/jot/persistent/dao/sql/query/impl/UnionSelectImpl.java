package jot.persistent.dao.sql.query.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.dao.sql.query.UnionSelectPart;
import jot.persistent.model.physical.Column;

public class UnionSelectImpl implements SelectPart {

	private String alias;

	private List<UnionSelectPart> parts = new ArrayList<UnionSelectPart>();

	public UnionSelectImpl() {
	}

	public UnionSelectImpl addUnionPart(boolean unionAll, SelectPart part) {
		UnionSelectPartImpl imp = new UnionSelectPartImpl();
		imp.setUnionAll(unionAll);
		imp.setSelectPart(part);
		parts.add(imp);
		return this;
	}

	@Override
	public void appendSql(SQL sql) {
		if (parts.size() == 0) {
			throw new RuntimeException("no part found!");
		}
		parts.get(0).getSelectPart().appendSql(sql);
		if (parts.size() > 1) {
			for (int i = 1; i < parts.size(); i++) {
				boolean unionAll = parts.get(i).isUnionAll();
				sql.append("\n union ");
				if(unionAll){
					sql.append("all ");
				}
				sql.append("\n");
				parts.get(i).getSelectPart().appendSql(sql);
			}
		}
	}

	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * 以第一个part为主
	 */
	@Override
	public String getColumnAlias(Column column) {
		if (parts.size() == 0) {
			throw new RuntimeException("no part found!");
		}
		return parts.get(0).getSelectPart().getColumnAlias(column);
	}

	@Override
	public String getColumnName(Column column) {
		if (parts.size() == 0) {
			throw new RuntimeException("no part found!");
		}
		return parts.get(0).getSelectPart().getColumnName(column);
	}

}
