package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndBuilder;
import jot.persistent.dao.sql.cnd.CndFactory;
import jot.persistent.dao.sql.cnd.CndSection;
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
	
	public SelectBuilder setCndSection(CndSection section){
		if (instance.getWhere() == null) {
			WhereImpl where = SelectPartFactory.createWhere(section);
			instance.setWhere(where);
		}else {
			instance.getWhere().setCndSection(section);
		}
		return this;
	}

	public SelectBuilder addJoin(Join join) {
		instance.getJoins().add(join);
		return this;
	}

	

	protected void initWhere() {
		if (instance.getWhere() == null) {
			WhereImpl where = SelectPartFactory.createWhere(SelectPartFactory.createCndSection());
			instance.setWhere(where);
		}
	}

	public static void main(String[] args) {
		
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
		SelectBuilder sb = new SelectBuilder();
		SelectTable stable = SelectPartFactory.createSelectTable(sex);
		sb.addColumn(SelectPartFactory.createSelectColumn(stable, sexId)).addColumn(SelectPartFactory.createSelectColumn(stable, code));
		sb.setMainSelectPart(stable);

		CndBuilder cb1 = CndBuilder.create();
		cb1.and(CndFactory.eq(stable, sexId, "xx1"));
		cb1.and(CndFactory.eq(stable, code, "xxa1"));
		
		CndBuilder cb2 = CndBuilder.create();
		cb2.and(CndFactory.eq(stable, sexId, "xx"));
		cb2.and(CndFactory.eq(stable, code, "xxa3"));
		
		CndBuilder cb3 = CndBuilder.create();
		cb3.and(cb1);
		cb3.or(cb2);
		
		sb.setCndSection(cb3);

		sb.instance.build(0);
		SQL sql = new SQL();
		sb.instance.appendSql(sql);
		System.out.println(sql);
	}

}
