package oop.string;

import java.util.Scanner;

public class StringQuiz022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력하세요.");
			System.out.println("-을 포함해서 입력하세요.");
			System.out.print("> ");
			String ssn = sc.next();
			
			ssn = ssn.replace("-", "");
			
			if(ssn.length() != 13) {
				System.out.println("주민등록번호는 13자리입니다.");
			} else {
				switch(ssn.charAt(6)) {
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
					
				case '2': case '4':
					System.out.println("여자입니다.");
					break outer;
					
				default:
					System.out.println("잘못 입력했습니다.");
				}
			}
			
		}
		sc.close();
		
		
	}
	
}
