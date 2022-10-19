package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("메소드01 일");
	}
	
	// get 방식으로 온 요청만 처리하고 싶다
	@RequestMapping(value = "sub02", method = RequestMethod.GET)
	public void method02() {
		System.out.println("메소드02 일");
	}
	
	// post방식으로 온 요청 처리
	@RequestMapping(value = "sub02", method = RequestMethod.POST)
	public void method03() {
		System.out.println("메소드03 일!!!");
	}
	
	@RequestMapping(
			value="sub03", method = {RequestMethod.GET, RequestMethod.POST})
	public void method04() {
		
	}
	
	@RequestMapping(value = "sub04", 
					method = {RequestMethod.GET, RequestMethod.POST})
	public void method05() {
		System.out.println("sub04 Get Post 요청받음");
	}
}
