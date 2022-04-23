
public class Test2_12 {

	public static void main(String[] args) {
		//문자형(정수형) 변수... 사실상 대부분의 경우 쓸일이 없음
		//char는 한개의 문자만 넣을 수 있음
		//문자셋을 한국에서는 두가지 euc-kr과 UTF-8을 사용하는데 최근은 세계적으로 UTF-8을 사용
		String str = "배고파ㅏㅏㅏㅏ";

		char aaa1 = '배';
		char aaa2 = '고'; //고에 해당하는 정해진 숫자를 저장
		char aaa3 = 'A';
		char aaa4 = 68; //char는 숫자로 저장하기때문 정수를 입력해도 가능
		char aaa5 = 0x41; //16진수도 가능
		char aaa6 = 0b00100001; //2진수도 가능
		
		aaa3++; //char는 산술 연산이 가능하다
		aaa3++;
		aaa3++;
		
		System.out.println(aaa3); //숫자를 입력해도 68로 정의된 문자가 출력됨
		System.out.println(aaa3); //숫자를 입력해도 68로 정의된 문자가 출력됨
		System.out.println((int)aaa1);
		System.out.println((int)aaa5);
		System.out.println((int)aaa6);
	}

}
