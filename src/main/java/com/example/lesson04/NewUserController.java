package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.NewUserBO;

@RequestMapping("/lesson04")
@Controller
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;

	// 요청 URL : http://localhost/lesson04/ex01/1
	@RequestMapping(method = RequestMethod.GET, path = "/ex01/1")
	public String ex01_1() {
		return "lesson04/addUser";		// 여기서 리턴되는 값은 JSP의 경로이다. 설정 파일에 suffix 설정이 돼 있으므로 .jsp는 안 쓴다. prefix 도 설정돼 있다.
	}
	
	
	// 요청 URL : http://localhost/lesson04/ex01/add_user
	//@RequestMapping(path = "/ex01/add_user", method = RequestMethod.POST)
	@PostMapping("/ex01/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value = "email", required=false) String email,
			@RequestParam(value = "introduce", required=false) String introduce) {
		// DB Insert
		
		newUserBO.addNewUserAsField(name, yyyymmdd, email, introduce);
		
		return "lesson04/afterAddUser";
	}
}
