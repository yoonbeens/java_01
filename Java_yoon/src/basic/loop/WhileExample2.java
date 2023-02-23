package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		//48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		


	    int n = 48;
	    
	    while(n <= 150) {
	    	if(n % 8 == 0) {
		        System.out.printf("%d ",n);
	    	}
	    	
	    	n++;
	    }
		
	
	    System.out.println();
	    
	    
        int i = 45;
        while(i <= 150) {
        	System.out.print(i + " ");
        	i += 8;
        	
        	i++;
        }

		
        System.out.println();   
        

        //1 ~ 100까지의 정수 중 4의 배수이면서
        //8의 배수는 아닌 수를 가로로 출력해 보세요.
        
        int k = 1;
        
        while(k <= 100) {
        	if(k % 4 == 0) {
            	if(!(k % 8 == 0)) {
            		System.out.printf("%d ", k);
            		
            	}
        	}

        	k++;
        }
		
        
        System.out.println();
        
        
        int j = 1;
        while(j <= 100) {
        	if(j % 4 == 0 && j % 8 != 0) {
        			System.out.print(j + " ");
        		}

        	j++;
        }
 
        	        	
        	        	
        	        	
        }
		
		
		
		
	}


