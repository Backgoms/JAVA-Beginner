
public class Test3_01 {

	public static void main(String[] args) {
		//산술 연산자..
		// + - * / %
		
		int addition = 1 + 2; //덧셈 연산자, 대입연산자는 가장 마지막에 실행
		System. out.println("1 + 2 = " + addition ); // 덧셈 연산자
		
		int addition2 = addition + 3; // 변수에도 연산 가능
		System.out.println("addition + 3 = " + addition); 
		
		int subtraction = 3 - 1; // 뺄셈 연산자
		System.out.println("3 - 1 = " + subtraction); 
		
		int multiplication =  4 * 3; // 곱셈 연사자
		System.out.println("4 X 3 = " + multiplication); 
		
		int division = 1/3; // 나누기 연산자. 정확한 답이 나오지 않음
		System.out.println("1 / 3 = " + division); 
		
		double division2 = 1/2; //double 타입을 사용해도 정확한 답이 나오지 않음
		System.out.println("1 / 2 = " + division2);
		
		double division3 = 1/2.0; //한쪽이라도 실수이면 실수 나누기를 함
		System.out.println("1 / 2.0 = " + division3 );
		
		double division4 = 1/(double)2; // 강제 타입캐스팅, 실수 나누기
		System.out.println("1 / (double)2 = " + division4);
		
		int remainder = 3%2; //나머지 연산자, 생각외로 매우 중요 
		System.out.println("3 % 2 = " + remainder);
	}
}
