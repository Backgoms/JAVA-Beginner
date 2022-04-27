
public class Test3_04 {

	public static void main(String[] args) {
		//부호 연산자(단항 연산)
		//단항연산자 - 피연산자 수가 한개인 연산자
		int aaa1 = 1; 
		System.out.println(" aaa1 = " +aaa1);
		
		aaa1 = -aaa1; //부호를 반전 시킴
		System.out.println(" -aaa1 = " + aaa1);
		aaa1 = -aaa1; // -1로 저장되어있는 aaa1을 한번 더 - 연산자를 붙임
		System.out.println(" -aaa1(-1) = " + aaa1);
		
		int aaa2 = -2;
		aaa2 = +aaa2;
		System.out.println(" aaa2(-2) = " + aaa2);
	}
}
