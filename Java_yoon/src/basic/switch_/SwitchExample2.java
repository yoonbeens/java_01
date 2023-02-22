package basic.switch_;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		switch(point / 10) { //switch는 정수만 취하기 때문에 소수점은 버려진다.
		
		case 10:
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			} //흘러내릴 때 밑이 A이기 때문에 break가 필요 없다.
		
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
			
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;

		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
			
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
			
		default:
			if(point > 100 || point < 0) {
				System.out.println("점수를 잘못 입력하였습니다.");
			} else {
			    System.out.println("당신의 학점은 F입니다.");
			}

			
		}
		
		sc.close();
		
		
		
		
	}

}
