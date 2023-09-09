package aop.test;

public class AopTest {
	/*
	 * 어플리케이션 로직은 '핵심' 기능과 '부가' 기능으로 나눌 수 있다.
	 * 부가 기능은 핵심 기능을 보조하기 위해 존재한다.
	 */

	public static void main(String[] args) {
		//소스 추가
		System.out.println("소스 추가");
		
		//성능 검사(시간 측정)
		long beforeTime = System.currentTimeMillis();
        
		//비즈니스 로직
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
		    for (int j = 0; j < 50000; j++) {
		        sum += i*j;
		    }
		}
		
		//로깅
		System.out.println(sum);
		
		//성능 검사(시간 측정)
		long afterTime = System.currentTimeMillis() ;
		long secDiffTime = (afterTime - beforeTime)/1000;
		
		//로깅
		System.out.printf("비즈니스 로직 실행시간: %d 밀리초\n", secDiffTime);	
	}
}
