package jot.persistent.dao.sql;

public class AliasGenerator {

	private int level = 0;

	private char alias = 'a';

	public AliasGenerator(int level) {
		this.level = level;
	}

	public String getNextAlias() {
		String suf = "";
		if (level != 0) {
			suf = level + "";
		}
		String al = alias + suf;
		alias = (char) ((int) alias + 1);
		if (alias == 'z') {
			// TODO would not happen
		}
		return al;
	}

}
