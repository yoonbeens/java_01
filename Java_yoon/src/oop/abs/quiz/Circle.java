package oop.abs.quiz;

public class Circle extends Shape {

	int a;
	
	
	public Circle(String name, int a) {
		super(name);
		this.a = a;
	}

	@Override
	double getArea() {

		return a*a*Math.PI;
	}




	
	

}
