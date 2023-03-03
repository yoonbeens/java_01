package oop.constructor;

public class Bread {

	String name;
	String info;
	int price;
	
	Bread(){
		
	}
	
	Bread(String bName, String bInfo, int bPrice) {
		name = bName;
		info = bInfo;
		price= bPrice;
	}
	
	void breadInfo() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵이름: " + name);
		System.out.println("주재료: " + info);
		System.out.println("가격: " + price);
		System.out.println("------------------");
		
	}
	
	
	
	
	
}
