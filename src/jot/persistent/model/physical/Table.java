package jot.persistent.model.physical;

import java.util.List;

public interface Table {

	String getName();

	String getPrimaryColumnName();

	List<Column> getColumns();

}
