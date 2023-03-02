package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		/*
		클래스명: Solution04

		문제:
			학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
			총 학생의 수는 10명 입니다. 각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
			학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 그 학생이 몇 번 학생인지를 출력하면 됩니다.

		입력: 
			Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
			출석번호에 중복은 없습니다.
			입력되는 값을 제시합니다. 
			-> 3 1 4 5 7 9 6 10
			
		출력:
			ex) 
			숙제를 안 낸 학생의 번호:
			2
			8
			
			의 형태로 출력합니다. 
		*/
		Scanner sc = new Scanner(System.in);
		int num [] = {1,2,3,4,5,6,7,8,9,10};
		
		int[] n = new int [8];
		boolean flag[] = new boolean[10];
		for(int i=0; i<num.length-2; i++) {
			System.out.println("학번: ");
			n[i] = sc.nextInt();
		}
		for(int j=0; j<num.length; j++) {
			for(int k=0; k<num.length-2; k++)
			if(num[j] == n[k]) {
				flag[j]=true;
			}
		}
		for(int i=0; i<num.length; i++)
			
		System.out.println(Arrays.toString(flag));

		
		
		
		
		
	}

}
