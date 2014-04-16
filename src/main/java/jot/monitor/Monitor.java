package jot.monitor;

import java.io.File;


/**
 * 监视器
 * @author JJ
 *
 */
public interface Monitor {
	
	void reload();

	boolean contains(File file);
	
	ClassLoader getClassLoader();
	
}
