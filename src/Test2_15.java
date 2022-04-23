
public class Test2_15 {

	public static void main(String[] args) {
		//타입 캐스팅
		// 강제 타입 캐스팅 - 논리적으로 맞는지 확신이 드는 경우에만 사용
		// 자동 타입 캐스팅 - 논리적으로 문제가 되지 않는 경우
		int a1 = 10;
		int a2 = a1; 
		
		int a3 = 5000;
//		byte a4 = a3; 타입이 다르면 저장되지 않음 / 문법오류 발생
		byte a4 = (byte)a3; //강제 타입캐스팅 int타입을 byte타입으로 강제로 저장 / 정보의 소실이 발생 할 수 있음 
		
		System.out.println(a4);
		
		byte a5 = 20;
//		int a6 = (int)a5; 강제 타입캐스팅도 사용가능
		int a6 = a5; //자동 타입캐스팅 / 타입이 맞지는 않으나 논리적으로 문제가 되지않아 가능 / byte(2byte)보다 int(4byte)가 크기때문에 소실이 없음
		
		char b1 = 10;
		int b2 = b1;
		
		int b3 = 10;
//		char b4 = b3; 
		
		char b5 = '냥'; //char는 냥에 해당하는 숫자를 저장함
		System.out.println((int)b5);
		
		double c1 = 19.23;
//		int c2 = c1; 실수에 정수를 넣는건 문제가 되지않음. 정수에 실수를 넣는 것은 안됨
		int c2 = (int)c1; //소수점을 자르기 위해 많이 사용
		System.out.println(c2); 
		
		boolean d1 = true;
//		int d2 = d1; 안됨
//		int d2 = (int)d1; 안됨
	}

}
