package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {
	
	static Random r = new Random();	
	
	static int prize1 = 0;	//1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0;	//1등 당첨 횟수를 세 줄 변수
	static int prize3 = 0;	//1등 당첨 횟수를 세 줄 변수
	static int prize4 = 0;	//1등 당첨 횟수를 세 줄 변수
	static int prize5 = 0;	//1등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static List<Integer> createLotto(){
		
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		 */
		
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		List<Integer> list = new ArrayList<>(lotto);
		
		return list;
		
		
	}
	
	//보너스 번호를 생성하는 메서드

	public static int createBonusNum(List<Integer> bonusN) {
		
		int bonus = 0;

		while(true) {
			bonus = r.nextInt(45)+1;
			if(!(bonusN.contains(bonus)))
				break;			 
		}		
		
		return bonus;
		
		/*
		 # 당첨번호
		 - 매개값으로 전달되는 당첨번호 집합을 전달 받으신 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */
		
		
		
		
		
	}
	
	//당첨 등수를 알려주는 메서드
	public static int checkLottoNumber(List<Integer> list, List<Integer> bonusN, int bonusNum) {
		/*
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨 번호를 비교하여
		 일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 -> 보너스번호 일치 -> 2등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */

		
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.contains(bonusN.get(i))) {
				count++;
			}
		}
		return count; 
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		//로또 번호 생성 메서드를 호출해서 당첨번호를 하나 고정시키세요.
		
		//보너스번호도 하나 고정시키세요.
	
		
		List<Integer> cor = createLotto(); 

		int bonusNum = createBonusNum(cor); 

		int countt = 0; 

		List<Integer> list = new ArrayList<>(); 
		int cnt = checkLottoNumber(list, cor, bonusNum); 
		
		while(true) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
			  반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long) 
			 */
			
			 

			if (cnt == 6) {
				prize1++;
				break;

			} else if (cnt == 5) {
				prize2++;

			} else if (cnt == 4) {
				prize3++;

			} else if (cnt == 3) {
				prize4++;

			} else if (cnt < 3 && cnt >= 0) {
				failCnt++;

			} else {
				break;
			}

			countt++;
		
			System.out.println("시도 횟수: " + countt);
		
		}
		
		System.out.println("1등 당첨 축하드립니다!");
		System.out.println("2등: " + prize2 + "회");
		System.out.println("3등: " + prize3 + "회");
		System.out.println("4등: " + prize4 + "회");
		System.out.println("5등: " + prize5 + "회");
		System.out.println("꽝: " + failCnt + "회");
		System.out.println("총액: " + (prize1 + prize2 +prize3 + prize4 + prize5 + failCnt)*1000L + "원");
		
		
		
		
		

	}

}














