package lombok_test;

public class Member_Test {

	public static void main(String[] args) {

		Member m1 = new Member() ; 
		
		// Back-End : DataBase 의 레코드를 가져와서 setter 호출해서 필드의 값 입력 
		m1.setIdx(1);
		m1.setName("홍길동");
		m1.setEmail("aaa@aaa.com");
		m1.setPhone("010-1111-1111");
		m1.setAge(30);
		m1.setWeight(77.7);
		
		// Front End 에서 DTO에 입력 된 값을 HTML 로 랜더링 해서 출력 해줌 
		System.out.println(m1);
		
		System.out.println("---------getter 로 직접 출력 --------------");
		System.out.println(m1.getIdx());
		System.out.println(m1.getName());
		System.out.println(m1.getEmail());
		System.out.println(m1.getAge());
		System.out.println(m1.getWeight());
		System.out.println(m1.getPhone());
		
	}

}
