package basic.if_;

import java.util.Scanner;

public class IfQuiz05_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수: ");
		double num1 = sc.nextDouble();
		System.out.println("영어 점수: ");
		double num2 = sc.nextDouble();
		System.out.println("수학 점수: ");
		double num3 = sc.nextDouble();
		
		double numA = (num1 + num2 + num3) /3;
		String name;
		
		if (numA >= 90)
				 if (numA >= 95) name = "A+";
			     else			 name = "A";
			else if (numA >= 80) name = "B";
			else if (numA >= 70) name = "C";
			else if (numA >= 60) name = "D";
			else			     name = "F";
		
			System.out.printf("평균 점수: %.1f\n",numA);
			System.out.printf("당신의 평균 학점은 %s 입니다.",name);
			
			sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
