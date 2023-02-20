package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: XXX
		 나이: XXX
		 출생년도: XXXX
		 
		 을 출력하세요. (출력 함수는 마음댈 사용해서 출력하시고
		 출생년도는 입력사항이 아닙니다)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
	    String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.close();
	    
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
        System.out.print("출생년도: " + (2023 - age));
		
        
        
        /*
        System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.println(name);
		
		이름: 이름
		이름
		나이: 
         */
		
		
	}

}
