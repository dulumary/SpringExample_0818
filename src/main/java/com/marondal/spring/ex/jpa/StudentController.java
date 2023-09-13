package com.marondal.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.jpa.domain.Student;
import com.marondal.spring.ex.jpa.repository.StudentRepository;
import com.marondal.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/create")
	@ResponseBody
	public Student createStduent() {
		
		String name = "김인규";
		String phoneNumber = "010-0000-1111";
		String email = "lecture@hagulu.com";
		String dreamJob = "개발자";
		
		Student student = studentService.addStudent(name, phoneNumber, email, dreamJob);
		
		return student;
		
	}
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		// id가 3인 학생정보의 장래희망을 강사로 수정
		Student student = studentService.updateStudent(3, "강사");
		
		return student;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		
		// id가 3인 학생정보 삭제 
		studentService.deleteStudent(3);
		
		return "삭제 성공";
		
	}
	
	@GetMapping("/select")
	@ResponseBody
	public List<Student> selectStudent() {
		
		// 모든행 조회 
//		List<Student> studentList = studentRepository.findAll();
		
		// id 기준으로 내림차순으로 정렬한 모든행 조회 
//		List<Student> studentList = studentRepository.findAllByOrderByIdDesc();
		
//		List<Student> studentList = studentRepository.findTop1ByOrderByIdDesc();
		
//		List<Student> studentList = studentRepository.findByName("유재석");
		
//		List<String> nameList = new ArrayList<>();
//		nameList.add("유재석");
//		nameList.add("조세호");
//		
//		List<Student> studentList = studentRepository.findByNameIn(nameList);
		
//		List<Student> studentList = studentRepository.findByEmailContaining("naver");
		
//		List<Student> studentList = studentRepository.findByIdBetweenOrderByIdDesc(1,2);
		
		List<Student> studentList = studentRepository.findByDreamJobQuery("모델");
		
		return studentList;
	}
	
	
	

	
	@GetMapping("/lombok/test")
	@ResponseBody
	public Student lombokTest() {
		
//		Student student = new Student();
//		student.setName("김인규");
//		student.setDreamJob("개발자");
//		student.setPhoneNumber("010-1234-5678");
		
		Student student = Student.builder()
							.name("김인규")
							.dreamJob("개발자")
							.phoneNumber("010-0000-1111")
							.build();
		
		
		return student;
	}
}
