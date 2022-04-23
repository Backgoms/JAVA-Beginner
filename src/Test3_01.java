
public class Test3_01 {

	public static void main(String[] args) {
		//산술 연산자..
		// + - * / %
		
		int aaa1 = 1 + 2; //대입연산자는 가장 마지막에 실행
		int aaa2 = aaa1 + 3;
		aaa2 = aaa2 + 4;
		
		int result3 = 3 - 1;
		
		int aaa3 =  4 * 3;
		
		int aaa4 = 1/3;
		System.out.println(aaa4);
		
		double aaa5 = 1/2;
		System.out.println(aaa5);
		
		double aaa6 = 1/2.0; //한쪽이라도 실수이면 실수 나누기를 함
		System.out.println(aaa6);
		
		double aaa7 = 1/(double)2; // 강제 타입캐스팅, 실수 나누기
		System.out.println(aaa7);
		
		int aaa8 = 3%2; //나머지 연산자, 생각외로 매우 중요 
		System.out.println(aaa8);
	}

}
