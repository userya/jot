package jot.persistent.dao.sql.query;

import java.util.List;

import jot.persistent.dao.sql.AliasGenerator;
import jot.persistent.dao.sql.AliasMap;
import jot.persistent.dao.sql.AliasMapImpl;

public class SelectBuilder {

	private Select select;

	private AliasGenerator aliasGenerator;

	public SelectBuilder(Select select) {
		super();
		this.select = select;
		aliasGenerator = new AliasGenerator(0);
	}

	public SelectBuilder(Select select, int level) {
		super();
		this.select = select;
		aliasGenerator = new AliasGenerator(level);
	}

	public String buildSql() {
		// select [distinct] a1,a2 from table left join a on xx left join b on
		// xx2 where 1=1 and xx = 11;
		AliasMap aliasMap = new AliasMapImpl();
		SelectPart main = select.getMainSelectPart();
		String mainAlias = aliasGenerator.getNextAlias();
		aliasMap.registAlias(main, mainAlias);
		List<Join> joins = select.getJoins();
		if (joins != null) {
			for (Join join : joins) {
				SelectPart sp = join.getSelectPart();
				String jAlias = aliasGenerator.getNextAlias();
				aliasMap.registAlias(sp, jAlias);
			}
		}
		StringBuilder sql = new StringBuilder();
		select.appendSql(sql, aliasMap);
		return sql.toString();
	}

}
