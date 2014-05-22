package jot.persistent.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseObject implements Serializable {

	private static final long serialVersionUID = -8545135416812920549L;
	
	private Map<String, Object> values = new HashMap<String, Object>();
	
	public void setValue(String name, Object value){
		values.put(name, value);
	}
	
	public Object getValue(String name){
		return values.get(name);
	}
	
}
