package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuizT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String ssn;
		char c;
		
		while(true) {
			
			System.out.println("주민등록번호를 입력하세요: ");
			ssn = sc.next();
			
			if(ssn.indexOf("-") == -1) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			c = ssn.charAt(7);
			if(!(c == '1' || c== '2' || c == '3'|| c == '4')) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}
			
			try {
				String test = ssn.substring(0, 6);
				String test2 = ssn.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자로 정확하게 입력하셔야 합니다.");
			}			
		}
		
			int year = Integer.parseInt(ssn.substring(0,2));
			int month = Integer.parseInt(ssn.substring(2,4));
			int day = Integer.parseInt(ssn.substring(4,6));
		
			String gender; int birthYear;
			
			if(c == '1' || c == '3') {
				gender = "남자";
			} else {
				gender = "여자";
			}
		
			if(c== '1' || c == '2') {
				birthYear = 1900 + year;
			} else {
				birthYear = 2000 + year;
			}
		
			int age = 2023 - birthYear;
			
			System.out.printf("%d년 %d월 %d일 %d세 %s\n"
					, birthYear, month, day, age, gender);
			
			sc.close();
			
			

	}

}
