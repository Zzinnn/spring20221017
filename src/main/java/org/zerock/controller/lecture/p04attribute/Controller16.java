package org.zerock.controller.lecture.p04attribute;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex16")
public class Controller16 {
	
//	/ex16.sub01
//	/WEB-INF/views/ex16/sub01.jsp
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req) {
		req.setAttribute("myName","park ji sung");
	}
	
	// /ex16/sub02 요청
	// /WEB-INF/views/ex16/sub02.jsp forward
	// add attribute : address : seoul
	@RequestMapping("sub02")
	public void method2(HttpServletRequest req) {
			req.setAttribute("address", "seoul");
	}
	
}
