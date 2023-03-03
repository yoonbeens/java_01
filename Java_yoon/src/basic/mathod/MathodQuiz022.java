package basic.mathod;

import java.io.PushbackInputStream;
import java.util.Arrays;
import java.util.Scanner;


public class MathodQuiz022 {
	


	
	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열을 선언해서 값 그대로 내리기
	//매개값으로 온 값을 마지막에 채우기.
	static void push(String newFood){
		Scanner sc = new Scanner(System.in);
		System.out.println("음식을 입력하세요: ");
		String newf = sc.next();
		int count = 3;
		while(true) {
			boolean flag = false;
			for(int i=0; i<count; i++) {
				if(newf.equals(foods[i])) {
					System.out.println("이미 존재하는 음식입니다.");
					flag = true;
					break;
				}
				
			}
			if(!flag) {
				foods[count] = newf;
				break;
			} else {
				System.out.println("음식: ");
				newf = sc.next();
			}
		}
		count++;
	}
	
	//배열의 내부 데이터를 단순 출력하는 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	//배열 내의 특정 음식의 위치를 찾아주는 함수
	//반복문 이용해서 돌리면 됩니다.
	static int indexOf(String targetName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("음식을 입력하세요: ");
		String newf = sc.next();
		int i;
		for(i=0; i<foods.length; i++) {
			if(newf.equals(foods.length-1)) {
				break;
			}
		}
		System.out.print("음식 번호: ");
		return i;
	}
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//intdexOf의 리턴값으로 판단하여 리턴.
	static boolean include(String targetName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("음식을 입력하세요: ");
		String newf = sc.next();
		if(newf.equals(foods[indexOf(targetName)])) {
			System.out.println("존재하는 음식입니다.");
		}
	}
	
	//특정 음식 제거 함수
	//앞에서 진행한 배열의 삭제 로직
	static void remove(String targetName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("음식을 입력하세요: ");
		String newf = sc.next();
		if(newf.equals(foods[indexOf(targetName)])) {
			foods[indexOf(targetName)];
		}
	}
	
	//특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		
	}
	

	public static void main(String[] args) {

		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		
		//파스타의 인덱스를 알아내세요.

		//김치찌개의 인덱스를 알아내세요.

		//짜장면의 인덱스를 알아내세요. -> -1을 리턴
		
		remove("김치찌개");
		remove("망고"); //존재하지 않는 음식명입니다 출력.
		
		//라면의 존재 여부
		
		//양념치킨의 존재 여부
		
		//2변 인덱스 데이터를 닭갈비로 수정
		
		
	}

}
