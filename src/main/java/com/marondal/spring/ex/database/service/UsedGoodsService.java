package com.marondal.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.database.domain.UsedGoods;
import com.marondal.spring.ex.database.repository.UsedGoodsRepository;

// 로직 (business) 담당
@Service
public class UsedGoodsService {
	
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// used_goods 모든 데이터 조회
	public List<UsedGoods> getUsedGoodsList() {
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		return usedGoodsList;
		
	}
	
	
	
	

}
