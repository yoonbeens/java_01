package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("*** UP&DOWN 게임 ***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");
		System.out.println("정답 기회는 7회입니다.");
		
		int count = 7;
		int countt = 0;
		int rn = (int) (Math.random()*100 +1);
		
		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer < 1 || answer > 100) {
				System.out.println("범위 내의 숫자를 입력하세요!");
			continue; //회차를 건너 뛰어 입력값을 처음부터 다시 받고 싶을 때
			}
			
			if(count == 0) {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("마저 정답을 맞춰주세요.");
				System.out.println("-----------------");
			} 
			
			if(answer == rn) {
				System.out.println("정답입니다.");
				System.out.println(countt + "번 만에 맞추셨네요~");
				break;
			}
			
			else if(answer < rn) {
				System.out.println("UP");
				count--;
				countt++;
			}
			else if(answer > rn) {
				System.out.println("DOWN");
				count--;
				countt++;
			}

		}
		

		
		
		
		
		
		
		
	}

}
