package basic.loop;

public class asdf {

	public static void main(String[] args) {
		
		//2 3 5 7 10
		int cnt = 0;
		
		for(int j = 1;j<=30;j++) {
			cnt = 0;
			for(int i = 1; i<= j;i++) {
				if(j%i == 0) {
					cnt++;					
				}
				if(cnt == 2) System.out.printf("%d ",j);
			}//for(i)닫히는 괄호		
		
		}//for(j)닫히는 괄호
		
	}
	
}

