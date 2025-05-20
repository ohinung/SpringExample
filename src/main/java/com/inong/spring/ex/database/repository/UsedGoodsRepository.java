package com.inong.spring.ex.database.repository;

import java.util.List;
//데이터 베이스 관련 처리
@Mapper
public interface UsedGoodsRepository {

	//used_goods의 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList() ;
	
	
}
