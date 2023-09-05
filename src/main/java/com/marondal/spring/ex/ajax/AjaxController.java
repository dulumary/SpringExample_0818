package com.marondal.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	
	// 이름과 생년월일을 전달 받고, 이름과 나이를 response로 돌려주는 기능
	@GetMapping("/ajax/person")
	@ResponseBody
	public Map<String, Object> personInfo(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday) {
		
		// 20010403
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2023 - year + 1;
		
		// {"name":"김인규", "age":24}
		
		Map<String, Object> personMap = new HashMap<>();
		personMap.put("name", name);
		personMap.put("age", age);
		
		return personMap;
		
	}
	
	@GetMapping("/ajax/ex01")
	public String ex01() {
		return "ajax/ex01";
	}

}
