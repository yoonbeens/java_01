package chap2.quiz01;

public class Employee extends Person {

	String cls;

	public Employee(String name, int age, String cls) {

		super.info(name, age);

		System.out.println("부서: "+ cls);
		System.out.println("-----------------");
	}
	
	
	
	
}
