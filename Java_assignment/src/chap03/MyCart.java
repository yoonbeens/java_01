package chap03;

public class MyCart {

	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열.
	private int i = 0; //cart안에 있는 상품의 개수를 알려주는 변수.
	
	//객체 생성 시 money를 받아서 초기화.
	public MyCart(int money) {
		this.money = money;
	}
	
	
   /*
    - public void buy(모든 상품을 전달할 수 있는 매개변수)
    
    - 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족"
     출력후 메서드 강제 종료.
    - 가진 돈이 충분하면 물건의 가격을 money에서 빼고 
      add(상품)메서드 호출.
    */
	
	
	public void buy(Product p) {
		if()
		if(this.money<money) {
			System.out.println("금액부족");
			return;
		} else {
			money -= this.money;
			add();
		}
	}
	
	/*
    - private void add(모든 상품을 받을 수 있도록 선언)
    
    - 매개변수로 전달된 상품을 장바구니에 담는다.
     상품이 추가될 때 마다 i의 값을 하나씩 올린다.
    
    - 만약 i의 값이 장바구니의 크기보다 같거나 크다면
     기존의 장바구니보다 크기가 * 2 큰 배열을 생성.
     기존의 장바구니의 값을 새로운 배열에 복사.
     새로운 장바구니의 주소값을 기존의 장바구니와 바꿉니다.

    - 모든 로직이 완료되면 info() 메서드를 호출합니다.
    */
	Cart2[] = new Cart[2];
	
	private void add() {
		for(int j=0; j<cart.length; j++) {
			if(this.cart.length<cart.length) {				
				i++;
			}
		}
		
		
		
	}
	
	
	/*
    - public void info()
    
    - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다.
    - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력해야 합니다.
    - 남은 금액을 출력해야 합니다.
    
    - MyCart 선언이 완료되었다면 MainClass에서 buy메서드를 호출해 봅니다.
    */
	
	public void productInfo() {
		for(int j=0; j<cart.length; j++) {
			cart[j].Info();
		}
	}

	
	
	

	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public Product[] getCart() {
		return cart;
	}


	public void setCart(Product[] cart) {
		this.cart = cart;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}
	
	
	
}
