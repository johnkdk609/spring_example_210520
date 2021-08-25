package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Ex01ControllerPractice {

	@ResponseBody
	@RequestMapping("/1practice")
	public String printString() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		
		return text;
	}
	
	
	@ResponseBody
	@RequestMapping("/2practice")
	public Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap();
		map.put("apple", 4);
		map.put("banana", 10);
		map.put("orange", 125);
		map.put("grape", 67);
		
		return map;
	}
}





