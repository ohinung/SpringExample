package com.inong.spring.ex.lifecycle;


//한 사람의 정보를 무껑서 관리한다.
public class Person {

	//멤버변수 : 이름, 나이
	private String name;
	private int age;
	
	//멤버변수를 넣을 수 있는 방법
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//toString을 Override한다.
	@Override
	public String toString() {
		return "이름 : " + name + "나이 :" + age;
	}
}
