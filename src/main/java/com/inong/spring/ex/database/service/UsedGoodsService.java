package com.inong.spring.ex.database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inong.spring.ex.database.domain.UsedGoods;
import com.inong.spring.ex.database.repository.UsedGoodsRepository;

// 로직(business) 담당
// 데이터 가공
// 그외 복잡한 기능 수행

@Service
public class UsedGoodsService {
	
	//의존성 주입 - DI
	//객체 생성을 Spring Framework에서 직접 관리 
	//객체 관리를 프레임워크 내에서 알아서 하게끔 하겠다. 

	@AutoWired // 해당 변수의 객체 생성을 하지 않아도 해당하는 변수에 객체를 주입해준다.
	private UsedGoodsRepository usedGoodsRepository;

	//중고 게시글 정보 모두 얻어오기
	public List<UsedGoods> getUsedGoodsList() {
		//used_goods 테이블 모든 행 조회
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		// 순수한 자바 문법만을 이용한 코드 였네??
		
		return usedGoodsList;
	}
}
