package jot.persistent.dao.sql.query.impl;

import java.util.ArrayList;
import java.util.List;

import jot.persistent.dao.sql.SQL;
import jot.persistent.dao.sql.query.Group;
import jot.persistent.dao.sql.query.Groups;

public class GroupsImpl implements Groups {

	private List<Group> groups = new ArrayList<Group>();

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	@Override
	public void appendSql(SQL sql) {
		if (groups != null && !groups.isEmpty()) {
			sql.append(" group by ");
			for (Group g : groups) {
				g.appendSql(sql);
			}
		}
	}

}
