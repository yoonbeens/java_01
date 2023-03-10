package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int idx;
		String idy;
		
		
		while(true) {
			System.out.println("'-'을 포함해 주민번호를 입력하세요.");
			idy = sc.next();
			char c = idy.charAt(6);
			
			if(idy.length()!=14) {
				System.out.println("주민등록번호는 '-'을 포함한 14자리입니다");
			} 
			else break;
		}
		idx = Integer.parseInt(idy.substring(7,8));
		int idz = Integer.parseInt(idy.substring(0,2));
		String month = idy.substring(2, 4);
		String day = idy.substring(4, 6);
		String birth = idy.substring(0, 2);
		if(idx==1 || idx==3) {
			if(idz==9) {
			System.out.println((1900 + birth) + "년" + month + "월" + day + "일" + (2023-Integer.parseInt(birth)) + "세" + "남자입니다." );
			} else if(idz==0) {
				System.out.println((2000 + birth) + "년" + month + "월" + day + "일" );
			}
		} else if (idx==2 || idx==4) {
			if(idz==9) {
			System.out.println((1900 + birth) + "년" + month + "월" + day + "일" + (2023-Integer.parseInt(birth)) + "세" + "여자입니다." );
			} else if(idz==0) {
				System.out.println((2000 + birth) + "년" + month + "월" + day + "일" );
			}
				
		} else {
			System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
		}
		
		
		sc.close();
		

	}

}
