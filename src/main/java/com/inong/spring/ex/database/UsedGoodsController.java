package com.inong.spring.ex.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsedGoodsController {
	
	// 중고 게시글 모든 정보를 response에 담는 페이지
	@RequestMapping("/db/usedgoods/list")
	public usedGoodsList() {
		
		// 중고 게시글 정보 얻어 오기
	}
}
