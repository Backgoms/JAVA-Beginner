
public class test4_01 {

	public static void main(String[] args) {
		//if문 문법, 두가지로만 나눠질 경우 if문을 많이 사용
		
		int value1 = 7;
		
		if(value1 > 10) { //true 또는 false값을 받음, true이면 아래 실행문을 실행
			//조건이 성립되는 실행되는 실행문부분
			System.out.println("value는 7보다 큽니다."); // 조건문 결과 : true
			System.out.println("!!!!!"); //if문안에 여러 코드를 작성 가능
		}
		
		if(value1 == 7) 
		//중괄호를 빼는 경우는 특정한 경우만 가능, 실행문이 단 한줄 일 경우에만 가능 
			System.out.println("value는 7입니다.");

		//중괄호는 빼고 코드를 짜는 경우
		if(value1 ==7) System.out.println("value는 7입니다.");
		
		
		System.out.println("종료"); //조건문 결과 : false
	}
}
