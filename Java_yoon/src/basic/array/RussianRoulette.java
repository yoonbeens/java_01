package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("게임을 시작합니다.");
		sc.nextLine();
		

		int peo;

		while(true) { 
			System.out.println("게임에 참여할 인원을 입력해주세요.(2~4)");
			System.out.print("> ");
			peo = sc.nextInt();

			if(peo<2 || peo>4) {
				System.out.println("2~4명 사이로 다시 입력해주세요.");
				continue;
			}
			break;
		}

		String[] person = new String[peo];
		System.out.println("\n 플레이어의 이름을 입력해주세요.");

		for(int i =0; i<person.length; i++) {
			System.out.print((i+1)+"번 플레이어: ");
			person[i] = sc.next();
		}
		System.out.println("\n등록된 플레이어: "+Arrays.toString(person));


		int bullett;
		while(true) {
			System.out.println("\n 실탄 개수를 입력해주세요. (1~5)");
			System.out.print("> ");
			bullett = sc.nextInt();

			if(bullett<1 || bullett>5) {
				System.out.println("1~5개 사이로 다시 입력해주세요.");
				continue;
			}
			break;
		}

		
		boolean[] bulletPos = new boolean[6];

		for(int i=0; i<bullett; i++) {
			int bulletR = (int) (Math.random()*bulletPos.length);	
			if(bulletPos[bulletR]==true) {
				i--;
				continue;	
			} else {
				bulletPos[bulletR] = true;
			}
		}


		int startP = (int) (Math.random()*(person.length)); 
		
		System.out.println("\n"+person[startP]+"부터 차례대로 순서가 돌아갑니다.");
		System.out.println("엔터를 누르면 게임이 시작됩니다.");
		sc.nextLine();

		
		int bulletCount=bullett;
		while(true) {

			System.out.println(person[startP]+"의 차례.");
			System.out.println("'Enter'를 누르면 격발됩니다.");
			sc.nextLine();					
			int bang = (int) (Math.random()*6);
			

			if(bulletPos[bang]==true) {
				System.out.println("총알이 발사되었습니다.");	
				System.out.println(person[startP]+" 님이 사망하였습니다.");	

				for(int i=startP; i<person.length-1; i++) { 
						person[i] = person[i+1];
				}
				
				String[] temp = new String[person.length-1];		
				for(int i=0; i<temp.length; i++) {
					temp[i] = person[i];
				} 
				
				person = temp; temp = null;

				bulletPos[bang] = false;
				bulletCount -= 1;
				
			} else {
				System.out.println("발사되지 않았습니다.");
				startP += 1;
			}
				
			if(startP >= person.length) {
				startP = 0;
			}
			
		
			if(person.length==1) {
				System.out.println("\n남은 인원은 1명입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(bulletCount==0) {
				System.out.println("\n총알이 모두 소모되었습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			

			System.out.println("\n 현재 생존 인원: "+Arrays.toString(person));
			System.out.println("새 총알을 장전합니다.");
			sc.nextLine();

		}

		System.out.println("\n------------------------\n");
		System.out.println("남은 총알: "+bulletCount);
		System.out.println("생존 인원: "+Arrays.toString(person));
		
		sc.close();
		
		
	}

}
