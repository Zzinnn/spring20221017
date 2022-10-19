package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {
	
	// 좀 더 구체적으로 requestMapping을 작성한 메소드가 우선순위를 갖는다
	@GetMapping("sub01")
	public void method1() {
		System.out.println("메소드1 일했음");
	}
	
	// 나머지 방식 method2 실행
	@RequestMapping("sub01")
	public void method2() {
		System.out.println("메소드2 일했음 !!!");
	}
	
	@PostMapping("sub01")
	public void method3() {
		System.out.println("메소드3 일했음 #######");
	}
	
}
