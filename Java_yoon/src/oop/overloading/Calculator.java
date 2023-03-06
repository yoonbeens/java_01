package oop.overloading;

public class Calculator {
	
	/*
	 # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	  생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법
	  
	  - 오버로딩 적용 조건:
	  1. 매개 변수의 데이터 타입이 다를 것! or
	  2. 매개 변수의 전달 순서가 다를 것! or
	  3. 매개 변수의 개수가 다를 것.
	 */

	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
//	void inputData(int b, int a) {} (x) -> A호출할 때 구분이 되어야 한다.
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) 정수 매개값 1개를 받는 메서드가 이미 선언됨.=A
	
//	int inputData(int number) {
//		return 0;
//	} (x) 리턴 타입은 오버로딩에 영향을 미치지 못한다.
	
	
	void calcRectArea(int a){
		int result = a * a;
		System.out.println("정사각형의 넓이: " + result);
	}
	
	void calcRectArea(int a, int b) {
		int result = a * b;
		System.out.println("직사각형의 넓이: " + result);
	}
	
	void calcRectArea(int a, int b, int c) {
		double result = ((a + b)/2.0) * c;
		System.out.println("사다리꼴의 넓이: " + result);
	}
	
	//double calcRectArea(int a, int b, int c){
//		return (a + b); * c / 2.0;
//	  }
	
}
