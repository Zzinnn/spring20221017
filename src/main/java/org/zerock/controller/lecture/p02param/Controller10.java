package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex10")
public class Controller10 {
	
	// /ex10/sub01?name=mickey
	@GetMapping(path = "sub01", params ="name")
	public void method1(@RequestParam("name") String name) {
		System.out.println(name);
	}
	
	// /ex10/sub01
	@GetMapping("sub01")
	public void method2() {
		System.out.println("name 파라미터 없을 때 일함");
	}
	
	// 있으면 파라미터 값, 없으면 null
	@GetMapping("sub02")
	public void method3(@RequestParam(name = "city", required = false) String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub03")
	public void method4(@RequestParam(name = "address", required = false) String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub04")
	public void method5(@RequestParam(name = "city", defaultValue = "seoul") String a ) {
		System.out.println(a);
	}
	
	@GetMapping("sub05")
	public void method6(
			@RequestParam(name = "address", defaultValue = "seoul") String a) {
		System.out.println(a);
	}              
}
