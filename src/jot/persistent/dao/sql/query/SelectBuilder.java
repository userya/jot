package jot.persistent.dao.sql.query;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndBuilder;
import jot.persistent.dao.sql.cnd.CndFactory;
import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.impl.WhereImpl;
import jot.persistent.dao.sql.query.impl.SelectImpl;
import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.impl.ColumnImpl;
import jot.persistent.model.physical.impl.TableImpl;

public class SelectBuilder {

	private SelectImpl instance = new SelectImpl();

	public SelectBuilder addColumn(SelectColumn column){
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
	
	public SelectBuilder addCnd(CndPart cnd){
		if(instance.getWhere() == null) {
			WhereImpl where = SelectPartFactory.createWhere(SelectPartFactory.createCndSection());
			instance.setWhere(where);
		}
		instance.getWhere().getCndSection().addCndPart(cnd);
		return this;
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
		
		SelectTable stable = SelectPartFactory.createSelectTable(sex);
		sb.addColumn(SelectPartFactory.createSelectColumn(stable,sexId))
		  .addColumn(SelectPartFactory.createSelectColumn(stable,code));
		sb.setMainSelectPart(stable);
		sb.addCnd(null);
		
		CndBuilder cb = new CndBuilder();
		
		
		sb.instance.build(0);
		SQL sql = new SQL();
		sb.instance.appendSql(sql);
		System.out.println(sql);
	}
	
}
