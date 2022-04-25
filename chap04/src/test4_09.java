
public class test4_09 {

	public static void main(String[] args) {
		//반복문 for문 - 고전적인 for문, 실질적으로 고전적인 for문은 잘 사용하지않음(자료구조 문제때문에)
		
		for(int x = 1 ; x < 10 ; x++) { //여기서 생성된 int x는 for문을 빠져나가면 소멸
			//(초기화 식(1) ; 조건식(2) ; 증감식(3)), 초기화식은 처음 한 번마 실행, 실행순서 1->2->3->2->-3->2->3 조건식이 false가 될때 까지 
			System.out.println(x);
		}
		for(int x = 1 ; x < 20 ; x++) { //이전 for문이 끝나면서 int x가 소멸되어 재선언 가능
			
		}
	}
}
