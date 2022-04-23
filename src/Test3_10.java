
public class Test3_10 {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		int a1 = 10;
		int a2 = 20;
		int a3 = 3;
		
		String result1 = str1 +a1; //피연산자 중 한 쪽이라도 문자열이 있다면 다른 한 쪽을 문자열로 치환
		System.out.println(result1);
		
		String result2 = str1 +a1 + a2; // 앞에 부터 연산함 ,(str1 + a1) + a2 순으로 연산, 우선순위를 변경시키고 싶으면 가로를 사용
		System.out.println(result2);

		String result3 = str1 + a1 + a2 * a3; //곱샘 연산 후 산술연산진행
	
	}

}
