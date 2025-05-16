package com.inong.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody를 합친 어노테이션 따로 리스폰스 바디를 넣을 필요가............................
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {
	
	//직접 만든 클래스의 객체를 response에 담는 페이지
	@RequestMapping("/3")
	public Person personResponse() {
		Person me = new Person("오인웅",24);
		
		return me;
	}
	
	//status code를 수정한다.
	@RequestMapping("/4")
	public ResponseEntity<Person> statusResponse(){
		Person me = new Person("오인웅",24);
		
		ResponseEntity<Person> entity= new ResponseEntity<>(me, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
}
}
