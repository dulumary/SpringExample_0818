package com.marondal.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.mybatis.domain.Review;
import com.marondal.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 파라미터로 전달 받은 id와 일치하는 리뷰 정보 조회
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
		
		return review;
	}
	
	
	// 전달받은 리뷰내용 저장기능
	public int addReview(int storeId, String menu, String userName, double point) {
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point);
		
		return count;
	}
	
	// 전달 받은 리뷰 객체의 내용을 저장하는 기능
	public int addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		
		return count;
	}
	

}
