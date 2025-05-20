package com.inong.spring.ex.database.repository;

import java.util.List;

@Mapper
public interface UsedGoodsRepository {

	//used_goods의 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList() ;
	
	
}
