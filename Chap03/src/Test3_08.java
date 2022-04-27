
public class Test3_08 {

	public static void main(String[] args) {
		//단축 배정 연산자
		int aaa1 = 0;
		System.out.println("aaa1 = " + aaa1);
		aaa1 = aaa1 + 3;
		System.out.println(" aaa1 = aaa1 + 3 : " + aaa1);
		aaa1 = 0;
		aaa1 += 3; // 'aaa1 = aaa1 + 3' 과 같은 코드, 많이 사용함
		System.out.println(" aaa1 += 3 : " + aaa1);
		
		aaa1 = 0;
		aaa1 = aaa1 -2;
		System.out.println(" aaa1 = aaa1 - 2 : " + aaa1);
		aaa1 = 0;
		aaa1 -= 2;
		System.out.println(" aaa1 -= 2 : " + aaa1);
		
		aaa1 = 1;
		System.out.println("aaa1 = " + aaa1);
		aaa1 = aaa1 * 4;
		System.out.println(" aaa1 = aaa1 * 4 : " + aaa1);
		aaa1 = 1;
		aaa1 *= 4;
		System.out.println(" aaa1 = aaa *= 4 : " + aaa1);
		
		aaa1 = 4;
		System.out.println("aaa1 = " + aaa1);
		aaa1 = aaa1 / 2;
		System.out.println(" aaa1 = aaa1 / 2 : " + aaa1);
		aaa1 = 4;
		aaa1 /= 2;
		System.out.println(" aaa1 /= 2 : " + aaa1);
		
		aaa1 = 6;
		System.out.println("aaa1 = " + aaa1);
		aaa1 = aaa1 % 5;
		System.out.println(" aaa1 = aaa % 5 : " + aaa1);
		aaa1 = 6;
		aaa1 %= 5;
		System.out.println(" aaa1 %= : " + aaa1);
	}
}
