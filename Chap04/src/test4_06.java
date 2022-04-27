
public class test4_06 {

	public static void main(String[] args) {
		//반복문 - while문
		//while문도  실행문을 한 줄만 사용할 경우 중괄호 생략가능
		//무한 반복되는 것을 주의해야함
		int value = 1;
		
		while(value < 10) { //true와 false만 저장됨, 한번이라도 false가 되면 while문을 빠져나감
			System.out.println("안녕하세요." + value);
			value += 2;
		}
	}

}
