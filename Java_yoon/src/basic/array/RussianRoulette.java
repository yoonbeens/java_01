package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		Scanner sc = new Scanner(System.in);
		

		
		//게임 인원 입력
		System.out.println("시작 인원을 입력해주세요(2~4)");
		System.out.println("> ");
		int num = sc.nextInt();
		
		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 참가자의 명수와 동일합니다.
		
		System.out.println("참여자 이름을 입력하세요 ");
		int i;		
		String names[] = new String[num];
		
		for(i=0; i<num; i++) {
			System.out.print("참여자" + (i+1) + ":");
			String name = sc.next();
			
			names[i] = name;
		}
		

		
		
		
		//실탄 개수 입력
		System.out.println("총알 개수를 입력해주세요(1~5)");
		System.out.println("> ");
		int bul = sc.nextInt();
		
		System.out.println("참여 인원: " + num + "명");
		System.out.println("총알: " + bul + "개");
		System.out.println("참가자 목록\n" + (Arrays.toString(names)));
		
		//실탄을 탄창에 배치
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false를 true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두 개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		boolean[] bulletpos = new boolean[6];
		int shot = (int) (Math.random()*2 + 1);
		int bullet = (int) (Math.random()*bul + 1);
		int peo = (int) (Math.random()*num + 1);
		boolean flag = false;
		
		while(true) {
			
			
				for(i=0; i<bulletpos.length; i++) {
					for(int j=0; j<=i; j++) {
						if(flag == bulletpos[j]) {
							

							continue;							
						}													
					}
					
				}
					if(bullet != i) {
					bulletpos[bullet] = true;
					
					} else if(bullet == i && bullet >= bul && bullet <= bul) {
					break;	
					}
		
		
																		
		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.
		
		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
					int userNums[] = new int [num];
		
		for(i=0; i<userNums.length-1; i++)
			if(peo == userNums[i]) {
				System.out.println(names[peo] + "님 차례입니다.");
		
				
			}
		
		System.out.println("엔터를 누르시면 격발합니다");
		
		System.out.println("");
		sc.nextLine();
		System.out.println("격발하였습니다 !");
		
		sc.nextLine();


		//최후의 1인이 남을 때까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여주세요.

		
		for(i=0; i<names.length; i++) {
			if(shot == 1) {
				flag = true;
				for(int j=i; j<names.length-1; j++) {
					names[j] = names[j+1];
					System.out.println(names[j] + "님이 사망하셨습니다.");
				}
				break;
			}
		}
		
				
		
		}
		System.out.println("생존자 목록\n" + Arrays.toString(names));
		System.out.println("남은 총알 수: 0개");
		
		
		
		
		
		
		sc.close();
		
		
	}

}
