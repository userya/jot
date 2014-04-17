package jot.monitor;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import jot.exception.BaseException;
import jot.loader.JotClassLoader;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class AppReloadMonitor implements Monitor {

	private File rootFile;
	
	private URL rootURL;

	private List<Monitor> monitors = new ArrayList<>();

	private FileAlterationMonitor fileMonitor;

	public AppReloadMonitor(URL classPath) {
		this.rootURL = classPath;
		rootFile = new File(classPath.getFile());
		reload(rootFile);
	}

	public JotClassLoader createClassLoader(){
		JotClassLoader cl = new JotClassLoader(rootURL);
		return cl;
	}
	
	protected void reload(File file) {
		monitors.add(this);
		for (Monitor moni : monitors) {
			if (moni.contains(file)) {
				moni.reload();
			}
		}
		start();
	}

	@Override
	public void reload() {
		reload(rootFile);
	}

	@Override
	public boolean contains(File file) {
		return rootFile.equals(file);
	}


	// start a thread to regist all file observer
	public void start() {
		if (fileMonitor != null) {
			try {
				fileMonitor.stop();
			} catch (Exception e) {
				e.printStackTrace();
				throw new BaseException(e);
			}
		}
		fileMonitor = new FileAlterationMonitor(2000);
		FileAlterationObserver observer = new FileAlterationObserver(rootFile);
		fileMonitor.addObserver(observer);
		observer.addListener(new FileAlterationListenerAdaptor() {
			@Override
			public void onFileChange(File file) {
				reload();
			}
		});
		try {
			fileMonitor.start();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}

}
