package jot.persistent.dao.sql.cnd;

import jot.persistent.dao.sql.cnd.impl.CndColumnImpl;
import jot.persistent.dao.sql.cnd.impl.field.ColumnCndField;
import jot.persistent.dao.sql.cnd.impl.field.ValueCndField;
import jot.persistent.dao.sql.cnd.impl.part.EqualCndPart;
import jot.persistent.dao.sql.query.SelectPart;
import jot.persistent.model.physical.Column;

public class CndFactory {

	public static EqualCndPart createEqualCndPart(CndField cndLeft, CndField cndRight) {
		EqualCndPart part = new EqualCndPart();
		part.setCndLeft(cndLeft);
		part.setCndRight(cndRight);
		return part;
	}

	public static ColumnCndField createColumnCndField(CndColumn cndColumn) {
		ColumnCndField field = new ColumnCndField();
		field.setCndColumn(cndColumn);
		return field;
	}

	public static CndColumnImpl createCndColumn(SelectPart selectPart, Column column) {
		CndColumnImpl col = new CndColumnImpl();
		col.setColumn(column);
		col.setSelectPart(selectPart);
		return col;
	}

	public static ColumnCndField createColumnCndField(SelectPart selectPart, Column column) {
		return createColumnCndField(createCndColumn(selectPart, column));
	}

	public static ValueCndField createValueCndField(Object value) {
		ValueCndField vf = new ValueCndField();
		vf.setValue(value);
		return vf;
	}

	public static EqualCndPart eq(SelectPart selectPart, Column column, Object value) {
		EqualCndPart c = createEqualCndPart(createColumnCndField(selectPart, column), createValueCndField(value));
		return c;
	}

}
