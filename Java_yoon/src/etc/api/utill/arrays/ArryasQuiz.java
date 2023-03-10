package etc.api.utill.arrays;

import java.util.Arrays;

public class ArryasQuiz {

	public static String solution(String[] participant, String[] completion) {
		
		/*
	    - 참가한 사람의 이름이 담긴 배열 participant와
	    완주한 사람의 이름이 담긴 배열 completion이 주어질 때
	    완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
	    완주하지 못한 선수는 1명이라고 가정합니다.
	    */	 
		
		String[] c = new String[5];
			
		
			for(int i=0; i<participant.length; i++) {
				for(int j=0; j<completion.length; j++) {
					if(participant[i]!=completion[j]) {
						c[i] = participant[i];
					
				} else {
					
				}
			}
		}
		
		

		return c[0];
}
	
	
	public static void main(String[] args) {
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희",	"김철수"};
		
		
		
		System.out.println(solution(participant, completion));
		
		
		
		
		
	}

}
