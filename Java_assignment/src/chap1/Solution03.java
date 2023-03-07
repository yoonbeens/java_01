package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {

		/*
		문제:
			scores 배열에 존재하는 점수에 순위를 매겨서 출력하는 프로그램 입니다.

		입력: 
			Scanner를 활용하여 총 5개의 점수를 입력받습니다.
			타입은 정수 타입이며 scores 배열에 순서대로 삽입합니다.
			점수의 순서는 정해진 것이 없습니다만 중복은 허용하지 않는다고 가정합니다.
			ex) 85 100 35 47 90 
			
		출력:
			ex) 
			점수    		순위
			--------------------------
			85		3
			100		1
			35		5
			47		4
			90		2
			
			의 형태로 출력합니다. 점수와 순위의 간격은 적절하게 띄워 주시면 되겠습니다.
			*/
		
			Scanner sc = new Scanner(System.in);
			int[] nums = new int[5];
			int[] rank = new int[5];
//			int[] rank = new int[] {1,1,1,1,1};
			int i;
						
			for(i=0; i<nums.length; i++) {
				System.out.println("점수: ");
				nums[i] = sc.nextInt();
				rank[i] = 1;
			}
			
			for(i=0; i<nums.length; i++)
				//rank[i] = i+1;
				for(int j=0; j<nums.length; j++) {
					if(nums[i]<nums[j]) {
						rank[i] += 1;
					}
				}
			
			System.out.println("점수\t순위");
			for(i=0; i<nums.length; i++) {
				System.out.println(nums[i] + "\t" + rank[i]);
				
			}
			System.out.println();
			
			
			
//			for(int j=0; j<nums.length; j++) {
//				int count = 0;
//				if(rank[j]=[5]) {
//					
//				}
//				for(int k=0; k<nums.length; k++) {						
//					if(nums[k]<nums[k+1]) {						
//						count++;						
//					} 
//				}
//				rank[j] = count;
//			}
			
		
			
//			System.out.println("점수: ");
//			int num = sc.nextInt();
//			int n = nums[num];
//			
//			if(nums[0]>nums[1]) {
//				
//			}
			
//			int count = 0;
//			for(int i=0;i<nums.length;i++) {
//				System.out.print("점수: ");
//				nums[i] = sc.nextInt();
//				
//				for(int j=0; j<nums.length;j++) {				
//					if(nums[j]>nums[i]) {
//						count++;
//					}
//				}
//			}

//			int count = 0;
//			for(int i=0;i<nums.length;i++) {
//				System.out.print("점수: ");
//				nums[i] = sc.nextInt();
//				if(nums[i]<nums[i]+1) {
//					for
//					co[i]=nums[i];
//				}
//
//			}
//			
//			System.out.println("점수\t순위");
//			System.out.println("-------------------");

			


			
			
		
		
		
		
	}

}
