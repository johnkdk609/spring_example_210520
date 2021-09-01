package com.example.lesson03practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03practice.bo.ReviewBOpractice;
import com.example.lesson03practice.model.ReviewPractice;

@RestController
public class ReviewRestControllerPractice {

	@Autowired
	private ReviewBOpractice reviewBOpractice;
	
	// 요청 URL : http://localhost/lesson03practice/ex01?id=2
	@RequestMapping("/lesson03practice/ex01")
	public ReviewPractice ex01(
			@RequestParam(value="id", defaultValue="1") int id
			) {
			System.out.println("### id: " + id);
			
		ReviewPractice reviewPractice = reviewBOpractice.getReviewPracticeById(id);
		return reviewPractice;
	}
}
