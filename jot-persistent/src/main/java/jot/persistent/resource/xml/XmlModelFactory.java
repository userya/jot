package jot.persistent.resource.xml;

import jot.persistent.model.Entity;
import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.Table;
import jot.persistent.resource.ModelFactory;

public class XmlModelFactory implements ModelFactory {

	@Override
	public Table getTable(String tableId) {
		return null;
	}

	@Override
	public Column getColumn(String tableId, String columnName) {
		return null;
	}

	@Override
	public Entity getEntity(String entityId) {
		return null;
	}

}
