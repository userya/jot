package jot.persistent.dao.query;

import java.util.List;

import jot.persistent.dao.cnd.CndPart;

/**
 * 查询描述
 * @author user
 *
 */
public interface Select extends SelectPart {
	
	boolean isDistinct();

	/**
	 * 查询字段
	 * @return
	 */
	List<SelectColumn> getSelectColumns();

	/**
	 * 查询主体
	 * @return
	 */
	SelectPart getMainSelectPart();

	/**
	 * 关联关系
	 * @return
	 */
	List<Join> getJoins();

	/**
	 * 查询条件
	 * @return
	 */
	List<CndPart> getConditions();
	
	/**
	 * 排序
	 * @return
	 */
	List<Order> getOrders();

	
	/**
	 * 聚合
	 * @return
	 */
	List<Group> getGroups();
	
	/**
	 * Having子句
	 * @return
	 */
	Having getHaving();
	
	/**
	 * 生成SQL
	 * @return
	 */
	String getSql();

}