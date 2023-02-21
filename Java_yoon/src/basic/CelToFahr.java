package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
		 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 # ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (℉)	
		 실수로		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨: ");
		double cel = sc.nextDouble();
	
		
		
		System.out.println("섭씨: " + (cel) + "℃");
	    System.out.println("화씨: " + ((cel * 1.8) + 32 ) + "℉");	

		sc.close();
		
	}

}
