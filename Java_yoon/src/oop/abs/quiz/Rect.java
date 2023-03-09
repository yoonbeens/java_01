package oop.abs.quiz;

public class Rect extends Shape {

	private int a,b;

	public Rect(String name, int a,int b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public double getArea() {
		return a*b;
	}

		
}









