package etc.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {

		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
		
		
		
//		Random r = new Random();
//		
//		List<Integer> lotto = new ArrayList<>();
//		
//		int i = 0;
//		while(i < lotto.size()) {
//			int rn = r.nextInt(45) + 1;
//			if(!lotto.contains(rn)) {
//				lotto.add(rn);
//				i++;
//			}
//		}
		

		
//		Random r = new Random();
//		int[] lotto = new int[6];
//		
//		int i = 0;
//		while(i < lotto.length) {
//			boolean flag = false;
//			int rn = r.nextInt(45) + 1;
//			for(int j=0; j<=i; j++) {
//				if(rn == lotto[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				lotto[i] = rn;
//				i++;
//			}
//		}
		
		
		
		
		
		
		
		
		
	}

}














