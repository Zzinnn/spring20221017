package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex05")
public class Controller05 {

	@RequestMapping(value = "sub01", method = RequestMethod.GET)
	public void method01() {
		System.out.println("Method01!!!!!");
	}
	
	// @requestMapping ( method = RequestMethod.GET)
	@GetMapping("sub02")
	public void method02() {
		System.out.println("method02!!!!!!!!");
	}
	
	@PostMapping("sub03")
	public void method03() {
		System.out.println("method03!!!!!!!!!!");
	}
	
	@GetMapping("sub04")
	public void method04() {
		System.out.println("method04#########");
	}
	
	@PostMapping("sub05")
	public void method05() {
		System.out.println("method05@@@@@@@@@");
	}
}
