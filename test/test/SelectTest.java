package test;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.cnd.CndPart;
import jot.persistent.dao.sql.cnd.CndSection;
import jot.persistent.dao.sql.cnd.impl.CndSectionImpl;
import jot.persistent.dao.sql.cnd.impl.part.EqualCndPart;
import jot.persistent.dao.sql.query.Join;
import jot.persistent.dao.sql.query.SelectColumn;
import jot.persistent.dao.sql.query.impl.JoinImpl;
import jot.persistent.dao.sql.query.impl.SelectColumnImpl;
import jot.persistent.dao.sql.query.impl.SelectImpl;
import jot.persistent.dao.sql.query.impl.SelectTableImpl;
import jot.persistent.model.physical.Column;
import jot.persistent.model.physical.impl.ColumnImpl;
import jot.persistent.model.physical.impl.TableImpl;

public class SelectTest {

	public void testSingle(){

		TableImpl sex = new TableImpl();
		sex.setName("sex");
		sex.setPrimaryColumnName("id");
		ColumnImpl sexId = new ColumnImpl();
		sexId.setName("id");
		ColumnImpl code = new ColumnImpl();
		code.setName("code");
		List<Column> sexColumns = new ArrayList<>();
		sexColumns.add(sexId);
		sexColumns.add(code);
		sex.setColumns(sexColumns);
		SelectTableImpl sexSi = new SelectTableImpl();
		sexSi.setTable(sex);
		
//		SelectImpl sexSi = new SelectImpl();
//		SelectTableImpl sexstable = new SelectTableImpl();
//		sexstable.setTable(sex);
//		SelectColumnImpl sexsid = new SelectColumnImpl();
//		sexsid.setColumn(sexId);
//		sexsid.setSelectPart(sexSi);
//		SelectColumnImpl sexsname = new SelectColumnImpl();
//		sexsname.setColumn(code);
//		sexsname.setSelectPart(sexSi);
		
//		List<SelectColumn> sexSelectColumns = new ArrayList<>();
//		sexSelectColumns.add(sexsid);
//		sexSelectColumns.add(sexsname);
//		sexSi.setMainSelectPart(sexstable);
//		sexSi.setSelectColumns(sexSelectColumns);
		
		
		TableImpl table = new TableImpl();
		table.setName("person");
		table.setPrimaryColumnName("id");
		ColumnImpl id = new ColumnImpl();
		id.setName("id");
		ColumnImpl name = new ColumnImpl();
		name.setName("name");
		List<Column> columns = new ArrayList<>();
		columns.add(id);
		columns.add(name);
		table.setColumns(columns);
		
		
		
		
		SelectImpl si = new SelectImpl();
		SelectTableImpl stable = new SelectTableImpl();
		stable.setTable(table);
		SelectColumnImpl sid = new SelectColumnImpl();
		sid.setColumn(id);
		sid.setSelectPart(stable);
		SelectColumnImpl sname = new SelectColumnImpl();
		sname.setColumn(name);
		sname.setSelectPart(stable);
		
		SelectColumnImpl scode = new SelectColumnImpl();
		scode.setColumn(code);
		scode.setSelectPart(sexSi);
		
		
		List<SelectColumn> selectColumns = new ArrayList<>();
		selectColumns.add(sid);
		selectColumns.add(sname);
		selectColumns.add(scode);
		si.setMainSelectPart(stable);
		si.setSelectColumns(selectColumns);
		
		JoinImpl j = new JoinImpl();
		j.setJoinType("left");
		j.setSelectPart(sexSi);
		
		CndSectionImpl joinCnd = new CndSectionImpl();
		List<CndPart> list = new ArrayList<>();
		CndPart cp = new EqualCndPart();
		list.add(cp);
		joinCnd.setCndParts(list);
		j.setJoinCnd(joinCnd);
		List<Join> joins = new ArrayList<>();
		joins.add(j);
		si.setJoins(joins);
		
		si.build(0);
		StringBuilder sql = new StringBuilder();
		si.appendSql(sql);
		System.out.println(sql);
	}
	
	
	public void testMult(){
		//定义表，字段
		TableImpl table = new TableImpl();
		table.setName("person");
		table.setPrimaryColumnName("id");
		ColumnImpl id = new ColumnImpl();
		id.setName("id");
		ColumnImpl name = new ColumnImpl();
		name.setName("name");
		List<Column> columns = new ArrayList<>();
		columns.add(id);
		columns.add(name);
		table.setColumns(columns);

		//定义查询必要条件
		SelectImpl si = new SelectImpl();
		SelectTableImpl stable = new SelectTableImpl();
		stable.setTable(table);
		SelectColumnImpl sid = new SelectColumnImpl();
		sid.setColumn(id);
		sid.setSelectPart(stable);
		SelectColumnImpl sname = new SelectColumnImpl();
		sname.setColumn(name);
		sname.setSelectPart(stable);
		List<SelectColumn> selectColumns = new ArrayList<>();
		selectColumns.add(sid);
		selectColumns.add(sname);
		si.setMainSelectPart(stable);
		si.setSelectColumns(selectColumns);
		
		//si现在作为一个表
		SelectImpl top = new SelectImpl();
		top.setMainSelectPart(si);
		List<SelectColumn> topSelectColumns = new ArrayList<>();
		
		SelectColumnImpl tid = new SelectColumnImpl();
		tid.setColumn(id);
		tid.setSelectPart(si);
		SelectColumnImpl tname = new SelectColumnImpl();
		tname.setColumn(name);
		tname.setSelectPart(si);
		topSelectColumns.add(tid);
		topSelectColumns.add(tname);
		
		top.setSelectColumns(topSelectColumns);
		top.build(0);
		StringBuilder sql = new StringBuilder();
		top.appendSql(sql);
		System.out.println(sql);
	}
	
	public static void main(String[] args) {
		SelectTest s = new SelectTest()
		;
		s.testSingle();
		s.testMult();
	}
	
}
