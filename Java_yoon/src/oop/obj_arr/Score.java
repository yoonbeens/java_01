package oop.obj_arr;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	String name;
	int h;
	int e;
	int m;
	int total;
	double hem;
	
	Score(String name, int h, int e, int m, int total, double hem){
		this.name = name;
		this.h = h;
		this.e = e;
		this.m = m;
		this.hem = hem;
	}
	
	
	void scoreInfo() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + h);
		System.out.println("영어: " + e);
		System.out.println("수학: " + m);
		System.out.println("총점: " + total);
		System.out.println("평균" + hem);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}


	public int getM() {
		return m;
	}


	public void setM(int m) {
		this.m = m;
	}


	public double getHem() {
		return hem;
	}


	public void setHem(double hem) {
		this.hem = hem;
	}



	
	
	
	
	
}
