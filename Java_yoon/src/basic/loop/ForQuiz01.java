package basic.loop;

import java.util.Scanner;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요. (for)
		//19행까지 출력하세요.
		

		
		int a = (int) ((Math.random()*18) + 2);
		
		System.out.println("*** 구구단 " + a + "단 ***");
		System.out.println("------------------------");
		for(int hang=1; hang<=19; hang++) {
			System.out.printf("%d x %d = %d\n", a, hang, a*hang);
		
		}
		
		
		
		
		
		
		
	}

}
