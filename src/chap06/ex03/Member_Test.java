package chap06.ex03;

public class Member_Test {

	public static void main(String[] args) {
		// 같은 패키지 내에서는 import 없이 클래스를 사용 할 수 있다. 
		// 접근 제어자가 default 이상이어야 한다. 

		//1. 객체 생성 
		Member m1 = new Member(); 
		
		//2. 객체의 필드 접근 : <<< DB에 값을 불러와서 자바 객체에 필드의 값을 주입 
			// 입력 : setter  
		m1.setIdx(1);
		m1.setId("ID001");
		m1.setPw("1111");
		m1.setPhone("010-1111-1111");
		m1.setName("홍길동");
		m1.setYear(1998);
		m1.setMonth(8);
		m1.setDay(22);
		m1.setAddr("서울");
		
		//3. 필드의 값을 출력 : getter 
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
		System.out.println(m1.getPw());
		System.out.println(m1.getPhone());
		System.out.println(m1.getName());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getAddr());
		
		
		
		
		
	}

}
