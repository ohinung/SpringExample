package com.inong.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.inong.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	//전달 받은 아이디와 일치하는 행 조회 기능
	public Review selectReview(@Param("id") int id);
	// sellerId, 메뉴, 작성자,별점,리뷰 저장 기능
	public int insertReview(
			@Param("storeId") int storeId
			,@Param("menu")String menu
			,@Param("userName")String userName
			,@Param("point")double point
			,@Param("review")String review);
	//Review 객체를 통해 한행을 저장하는 기능
	public int insertReviewByObject(Review review);

}
