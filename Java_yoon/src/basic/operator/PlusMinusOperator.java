package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {

		//증감연산자 (++, --
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.
		
		int a = 1;
     	a = a + 1;		
	    a++;
	    ++a;
	    a--;
	    --a;
	   
		System.out.println(a);
		System.out.println("-----------------------");
	
	    
	    
		int i = 1;
		int j = i++; //후위 연산 (선 연산 후 증감)
		int k = i--;
		
		System.out.println("i의 값: " + i);
		System.out.println("j의 값: " + j);
		System.out.println("k의 값: " + k);
		
		System.out.println("-----------------------------");
		
		int x = 1;
		int y = ++x; //전위 연산 (선 증감 후 연산)
		int z = --x;
		
		System.out.println("x의 값은: " + x);
		System.out.println("y의 값은: " + y);
		System.out.println("z의 값은: " + z);
		
		int d = 3;
		int e = d++ + 5 * 3;
		int l = d--;
		int f = d;

		
		System.out.println(d);
		System.out.println(l);
		System.out.println(e);
		System.out.println(f);
		

	}

}
