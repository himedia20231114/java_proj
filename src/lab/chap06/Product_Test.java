package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {

		//1. Product 객체 4개 생성 
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		//2. Setter를 사용해서 객체의 필드의 값을 주입
		p1.setIdx(1);
		p1.setProName("화장품");
		p1.setProColor("초록");
		p1.setQty(100);
		p1.setYear(2000);

		p2.setIdx(2);
		p2.setProName("사과");
		p2.setProColor("빨강");
		p2.setQty(500);
		p2.setYear(2023);
		
		p3.setIdx(3);
		p3.setProName("컴퓨터");
		p3.setProColor("검은색");
		p3.setQty(50);
		p3.setYear(2022);
		
		p4.setIdx(4);
		p4.setProName("모니터");
		p4.setProColor("흰색");
		p4.setQty(70);
		p4.setYear(2020);
		
		//3. 배열 arr , 방크기는 10개 : 0 ~ 9, 각 방에 4의 객체를 배열 방에 넣음.
		
		Product[] arr = new Product[10]; 
		
		arr[0] = p1; 
		arr[1] = p2; 
		arr[2] = p3; 
		arr[3] = p4; 
		
		//4. 배열의 값을 끄집어내서 Product 변수 p 에 담고 출력 : for 
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] != null) {
				Product p = arr[i]; 
				System.out.println(p); 		
			}
			
		}
		
		
		
	}

}
