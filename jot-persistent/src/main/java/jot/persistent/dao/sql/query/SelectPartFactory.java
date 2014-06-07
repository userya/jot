package jot.persistent.dao.sql.query;

import jot.persistent.dao.sql.cnd.CndBuilder;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.cnd.impl.CndSectionImpl;
import jot.persistent.dao.sql.cnd.impl.WhereImpl;
import jot.persistent.dao.sql.cnd.impl.field.ColumnCndField;
import jot.persistent.dao.sql.cnd.impl.part.EqualCndPart;
import jot.persistent.dao.sql.query.impl.JoinImpl;
import jot.persistent.dao.sql.query.impl.OrderImpl;
import jot.persistent.dao.sql.query.impl.SelectColumnImpl;
import jot.persistent.dao.sql.query.impl.SelectImpl;
import jot.persistent.dao.sql.query.impl.SelectTableImpl;
import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.Table;

public class SelectPartFactory {

	public static SelectImpl createDefaultSelectTable(Table table) {
		SelectBuilder sb = new SelectBuilder();
		SelectTable stable = SelectPartFactory.createSelectTable(table);
		for (Column column : table.getColumns()) {
			sb.addColumn(SelectPartFactory.createSelectColumn(stable, column));
		}
		sb.setMainSelectPart(stable);
		return sb.getInstance();
	}

	public static SelectImpl createSelect(SelectPart mainSelectPart) {
		SelectImpl si = new SelectImpl();
		si.setMainSelectPart(mainSelectPart);
		return si;
	}

	public static SelectImpl createSelect(boolean isDistinct, SelectPart mainSelectPart) {
		SelectImpl s = createSelect(mainSelectPart);
		s.setDistinct(isDistinct);
		return s;
	}

	public static SelectColumnImpl createSelectColumn(SelectPart selectPart, Column column) {
		SelectColumnImpl sc = new SelectColumnImpl();
		sc.setColumn(column);
		sc.setSelectPart(selectPart);
		return sc;
	}

	public static SelectTableImpl createSelectTable(Table table) {
		SelectTableImpl tab = new SelectTableImpl();
		tab.setTable(table);
		return tab;
	}

	public static JoinImpl createJoin(SelectPart selectPart, JoinType joinType, CndSection joinCnd) {
		JoinImpl join = new JoinImpl();
		join.setSelectPart(selectPart);
		join.setJoinType(joinType);
		join.setJoinCnd(joinCnd);
		return join;
	}

	public static CndBuilder createJoinCondition(SelectPart part1, Column column1, SelectPart part2, Column column2) {
		CndBuilder b = new CndBuilder();
		EqualCndPart p1 = new EqualCndPart();
		ColumnCndField f1 = new ColumnCndField();
		f1.setCndColumn(SelectPartFactory.createSelectColumn(part1, column1));
		p1.setCndLeft(f1);
		ColumnCndField f2 = new ColumnCndField();
		f2.setCndColumn(SelectPartFactory.createSelectColumn(part2, column2));
		p1.setCndRight(f2);
		b.addEqualCndPart(p1);
		return b;
	}

	public static OrderImpl createOrder(SelectColumn column) {
		OrderImpl order = new OrderImpl();
		order.setColumn(column);
		return order;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Condition
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static WhereImpl createWhere(CndSection cndSection) {
		WhereImpl where = new WhereImpl();
		where.setCndSection(cndSection);
		return where;
	}

	public static CndSectionImpl createCndSection() {
		CndSectionImpl c = new CndSectionImpl();
		return c;
	}

}
