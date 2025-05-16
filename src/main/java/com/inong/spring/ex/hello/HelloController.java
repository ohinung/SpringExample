package com.inong.spring.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody // 리스폰스 바디로 리턴되는 값을 알아서 채워줌 규격은 알아서 잡아줌
	public String hello() {
		return "Hello world";
	}
	
}
