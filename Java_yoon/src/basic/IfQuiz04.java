package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

		 # max, mid, min 이라는 변수를 미리 선언하셔서
		  판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		  마지마ㅏㄱ에 한번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 수를 입력하세요.");
		int max = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int mid = sc.nextInt();
		System.out.println("세 번째 수를 입력하세요.");
		int min = sc.nextInt();

		if(max > mid) {
			if (mid > min) {
				System.out.println("최대값: " + max);
				System.out.println("중간값: " + mid);				
				System.out.println("최소값: " + min);
			} else {
				System.out.println("최대값: " + max);
				System.out.println("중간값: " + min);
				System.out.println("최소값: " + mid);
			}

		} else if(mid > max) {
			if(max > min) {
				System.out.println("최대값: " + mid);
				System.out.println("중간값: " + max);
				System.out.println("최소값: " + min);
			} else {
				System.out.println("최대값: " + mid);
				System.out.println("중간값: " + min);
				System.out.println("최소값: " + max);
			}

		} else if(min > max) {
			if(max > mid) {
				System.out.println("최대값: " + min);
				System.out.println("중간값: " + max);
				System.out.println("최소값: " + mid);
			} else {
				System.out.println("최대값: " + min);
				System.out.println("중간값: " + mid);
				System.out.println("최소값: " + max);
			}
		}
		
		sc.close();
		
		
		
		/* int max, mid, min;

		if(num1 > num2 && num1 > num3) {
			max = num1;
			if(num2 > num3) {
			mid = num2;
			min = num3;
		} if(num2 > num1 && num2) {
		} else {
			mid = num3;
			min = num2;
		}
		} else if(num2 > num1 && num2 > num3)
		max = num2;
		  if(num1 > num2) {
		mid = num1; min = num2;
				} else {
					mid = num2; min = num1;
					}
		}

		System.out.println("---------------------"_;
		System.out.println("최대값: " + max)
		System.out.println
		System.out.println
		 */
		
	}






}


