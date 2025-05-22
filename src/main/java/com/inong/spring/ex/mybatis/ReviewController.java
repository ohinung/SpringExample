package com.inong.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.ex.mybatis.domain.Review;
import com.inong.spring.ex.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	//전달받은 id와 일치하는 리뷰 정보를 response에 json을 담는다.
	@RequestMapping()
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		//request 파라미터로 전달받는다.
//		String idString= request.getParameter("id");
		//컨트롤러의 메소드의 파라미터를 전달받고 이것을 리퀘스트의 파라미터로 전환할 수 있다. 직관적이잖아!!
		
		//전달받은 아이디와 일치하는 리뷰정보 얻어오기
		Review review= reviewService.getReview(id);
		return review;
		
		
	}//리뷰를 저장하는 기능을 만들자
	@ResponseBody
	@RequestMapping("/create")
	public String createReview() {
		// 4, 치즈피자, 오인웅, 4.5,치즈피자 존맛~~~~~~~~
//		int count = reviewService.addReview( 4, "치즈피자", "오인웅", 4.5,"치즈피자 존맛~~~~~~~~");
		Review review=  new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("오인웅");
		review.setPoint("4.5");
		review.setReview("뿌링클이 너무 좋다.");
		int count = reviewService.addReviewByObject(review);
		//실행결과 : 1
		return "실행결과 : " + count;
	}

}
