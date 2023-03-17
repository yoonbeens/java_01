package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car car = new Car("꼬마자동차 붕붕이"); 
		
		System.out.println("*** 운전을 시작합니다 ***");
		System.out.println("Mode: R, N, D, P");
		System.out.println("----------------");
		
		car.setSpeed(50);
		
		System.out.println("----------------");
		
		car.engineA(); 
		car.setMode('D'); 
		car.setSpeed(100); 

		System.out.println("----------------");
		
		car.engineB(); 
		
		System.out.println("----------------");
		
		car.setSpeed(0); 
		car.setMode('P'); 
		car.engineA();
		
		
		
		
		
		
	}

}














