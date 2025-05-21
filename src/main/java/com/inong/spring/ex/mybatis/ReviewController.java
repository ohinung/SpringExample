package com.inong.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.ex.mybatis.domain.Review;
import com.inong.spring.ex.mybatis.service.ReviewService;

@Controller

public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	//전달받은 id와 일치하는 리뷰 정보를 response에 json을 담는다.
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		//request 파라미터로 전달받는다.
//		String idString= request.getParameter("id");
		//컨트롤러의 메소드의 파라미터를 전달받고 이것을 리퀘스트의 파라미터로 전환할 수 있다. 직관적이잖아!!
		
		//전달받은 아이디와 일치하는 리뷰정보 얻어오기
		Review review= reviewService.getReview(id);
		return review;
		
		
	}

}
