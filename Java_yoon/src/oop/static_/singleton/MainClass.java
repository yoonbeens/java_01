package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s;
//		Singleton.s = null;
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();

//		하나의 주소값을 돌려 쓰게 된다.			
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);


		
		s1.method1();
		s1.method2();
		
	}

}
