package lombok_test;

import lombok.Data;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Member {
	
	// 롬북이 잘 작동 되는지 Test 
	// DTO (VO) : 실제 테이블에 컬럼에 매핑되는 객체    <== LOMBOK은 DTO 에서 사용함. 
	//       - 필드의 값을 전달 해 주는 전달자 역활
	//       - DB의 값을 임시로 저장해서 client 에게 전달 , client 의 값을 받아서 임시로 저장해서 DAO 
	// DAO : DataBase 와 직접 연결된 Java 객체 : SQL Query 작성 
	//        client ===> DTO ==> DAO ===> DataBase 
	
	// LOMBOK 에서 사용되는 어노테이션  
	/*
	 		@Getter : 필드명에 대한 getter 메소드가 자동으로 생성됨 : 필드의 정보를 출력
	 		@Setter : 필드명에 대한 setter 메소드가 자동으로 생성됨 : 필드의 값을 인풋 
	 		@toString : 객체를 출력시 필드의 내용을 출력 
	 		@NoArgsConstructor : 기본 생성자를 만들어줌. 
	 		@AllArgsConstructor : 모들 필드에 인풋 값을 받는 생서자  
	 		@Data  : @Getter, @Setter, @toString , @NoArgsConstructor
	 		
	 */
	
	
	private int idx ; 
	private String name ; 
	private String email ; 
	private String phone ; 
	private double weight ; 
	private int age ; 
	
	
	

}
