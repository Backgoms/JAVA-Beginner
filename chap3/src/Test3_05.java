
public class Test3_05 {

	public static void main(String[] args) {
		//단축 배정 연산자
		int aaa1 = 3;
		
		aaa1 = aaa1 +1;
		System.out.println("aaa1 + 1 = " + aaa1);
		aaa1 += 1; // 단축배정연산자, +=는 왼쪽에 숫자을 누적시킴
		System.out.println("aaa1 += 1 = " + aaa1);
		aaa1++; // 'aaa1 = aaa1 + 1;' , ' aaa1 += 1;' 과 같음, 무조건 1만 증가시킴
		System.out.println(" aaa1++ = " + aaa1);
		aaa1--; // 무조건 1이 감소
		System.out.println(" aaa1-- = " + aaa1);
	}
}
