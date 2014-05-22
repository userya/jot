package jot.persistent.dao.sql.query.impl;

import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.query.Order;
import jot.persistent.dao.sql.query.Orders;

public class OrdersImpl implements Orders {

	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public void appendSql(SQL sql) {
		if (orders != null && !orders.isEmpty()) {
			sql.append(" order by ");
			for (int i = 0; i < orders.size(); i++) {
				Order order = orders.get(i);
				order.appendSql(sql);
				if (i != orders.size() - 1) {
					sql.append(", ");
				}
			}
		}
	}

}
