package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
		 입력받은 수의 약수의 총합을 구하세요.
		 입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");
		int a = sc.nextInt();
		
		int n = 1;
		int total = 0;
		
		while(n <= a) {
			if(a % n == 0) {
				total += n;
			}			
			++n;
		}
		
		System.out.println(a + "의 약수의 총합: " + total);
		
		sc.close();
		
		
		
		
		
		
	}

}
