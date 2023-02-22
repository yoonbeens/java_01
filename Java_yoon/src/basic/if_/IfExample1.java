package basic.if_;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
	    System.out.println("----------------------------------------");
	    
	    if(point >= 70) {
	    	System.out.println("합격하셨습니다!");
	        System.out.println("----------------------------------------");
	    } else {
	    	System.out.println("70점 미만입니다.");
	    	System.out.println("불합격 하셨습니다.ㅜㅜ");
	    } //else는 if 없이 단독으로 쓰일 수 없다.
		
		System.out.println("시험 치르느라 수고하셨습니다~");
		
		//true일 때는 if문 false일 때는 else
		//else 안에서 if, else if, else 다 열 수 있다.
		
		
	    
	    sc.close();
		
		
	}

}
