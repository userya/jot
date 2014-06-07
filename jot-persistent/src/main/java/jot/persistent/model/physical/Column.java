package jot.persistent.model.physical;

public interface Column {

	String getName();

	ColumnType getColumnType();

	boolean isUnique();

	boolean isNullable();

	int getLength();

	int getPrecision();

	int getScale();

}
