package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Ex02Controller {

	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("grape");
		fruits.add("mango");
		
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();		// 1번 맵
		map.put("name", "신보람");
		map.put("age", 25);
		map.put("hobby", "독서");
		users.add(map);
		
		map = new HashMap<>();		// 2번 맵
		map.put("name", "신바다");
		map.put("age", 3);
		map.put("hobby", "스크래쳐");
		users.add(map);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
}
