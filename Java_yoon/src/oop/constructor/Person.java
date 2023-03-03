package oop.constructor;

import java.util.Scanner;

public class Person {

	

	
	String name;
	int age;
	int hei;
	
	
	Person() {
		
	}
	
	Person(String pName, int pAge, int pHei) {
		
		
		
	name = pName;
	age = pAge;
	hei = pHei;
		
	}
	
	void peopleInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + hei + "cm");
		System.out.println("-----------------");
	}
	
	
	
	
	
	
}
