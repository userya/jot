package jot.persistent.dao.sql.query;

import java.util.List;

import jot.persistent.dao.sql.SqlPart;

public interface Orders extends SqlPart {

	List<Order> getOrders();
	
}
