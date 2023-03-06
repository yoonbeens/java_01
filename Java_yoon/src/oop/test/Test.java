package oop.test;

//작성중인 패키지와 다른 곳에 위치한 클래스를 사용하려면 import 선언이 필요하다.
//import oop.fruit.Apple;
//import oop.fruit.Banana;
//import oop.fruit.Melon;
import oop.fruit.*; //fruit 패키지의 모든 클래스를 import 하겠다!

public class Test {

	public static void main(String[] args) {
				
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 직접 표시해 주셔야 합니다.
		
		Apple a = new Apple();
		oop.juice.Apple a2 = new oop.juice.Apple();
		Banana b = new Banana();
		Melon c = new Melon();
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		//패키지 경로가 다르면 import 선언이 필요하다
		
		// 패키지는 카멜 케이스도 쓰지 않는 것이 관례
		// 자바는 기본 타입을 제외하면 거의 참조 클래스 타입
		
	}
	
}
