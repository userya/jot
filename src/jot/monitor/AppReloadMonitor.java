package jot.monitor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AppReloadMonitor implements Monitor {

	private File rootFile;

	private List<Monitor> monitors = new ArrayList<>();
	
	public AppReloadMonitor() {
		monitors.add(this);
		reload();
	}

	protected void reload(File file) {
		for (Monitor moni : monitors) {
			if (moni.contains(file)) {
				moni.reload();
			}
		}
	}

	@Override
	public void reload() {
		
	}

	@Override
	public boolean contains(File file) {
		return rootFile.equals(file);
	}

	@Override
	public ClassLoader getClassLoader() {
		return null;
	}

	// start a thread to regist all file observer

}
