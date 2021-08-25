package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/ex01")
public class Ex01RestControllerPractice {

	@RequestMapping("/3practice")
	public String printString() {
		return "@RestController 를 사용해 String 을 리턴해본다.";
	}
	
	
	@RequestMapping("/4practice")
	public Map<String, String> printMap() {
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		
		return map;
	}
	
	
	@RequestMapping("/5practice")
	public Data printData() {
		Data data = new Data();
		data.setId(1);
		data.setName("김동규");
		
		return data;
	}
	
	
	@RequestMapping("/6practice")
	public ResponseEntity<Data> entity() {
		Data data = new Data();
		data.setId(1);
		data.setName("김돈이");
		
		// return new ResponseEntity<>(data, HttpStatus.OK);
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}





