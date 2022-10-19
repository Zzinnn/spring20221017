package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("ex03")
public class Controller03 {
	
	// sub01 sub02 sub03 (경로를 배열로 받을 수 있다)
	@RequestMapping({"sub01", "sub02", "sub03"})
	public void method01() {
		System.out.println("ex03/method01");
	}
	
	@RequestMapping({"sub03", "sub04"})
	public void method02() {
		System.out.println("ex03/method02");
	}
	
	@RequestMapping(value = "sub06")
	public void method04() {
		System.out.println("method04 일함");
	}
	
	@RequestMapping(path = "sub07")
	public void method05() {
		System.out.println("method05 일함");
	}
	
}
