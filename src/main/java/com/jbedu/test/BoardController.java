package com.jbedu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // 컨트롤러 클래스임을 명시함 
public class BoardController {

	@RequestMapping(value = "/hello2")  // value(요청)은 절대 중복 되면 안됨!!
	public String test() {
		return "hello"; // 클라이언트에게 보내줄 jsp의 이름 
	}
	
}
