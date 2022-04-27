
public class Test3_02 {

	public static void main(String[] args) {
		//산술 연산시 신경 써야될 점
		byte a1 = 3;
		byte a2 = 5;
//		byte a3 = // a1 + a2; 산술연산자가 결과를 int로 출력하기 때문에 a3에 저장할 수 없음
		byte a3 = (byte)(a1+a2); //a1,a2는 이미 바이트 이기때문에 산술연산자까지 묶어 (byte)강제 캐스팅
	}

}
