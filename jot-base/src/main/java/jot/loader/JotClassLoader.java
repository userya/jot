package jot.loader;

import java.net.URL;
import java.net.URLClassLoader;

import org.springframework.util.ClassUtils;

public class JotClassLoader extends URLClassLoader {

	public JotClassLoader(URL url) {
		super(new URL[] { url }, ClassUtils.getDefaultClassLoader());
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		Class<?> c2 = super.loadClass(name);
		return c2;
	}

}
