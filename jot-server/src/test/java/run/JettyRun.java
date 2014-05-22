package run;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

import org.apache.jasper.compiler.TldLocationsCache;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.ResourceCache;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyRun {

	public static void main(String[] args) throws Exception {

		String jetty_home = System.getProperty("user.dir", ".").replace("\\", "/");
		System.out.println("starting...");
//		System.out.println(TldLocationsCache.ABS_URI);
		/**
		 * Jetty自动过滤了http://java.sun.com/jsp/jstl/core
		 */
		HashSet<String> set = new HashSet<String>();
		Field field = TldLocationsCache.class.getDeclaredField("systemUris");
		setFinalStatic(field, set);
		
		
//		Field f = ResourceCache.class.getDeclaredField("_useFileMappedBuffer");
		

		long begin = System.currentTimeMillis();
		Connector connector = new SelectChannelConnector();
		connector.setPort(Integer.getInteger("jetty.port", 8889).intValue());
		WebAppContext webapp = new WebAppContext("web", "/");
//		webapp.setDefaultsDescriptor(jetty_home +"/src/main/resources/webdefault.xml");
		
		webapp.setWar(jetty_home + "/src/main/webapp");
		webapp.setExtraClasspath(jetty_home + "/target/classes/");
		
		// String PATH_TO_TAGLIBS = jetty_home + "/jar-for-test/";

		// ClassLoader currentClassLoader =
		// Thread.currentThread().getContextClassLoader();
		// URL urlTaglibs = new File(PATH_TO_TAGLIBS).toURI().toURL();
		// URLClassLoader newClassLoader = new URLClassLoader(new
		// URL[]{urlTaglibs},currentClassLoader);
		// Thread.currentThread().setContextClassLoader(newClassLoader);
		// webapp.setClassLoader(Thread.currentThread().getContextClassLoader());

		Server server = new Server();
		server.setConnectors(new Connector[] { connector });
		server.setHandler(webapp);
		
		server.start();
		System.out.println("Jetty Server started, use " + (System.currentTimeMillis() - begin) + " ms");
		while (true) {
			char c = (char) System.in.read();
			System.out.println(c);
			if (c == '\n') {
				long begin2 = System.currentTimeMillis();
				webapp.stop();
				System.out.println("restarting...................................");
				WebAppClassLoader classLoader = new WebAppClassLoader(webapp);
				classLoader.addClassPath(jetty_home + "/target/classes/");
				webapp.setClassLoader(classLoader);
				webapp.start();
				System.out.println("Jetty Server restarted, use " + (System.currentTimeMillis() - begin2) + " ms");
			}
		}

	}

	static void setFinalStatic(Field field, Object newValue) throws Exception {
		field.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(null, newValue);
	}

}
