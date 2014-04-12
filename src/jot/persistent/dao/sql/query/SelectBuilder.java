package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndFactory;
import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.CndRelation;
import jot.persistent.dao.sql.cnd.impl.WhereImpl;
import jot.persistent.dao.sql.query.impl.SelectImpl;
import jot.persistent.model.physical.impl.ColumnImpl;
import jot.persistent.model.physical.impl.TableImpl;

public class SelectBuilder {

	private SelectImpl instance = new SelectImpl();

	public SelectBuilder addColumn(SelectColumn column) {
		instance.getSelectColumns().add(column);
		return this;
	}

	public SelectBuilder setMainSelectPart(SelectPart sp) {
		instance.setMainSelectPart(sp);
		return this;
	}

	public SelectBuilder addJoin(Join join) {
		instance.getJoins().add(join);
		return this;
	}

	public SelectBuilder and(CndPart cnd) {
		addCndPart(cnd, CndRelation.AND);
		return this;
	}

	public SelectBuilder or(CndPart cnd) {
		addCndPart(cnd, CndRelation.OR);
		return this;
	}

	protected void addCndPart(CndPart cnd, CndRelation rel) {
		initWhere();
		cnd.setCndRelation(rel);
		instance.getWhere().getCndSection().addCndPart(cnd);
	}

	protected void initWhere() {
		if (instance.getWhere() == null) {
			WhereImpl where = SelectPartFactory.createWhere(SelectPartFactory.createCndSection());
			instance.setWhere(where);
		}
	}

	public static void main(String[] args) {
		SelectBuilder sb = new SelectBuilder();
		TableImpl sex = new TableImpl();
		sex.setName("sex");
		sex.setPrimaryColumnName("id");
		ColumnImpl sexId = new ColumnImpl();
		sexId.setName("id");
		ColumnImpl code = new ColumnImpl();
		code.setName("code");
		sex.addColumn(sexId).addColumn(code);

		
		/**
		 * start
		 */
		SelectTable stable = SelectPartFactory.createSelectTable(sex);
		sb.addColumn(SelectPartFactory.createSelectColumn(stable, sexId)).addColumn(SelectPartFactory.createSelectColumn(stable, code));
		sb.setMainSelectPart(stable);

		sb.and(CndFactory.eq(stable, sexId, "xx"));
		sb.or(CndFactory.eq(stable, code, "xx"));

		sb.instance.build(0);
		SQL sql = new SQL();
		sb.instance.appendSql(sql);
		System.out.println(sql);
	}

}
