package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {

		/*
		 1. 정수를 두개 입력받으세요. (x, y)
         2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
         ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
         처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.

         다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
         어떻게 대처할 지 생각해 보세요.
         (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
         입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
         - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수: ");
		int x = sc.nextInt();
		System.out.println("두 번째 정수: ");
		int y = sc.nextInt();

		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		
		int t = 0;
		int n = x;

		
/*		int start = (x > y ? y : x);
		int end = (x > y ? x : y);
		
		int total = 0;
		
		while(start <= end){
			total += start;
			start++;
		}
		*/
		
		
		while(n <= y) {			
			t += n;
		n++;	
		}
		
		System.out.println(t);

//		while(((n < y) ? (n <= y): (n >= y))) -왜 안나오지?
		
		sc.close();
		
	}

}
