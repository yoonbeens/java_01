package oop.abs.quiz;

public class Circle extends Shape {

	private int r;
		
	public Circle(String name, int r) {
		super(name);
		this.r = r;
	}

	@Override
	double getArea() {
		return r*r*Math.PI;
	}




	
	

}
