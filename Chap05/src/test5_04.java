
public class test5_04 {

	public static void main(String[] args) {
		//new는 메모리를 생성하겠다는 키워드(heap메모리에)
		String str1 = new String("안녕하세요"); //new는 heap메모리에 새로운 공간을 만듦
		String str2 = new String("안녕하세요");
		
		System.out.println(str1);
		System.out.println(str2);
		//참조 주소 값 비교...중요
		if(str1 == str2) { //stack 메모리에 변수 내에 저장되어있는 값을 비교
			System.out.println("같다");
		}else
			System.out.println("다르다");
		
		//문자열 비교 ... 중요, 문자ㅏ 비교 할 때는 equals를 사용
		if(str1.equals(str2)){
			System.out.println("두 문자열 내용이 같다");
		}else {
			System.out.println("두 문자열 내용이 다르다");
		}
	}

}
