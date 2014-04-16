package jot.persistent.dao.sql.cnd;

import java.util.List;

public interface CndSection extends CndPart {

	List<CndPart> getCndParts();

	boolean isEmpty();
	
	void addCndPart(CndPart part);
}
