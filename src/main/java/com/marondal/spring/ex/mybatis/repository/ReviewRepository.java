package com.marondal.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {
	
	// 파라미터로 전달된 id와 일치하는 한 행의 리뷰정보 조회
	public Review selectReview(@Param("id") int id);

}
