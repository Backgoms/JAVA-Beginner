
public class Test3_08 {

	public static void main(String[] args) {
		//단축 배정 연산자
		int aaa1 = 0;
		
		aaa1 = aaa1 + 3;
		System.out.println(aaa1);
		aaa1 += 3; // 'aaa1 = aaa1+ 1' 과 같은 코드, 많이 사용함
		System.out.println(aaa1);
		
		aaa1 = aaa1 -2;
		System.out.println(aaa1);
		aaa1 -= 2;
		System.out.println(aaa1);
		
		aaa1 = aaa1 * 4;
		System.out.println(aaa1);
		aaa1 *= 4;
		System.out.println(aaa1);
		
		aaa1 = aaa1 / 2;
		System.out.println(aaa1);
		aaa1 /= 2;
		System.out.println(aaa1);
		
		aaa1 = aaa1 % 5;
		System.out.println(aaa1);
		aaa1 %= 5;
		System.out.println(aaa1);
	}

}
