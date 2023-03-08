package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {

		
		Player p1 = new Player();

		
		System.out.println("-------------------");
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.characterInfo();
		
		Warrior w2 = new Warrior("전사짱짱맨2");
		w2.characterInfo();
		
		Mage m1 = new Mage("법사짱짱맨");
		m1.characterInfo();
		
		Hunter h1 = new Hunter("냥꾼짱짱맨");
		h1.characterInfo();
		
		System.out.println("-------------------");
		

		
		w1.rush(w1);
		w1.rush(w2);
		w1.rush(m1);
		w1.rush(h1);

		
	}

}
