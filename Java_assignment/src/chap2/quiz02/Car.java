package chap2.quiz02;

public class Car {

	private String model; 
	private int speed; 
	private char mode; 
	private boolean start; 
	
	public Car(String name) {	
		model = name;
		System.out.printf("%s를 구매합니다.\n", model);
	}
	
	
	void setSpeed (int speed) {
		
		if(speed<0 || speed>200) {
			System.out.println("속도는 0에서 200 사이여야 합니다.");
			return;
		} else if (!start){
			System.out.println("시동이 걸려있지 않습니다.");
			return;
		} else if(mode != 'D' && mode != 'R') { 
			System.out.println("변속모드를 'D'나 'R'로 설정해주세요.");
			return;
		} else if(mode=='R'&& speed>40) {
			System.out.println("'R'모드에서는 40Km을 초과할 수 없습니다.");
			return;
		} else {
			this.speed=speed;
		}
	}
	
	
	void setMode (char mode) {
		if(mode!='R' && mode!='N' && mode!='D'){
			this.mode = 'P';
		} else {
			this.mode = mode;
		} 
	}
	
	
	public char getMode() { 
		return mode;
	}
	
	void engineA() { 
		gasoline(); 
		oil(); 
		start = true; 
		cylinder(); 
		System.out.println("시동이 걸렸습니다.");
	}
	
	private void gasoline() { 
		System.out.println("연료가 엔진에 주입됩니다.");
	} 
	
	
	private void oil() { 
		System.out.println("엔진오일이 순환합니다.");
	} 
	
	private void cylinder() {
		if(start) {
			System.out.println("실런더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");	
			return;
		}
	}
	
	void engineB() { 
		if(speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else if(mode!='P') {
			System.out.println("P 모드로 먼저 변속기를 변경하세요.");
			return;
		} else {
			start = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	}

	public boolean startb() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
	
	
}
