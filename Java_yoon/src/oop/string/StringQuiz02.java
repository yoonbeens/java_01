package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		int idx;
		String idy;
		
		while(true) {
			System.out.println("'-'을 포함해 주민번호를 입력하세요.");
			idy = sc.next();
			
			if(idy.length()>14 || idy.length()<14) {
				System.out.println("다시 입력해주세요");
			} 
			else break;
		}
		idx = Integer.parseInt(idy.substring(7,8));
		if(idx==1 || idx==3) {
			System.out.println("남자입니다.");
		} else if (idx==2 || idx==4) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
