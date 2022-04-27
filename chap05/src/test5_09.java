
public class test5_09 {

	public static void main(String[] args) {
		//모든 참조변수는 null 값을 대입할 수 있다.
		//참조변수가 아닌 기본변수는 null값 불가
		//null : 가르키는 주소가 없음을 나타내는 값(중요한 값), 프로그래밍 용도로 많이 쓰임
		
		//int a =null; 불가
		String str1 = null;
		int [] arr2 = null;
		
		arr2[0] = 30; //문법으로는 문제없으나 NullPointerException 발생
	}

}
