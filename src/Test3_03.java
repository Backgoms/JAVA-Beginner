
public class Test3_03 {

	public static void main(String[] args) {
		//연산자 우선순위
		int aaa1 = 1 + (2 * 3) + 4;
		System.out.println(aaa1);
		
		int aaa2 = 1 +( 2 * (3 +4)); //가독성이 좋도록 가로를 표시해줌
		System.out.println(aaa2);
	}

}
