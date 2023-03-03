package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone(); //Phone(); -> 생성자 호출
		basic.shouSpec();
		
		System.out.println("-----------------------------");
		
		Phone basic2 = new Phone();
		basic2.shouSpec();
	
		System.out.println("-----------------------------");
		
		Phone galaxy23 = new Phone("갤럭시 23");
		galaxy23.shouSpec();
		
		System.out.println("-----------------------------");
		
		Phone iPhone14 = new Phone("아이폰 14", "스페이스 그레이");
//		iPhone14.color = "스페이스 그레이";
		iPhone14.shouSpec();
		
	}
	
}
