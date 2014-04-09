package jot.persistent.dao.sql.query;

import java.util.List;

import jot.persistent.dao.sql.cnd.Where;

/**
 * 查询描述
 * select 语句
 * @author user
 *
 */
public interface Select extends SelectPart {
	
	/**
	 * 排重
	 * @return
	 */
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
	Where getWhere();
	
	/**
	 * 排序
	 * @return
	 */
	Orders getOrders();
	
	/**
	 * 聚合
	 * @return
	 */
	Groups getGroups();
	
	/**
	 * Having子句
	 * @return
	 */
	Having getHaving();
	
	
	/**
	 * 生成SQL
	 * @return
	 */
	String getSql(int level);

	/**
	 * 编译，顶层level = 0
	 * @param level
	 */
	void build(int level) ;
	
}