
public class Test3_03 {

	public static void main(String[] args) {
		//연산자 우선순위
		int aaa1 = 1 + 2 * 3 + 4; //가로를 표시 안하더라도 연산사 우선순위로 계산됨
		System.out.println(" 1 + 2 X 3 + 4 = " + aaa1);
		
		int aaa2 = 1 + ( 2 * 3 ) + 4 ; //가독성이 좋도록 가로를 표시해줌
		System.out.println(" 1 + ( 2 X 3 ) + 4 = " + aaa2);
	}
}
