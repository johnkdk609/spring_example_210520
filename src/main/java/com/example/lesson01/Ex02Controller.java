package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {

	// 요청 URL : http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// @Controller 어노테이션만 있을 때(@ResponseBody가 없음)
		// ViewResolver 클래스 작동 -> 리턴된 String 이름의 view 를 찾아서 view 화면이 구성된다.
		
		return "lesson01/ex02";		// prefix 와 suffix 쓴 것 각각 빼고 사이에 있는 것 쓴 것이다.
	}
}
