package basic;

import java.util.Scanner;

public class IfQuiz04_2 {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해 주세요: ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해 주세요: ");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수를 입력해 주세요: ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("세 정수가 모두 같은 값입니다.");
		} 
		
		if(num1 == num2) {
			if(num3 > num2) {
				System.out.println("최대값: " + num3);
				System.out.println("최소값: " + num1 + " 두 정수가 같은 값입니다");
				
			}
			else if(num2 > num3) {
				System.out.println("최대값: " + num1 + " 두 정수가 같은 값입니다");
				System.out.println("최소값: " + num3);
			
			}	
			
			
		}
			

		}
	
			
			
			
			
		
	}


