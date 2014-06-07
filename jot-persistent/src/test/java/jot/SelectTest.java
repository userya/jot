package jot;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.cnd.CndBuilder;
import jot.persistent.dao.sql.cnd.CndFactory;
import jot.persistent.dao.sql.query.JoinType;
import jot.persistent.dao.sql.query.SelectBuilder;
import jot.persistent.dao.sql.query.SelectPartFactory;
import jot.persistent.dao.sql.query.SelectTable;
import jot.persistent.dao.sql.query.impl.JoinImpl;
import jot.persistent.dao.sql.query.impl.SelectImpl;
import jot.persistent.dao.sql.query.impl.SelectTableImpl;
import jot.persistent.model.physical.impl.ColumnImpl;
import jot.persistent.model.physical.impl.TableImpl;
import junit.framework.TestCase;

public class SelectTest extends TestCase {

	{

		TableImpl person = new TableImpl();
		person.setName("persion");
		person.setPrimaryColumnName("id");
		ColumnImpl personId = new ColumnImpl();
		personId.setName("id");
		ColumnImpl num = new ColumnImpl();
		num.setName("num");
		ColumnImpl psex = new ColumnImpl();
		psex.setName("sexId");
		person.addColumn(personId).addColumn(num).addColumn(psex);

		TableImpl sex = new TableImpl();
		sex.setName("sex");
		sex.setPrimaryColumnName("id");
		ColumnImpl sexId = new ColumnImpl();
		sexId.setName("id");
		ColumnImpl code = new ColumnImpl();
		code.setName("code");
		sex.addColumn(sexId).addColumn(code);

	}

	public void testSelectSql1() {
		TableImpl person = new TableImpl();
		person.setName("persion");
		person.setPrimaryColumnName("id");
		ColumnImpl personId = new ColumnImpl();
		personId.setName("id");
		ColumnImpl num = new ColumnImpl();
		num.setName("num");
		ColumnImpl psex = new ColumnImpl();
		psex.setName("sexId");
		person.addColumn(personId).addColumn(num).addColumn(psex);

		SelectBuilder sb = new SelectBuilder();
		SelectTable stable = SelectPartFactory.createSelectTable(person);
		sb.addColumn(SelectPartFactory.createSelectColumn(stable, personId));
		sb.addColumn(SelectPartFactory.createSelectColumn(stable, num));
		sb.addColumn(SelectPartFactory.createSelectColumn(stable, psex));
		sb.setMainSelectPart(stable);
		CndBuilder cb1 = CndBuilder.create();
		cb1.and(CndFactory.eq(stable, personId, "xx1"));
		cb1.and(CndFactory.eq(stable, num, "xxa1"));
		sb.setCndSection(cb1);
		System.out.println(sb.getSQL());

		SelectImpl s = SelectPartFactory.createDefaultSelectTable(person);
		s.build(0);
		SQL sql = new SQL();
		s.appendSql(sql);
		System.out.println(sql);
	}

	public void testSelectSqlJoin() {
		TableImpl person = new TableImpl();
		person.setName("persion");
		person.setPrimaryColumnName("id");
		ColumnImpl personId = new ColumnImpl();
		personId.setName("id");
		ColumnImpl num = new ColumnImpl();
		num.setName("num");
		ColumnImpl psex = new ColumnImpl();
		psex.setName("sexId");
		person.addColumn(personId).addColumn(num).addColumn(psex);

		TableImpl sex = new TableImpl();
		sex.setName("sex");
		sex.setPrimaryColumnName("id");
		ColumnImpl sexId = new ColumnImpl();
		sexId.setName("id");
		ColumnImpl code = new ColumnImpl();
		code.setName("code");
		sex.addColumn(sexId).addColumn(code);

		SelectBuilder sb = new SelectBuilder();
		SelectImpl ps = SelectPartFactory.createDefaultSelectTable(person);
		SelectImpl ss = SelectPartFactory.createDefaultSelectTable(sex);
		sb.setMainSelectPart(ps);

		CndBuilder cond = SelectPartFactory.createJoinCondition(ps, psex, ss, sexId);
		JoinImpl join = SelectPartFactory.createJoin(ss, JoinType.LEFT_JOIN, cond);
		sb.addJoin(join);

		SelectImpl ss2 = SelectPartFactory.createDefaultSelectTable(sex);
		JoinImpl join2 = SelectPartFactory.createJoin(ss2, JoinType.LEFT_JOIN, SelectPartFactory.createJoinCondition(ps, psex, ss2, sexId));
		sb.addJoin(join2);

		SelectTableImpl ts = SelectPartFactory.createSelectTable(sex);
		JoinImpl join3 = SelectPartFactory.createJoin(ts, JoinType.INNER_JOIN, SelectPartFactory.createJoinCondition(ps, psex, ts, sexId));
		sb.addJoin(join3);

		System.out.println(sb.getSQL());

	}

}
