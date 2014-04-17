package jot.web.context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import jot.exception.BaseException;
import jot.monitor.AppReloadMonitor;

import org.springframework.util.ResourceUtils;

public class JotWebApps {

	private static final String APPS = "apps.properties";

	private Properties props;

	private Map<String, AppReloadMonitor> monitorMap = new HashMap<>();

	private Map<String, PackageCenter> packageCenterMap = new HashMap<>();

	public JotWebApps() {
		init();
	}

	protected void init() {
		props = new Properties();
		try {
			props.load(JotWebApps.class.getClassLoader().getResourceAsStream(
					APPS));
		} catch (IOException e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
		initApps();
	}

	protected void initApps() {
		for (Object key : props.keySet()) {
			String appName = String.valueOf(key);
			String appPath = props.getProperty(appName);
			AppReloadMonitor monitor = new AppReloadMonitor(
					resovleAppPath(appPath));
			monitorMap.put(appName, monitor);

			PackageCenter packageCenter = new PackageCenter();

			packageCenterMap.put(appName, packageCenter);
		}
	}

	protected URL resovleAppPath(String appPath) {
		try {
			return ResourceUtils.getURL(appPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}

	public AppReloadMonitor getApp(String appName) {
		return monitorMap.get(appName);
	}

}
