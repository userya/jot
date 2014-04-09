package jot.persistent.dao.sql.query;

import java.util.List;

import jot.persistent.dao.sql.SqlPart;

public interface Groups extends SqlPart {

	List<Group> getGroups();
	
}
