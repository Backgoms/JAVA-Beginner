
public class Test3_16 {

	public static void main(String[] args) {
		//논리 연산자 ! , &&, ||
		boolean test = true;
		test = !test; //단항연산자
		
		//and 논리 곱 && : 피연산자 둘다 true일 때만 true , 나머지는 false
		// 무엇무엇 이고 무엇무엇인 경우
		test = false && true;
		
		//or 논리 합 || : 피연산자 둘다 false 일때만 false, 나머지는 true
		// 무엇무엇 이거나 혹은 무엇무엇 인 경우
		test = false || true;
		
	}

}
