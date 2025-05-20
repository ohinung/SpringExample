package com.inong.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.ex.database.domain.UsedGoods;
import com.inong.spring.ex.database.service.UsedGoodsService;

@Controller
public class UsedGoodsController {
	@Autowired //의존성 주입
	private UsedGoodsService usedGoodsService;
	
	// 중고 게시글 모든 정보를 response에 담는 페이지
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		
		// 중고 게시글 정보 얻어 오기
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
	}
}
