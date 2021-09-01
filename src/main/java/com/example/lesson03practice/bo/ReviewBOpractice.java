package com.example.lesson03practice.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03practice.dao.ReviewDAOpractice;
import com.example.lesson03practice.model.ReviewPractice;

@Service
public class ReviewBOpractice {

	@Autowired
	private ReviewDAOpractice reviewDAOpractice;
	
	public ReviewPractice getReviewPractice(int id) {
		return reviewDAOpractice.selectReviewPractice(id);
	}
}
