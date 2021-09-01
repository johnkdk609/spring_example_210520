package com.example.lesson03practice.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03practice.model.ReviewPractice;

@Repository
public interface ReviewDAOpractice {

	public ReviewPractice selectReviewPractice(@Param("id") int id);
}
