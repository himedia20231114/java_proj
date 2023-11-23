package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {
		/*
		 	클래스명 : 반드시 첫자는 영문 대문자 
		 	변수명   : 소문자로 시작 (권장사항) , 낙타형식으로 이름을 사용 
		 	상수명   : 대문자 로만 (권장사항) 
		 	
		 		특수문자 : _ , & 만 사용 가능 
		 		숫자가 처음에 오면 오류 발생, 숫자는 사용 가능 
		 */
		
		/*
		  	 제어문 : 프로그램의 순서를 바꾸어서 처리함.  
		  	 	if  문       <== break; 가 내장  , 
		  	 	switch 문    <== break;  (블락을 빠져 나올때 사용함. ) 
		  	 	
		  	 if -- 3가지 구문 
		  	 
		  	 1.  조건이 1개일때  
		  	 
		  	      if (조건) {
		  	          조건이 true 일때 실행문 ; 
		  	      }else {
		  	          조건이 false 일때 실행문;
		  	      }
		  	      
		  	  2. 조건이 여러개일때 
		  	      
		  	      if (조건1) {
		  	      		조건1이 일때 ; 
		  	      } else if (조건2) {
		  	      		조건2이 일때 ; 
		  	      } else if (조건3) {
		  	      		조건3이 일때 ; 
		  	      } else if (조건4) {
		  	      		조건4이 일때 ; 
		  	      } else {
		  	      		위의 모든 조건이 만족되지 않을때 작동 
		  	      } 
		  	     
		  	    3. 한 라인 으로 사용 
		  	    	if (조건) { 조건이 true 일때 } 
		  	    	if (조건)  조건이 true 일때  ; 	  	 	
		 
		 */
		
		int a = 10 ; 
		
		if ( a < 30) {
			System.out.println(" 참입니다. ");	// 조건이 참이면 실행
		}else {
			System.out.println(" 거짓입니다. ");	// 조건이 거짓이면 실행 
		}
		
		System.out.println("프로그램 종료입니다. ");
		
		

	}

}
