package basic.loop;

public class WhileExample {

	public static void main(String[] args) {

		/*
		 # while문의 진행 순서.
		 1. 제어변수를 선언함. (시작값이 정해짐)
		 2. while문의 조건식을 검사해서 true면 반복문이 시작.
		  false라면 반복문 종료.
		 3. while문 블록 내부가 한 번 진행이 되면(끝까지 내려가면)
		  다시 조건식을 검사하여 true라면 반복문 계속 진행,
		   false라면 반복문 종료
		 4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조졍.
		 */
		
		
		
		int n = 1; //제어변수: 반복문의 횟수를 제어할 변수. (begin)
		
		while(n <= 10) {//논리형 조건식(반복문의 끝): true일 때마다 1바퀴를 돈다. (end)
			System.out.println("안녕하세요. 반갑습니다~!" + n);
			n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조정 (step)
		}
		
		System.out.println("------------------------------------");
		
		//1 ~ 10까지의 누적합계
		
		int i = 1; //begin
		int total = 0; //누적 합을 기억해줄 변수		
		
		while(i <= 10) { //end
			total += i; //복합 대입 연산자: 누적 할 때 = (total = total +i;)
			i++; //step
		}
		
		System.out.println("1~10까지의 누적합: " + total);
		
		
	}

}
