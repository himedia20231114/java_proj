package lab.chap10.fruit;

public class Strawberry extends Fruit {  // 딸기 

	Strawberry(){}
	Strawberry(String name, int cnt, int price) {
		//super();
		super.name = name; 
		super.cnt = cnt; 
		super.price = price; 		
	}
	
	@Override
	void totalPrice() {		// 코드 작성 : cnt + price
		// 출력 : " 000 의 전제 가격은 : 000 입니다. 
		System.out.println(super.name + " 의 전체 가격은 : " + (super.cnt * super.price));
	}
}
