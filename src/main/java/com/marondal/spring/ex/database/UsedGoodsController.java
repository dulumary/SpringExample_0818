package com.marondal.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.database.domain.UsedGoods;
import com.marondal.spring.ex.database.service.UsedGoodsService;

// request, response 를 담당
@Controller
public class UsedGoodsController {

	@Autowired
	private UsedGoodsService usedGoodsService;
	
	// used goods 데이터 조회 결과 json으로 response에 채운다
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		
		return usedGoodsList;
	}
	

}
