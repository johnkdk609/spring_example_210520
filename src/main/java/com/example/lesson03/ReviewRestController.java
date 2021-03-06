package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class ReviewRestController {

	@Autowired
	private ReviewBO reviewBO;
	
	// 요청 URL : http://localhost/lesson03/ex01?id=2
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			//@RequestParam(value="id") int id	// 앞의 id는 위 url의 id, 뒤의 id는 그때부터 사용되는 것. 뒤의 id를 다른 단어로 바꿔도 괜찮다.
			//@RequestParam(value="id", required=true) int id		// 필수 파라미터
			//@RequestParam("id") int id		// 필수 파라미터
			//@RequestParam(value="id", required=false) Integer id	// 비필수 파라미터
			@RequestParam(value="id", required=false, defaultValue="1") int id	// 비필수 파라미터, 디폴트 값 1
			) {
			System.out.println("### id: " + id);
			
		Review review = reviewBO.getReviewById(id);
		return review;
	}
	
	
	// 요청 URL : http://localhost/lesson03/ex02
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("신보람");
		review.setReview("혼자 먹기 적당하네요.");
		
		int rowCount = reviewBO.addReview(review);	// BO insert
		
		return "성공한 행의 개수 : " + rowCount;
	}
	
	
	// 요청 URL : http://localhost/lesson03/ex02/2
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		int rowCount = reviewBO.addReviewAsField(3, "치즈와퍼", "신바다", 5.0, "치즈 와퍼 좋아요!");		// As 는 ~ 로 어떻게 하겠다는 것. By 가 select에 사용되는 공식 문법이라면, As는 그냥 쓰는 것.
		
		return "성공한 행의 개수는 : " + rowCount;
	}
	
	
	// 요청 URL : http://localhost/lesson03/ex03?id=19&review=고기가 덜익었지만 맛있어요
	@RequestMapping("/lesson03/ex03")
	public String ex03(
			@RequestParam(value="id", required=true) int id,
			@RequestParam(value="review") String review) {
		
		int rowCount = reviewBO.updateReview(id, review);
		return "변경 완료:" + rowCount;
	}
	
	
	// 요청 URL : http://localhost/lesson03/ex04?id=23
	@RequestMapping("/lesson03/ex04")
	public String ex04(
			@RequestParam("id") int id) {
		
		int rowCount = reviewBO.deleteReviewById(id);
		return "삭제 완료 : " + rowCount;
	}
}
