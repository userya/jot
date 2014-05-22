package jot.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jot.web.engine.ProjectsEngine;

public class JotDispatchServlet extends HttpServlet {

	private static final long serialVersionUID = 9028736077800087392L;

	private ProjectsEngine webEngine;

	@Override
	public void init() throws ServletException {
		webEngine = new ProjectsEngine();
	}

	@Override
	public void destroy() {
		if (webEngine != null) {
			webEngine.stopMonitor();
		}
	}

	protected void invoke(HttpServletRequest req, HttpServletResponse resp) {
		String uri = req.getRequestURI();
		System.out.println(uri);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		invoke(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		invoke(req, resp);
	}

}
