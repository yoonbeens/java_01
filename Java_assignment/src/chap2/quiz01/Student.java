package chap2.quiz01;

public class Student extends Person {

	String num;

	
	public Student(String name, int age, String num) {

		super.info(name, age);

		System.out.println("부서: "+ num);
		System.out.println("-----------------");
	}
	

	
	
}
