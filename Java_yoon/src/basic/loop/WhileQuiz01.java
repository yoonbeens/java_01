package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		 #사용자에게 구구단 단수를 입력 받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex)
		 
		 구구단을 입력하세요: 4
		 *** 구구단 4 단 ***
		 4 X 1 = 4
		 4 X 2 = 8
		 .
		 .
		 .
		 4 X 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("구구단을 입력하세요: ");
		int i = sc.nextInt();		
		System.out.println("*** 구구단 " + i + "단 ***");

		int n = 1;
		
		while(n < 10) {
		    
		    System.out.println((i) + "X" + (n) + "=" + (i * n));
		
		    n++;
						
		}
		
		sc.close();
		
		
		
		
		
		
	}

}
