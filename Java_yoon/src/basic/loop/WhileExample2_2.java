package basic.loop;

public class WhileExample2_2 {

	public static void main(String[] args) {

	//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int a = 1;
		int i = 0;

		while(a <= 30000) {
			if(a % 258 == 0) {
				i++;
			}
			a++;
		}
		
		System.out.println(" " + i);
		
		
		
		
		
	//1000의 약수의 개수를 구하세요.
	//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
    //그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int b = 1;
		int c = 0;
		
		while(b <= 1000) {
			
			if(1000 % b == 0) {
				c++;
			}			
			b++;
		}
		System.out.println(" " + c);
		
		
		
	}
}
