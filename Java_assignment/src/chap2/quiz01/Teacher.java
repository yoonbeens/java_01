package chap2.quiz01;

public class Teacher extends Person {

	String sub;

		
	
	
	public Teacher(String name, int age, String sub) {

		super.info(name, age);

		System.out.println("과목: "+ sub);
		System.out.println("-----------------");
	}


	
	
}
