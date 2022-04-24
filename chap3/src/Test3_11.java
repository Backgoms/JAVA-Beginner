
public class Test3_11 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		//Println을 통해 원하는 글을 출력하는 방법
		System.out.println("println을 이용");
		System.out.println(a +" + " +b +" = " +(a+b)); 
		//원하는 글을 출력하기 위해 " "를 사용하여 안에 내용작성, " "외 변수를 붙이려면 + 변수명 
		System.out.println("5 + 3 = 8");
		System.out.println( a + " 더하기 " + b + "은 " + (a+b) + " 입니다.");
		
		//문자열 연산을 통해 글 출력하는 방법
		String str = "";
		str += a;
		str += " + ";
		str += b;
		str += " = ";
		str += a + b;
		System.out.println("");
		System.out.println("문자열 연산을 이용");
		System.out.println(str);
	}
}
