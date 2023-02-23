package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		*/
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total += i;
		}

		//for문은 begin과 end의 범위가 명확할 때 주로 쓴다
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)
		
		
		for(int n=1; n<=200; n++) {
			if(n % 6 == 0 && n % 12 != 0) {
    			System.out.print(n + " ");
		}
		
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요. (for)
		
		int count = 0;
		
		for(int i=1; i<=60000; i++)
			if(i % 177 == 0) {
				count++;
			}
		
		System.out.print(count);
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 X 4 X 3 X 2 X 1
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int x = sc.nextInt();
		
		int t = 1;
		
		for(int k=x; k>=1; k--) {
			t *= k;
		}
		System.out.printf("%d!: %d/n", x, t);
		
		
		
		
		
		
		
		
		
	}
}


