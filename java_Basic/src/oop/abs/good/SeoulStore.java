package oop.abs.good;

public class SeoulStore extends HeadStore {
	
	@Override
	public void orderApple() {
		System.out.println("사과주스의 가격은 3000원 입니다.");
		
	}
	
	@Override
	public void orderBanana() {
		System.out.println("바나나주스의 가격은 3500원 입니다.");
		
	}
	
	@Override
	public void orderGrape() {
		System.out.println("사과주스의 가격은 2500원 입니다.");
		
	}

}
