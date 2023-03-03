package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		/*
		 Scanner를 이용해서 사용자에게
		 이름, 나이, 키를 입력 받아서
		 해당 정보를 저장하는 객체를 디자인 해보세요.
		 객체 내에는 해당 사람의 정보를 모두 출력해 주는
		 info() 메서드가 존재합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.next();
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		System.out.println("키: ");
		int hei = sc.nextInt();
		
		Person p = new Person(name, age, hei);
		p.peopleInfo();
		
		sc.close();
		
		
		
		
		
		
	}

}
