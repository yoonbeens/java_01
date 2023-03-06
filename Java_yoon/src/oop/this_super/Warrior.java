package oop.this_super; 



public class Warrior extends Player {

	int rage;

	Warrior(String name){
		//모든 생성자에는 super()가 내장되어 있습니다.
		//자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수가 있기 때문입니다.
		super(name);
//		: this.name = name;
		this.rage = 60;
		
	}
	
	
	@Override //art + shift + s -> override/implement methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	


		
		
	
}
