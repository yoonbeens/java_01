package chap2.quiz01;

public class Person {

	String name;
	int age;
	
	
	void info(String name, int age) {

		this.name = name;
		this.age = age;

		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		
	}
	
	
	
}
