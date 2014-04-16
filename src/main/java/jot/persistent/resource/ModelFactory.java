package jot.persistent.resource;

import jot.persistent.model.Entity;
import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.Table;

public interface ModelFactory {

	Table getTable(String tableId);
	
	Column getColumn(String tableId, String columnName);
	
	Entity getEntity(String entityId);
	
}
