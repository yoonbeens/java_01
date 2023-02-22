package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
		 #스캐너를 사용하여 정수를 하나 입력받으세요.
		 
		 - 입력받은 값이 7의 배수라면 "7의 배수입니다."를 출력.
		 - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다."를 출력.
		 - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요: ");
		int n7 = sc.nextInt();
		
//		if(n7 % 7 == 0 && n7 != 0) -으로 시작해도 된다.
		
		if (n7 == 0) {
			System.out.println("0 입니다.");}
		else if ((n7 % 7) == 0) {
			System.out.println("7의 배수입니다.");
		}
		else {
			System.out.println("7 의 배수가 아닙니다.");
			}
		
		sc.close();
		
		
		
		
		
	}

}
