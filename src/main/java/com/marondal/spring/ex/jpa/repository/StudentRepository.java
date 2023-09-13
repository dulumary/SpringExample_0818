package com.marondal.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marondal.spring.ex.jpa.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {

	// id 기준으로 내림차순으로 정렬한 모든행 조회
	public List<Student> findAllByOrderByIdDesc();
	
	// id를 기준으로 내림차순으로 정렬후 하나만 조회
	public List<Student> findTop1ByOrderByIdDesc();
	
	// name 컬럼이 일치하는 데이터 조회 
	public List<Student> findByName(String name);
	
	// name 컬럼이 일치하는 데이터 조회 
	// `name` IN ('유재석', '조세호')
	public List<Student> findByNameIn(List<String> nameList);
	
	// email 컬럼에 특정 문자열이 포함된 데이터 조회
	// `email` Like '%naver%'
	public List<Student> findByEmailContaining(String email);
	
	// id가 특정 값들 사이에 대응되는 데이터를 조회 id 기준으로 내림차순 
	// `id` BETWEEN 1 AND 2
	public List<Student> findByIdBetweenOrderByIdDesc(int start, int end);
	
	// 쿼리를 통한 조회
	// dreamJob 컬럼이 일치하는 데이터 조회
	@Query(value="SELECT * FROM `new_student` WHERE `dreamJob` = :dreamJob", nativeQuery=true)
	public List<Student> findByDreamJobQuery(@Param("dreamJob") String dreamJob);
}
