package com.increpas.web.controller.test;

import javax.servlet.http.*;

import com.increpas.web.controller.*;

public class Test01 implements TestInterface {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/view/test/test.jsp";
		return view;
	}

}
