package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReviewById(@Param("id") int id);		// int 의 경우 필수값, Integer의 경우 있을 수도 있고 없을 수도 있는 것.
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") double point,
			@Param("review") String review);
	
	public int updateReview(
			@Param("id") int id,
			@Param("review") String review);
	
	public int deleteReviewById(int id);
}
