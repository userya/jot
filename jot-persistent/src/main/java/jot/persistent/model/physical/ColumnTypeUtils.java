package jot.persistent.model.physical;

import java.util.HashMap;
import java.util.Map;

public abstract class ColumnTypeUtils {

	private static Map<ColumnType, String> hibernateMapping = new HashMap<ColumnType, String>();
	{
		for (ColumnType type : ColumnType.values()) {
			hibernateMapping.put(type, type.name().toLowerCase());
		}
	}

	public static String getHibernateType(ColumnType type) {
		return hibernateMapping.get(type);
	}

}
