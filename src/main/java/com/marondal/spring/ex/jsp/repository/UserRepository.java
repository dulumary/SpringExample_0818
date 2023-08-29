package com.marondal.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.spring.ex.jsp.domain.User;

@Repository
public interface UserRepository {
	
	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email);
	
	public int insertUserByObject(User user);
	
	public User selectLastUser();
	
	

}
