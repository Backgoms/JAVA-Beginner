
public class Test3_07 {

	public static void main(String[] args) {
		int aaa1 = 3;
		/* aaa1++;
		int result = aaa1; 일반적으로 짜는 코드스타일*/
		
		int result = aaa1++; //result에는 3이 먼저 저장 후 코드가 진행되면서 1추가됨
		
		System.out.println(result); // 3
		System.out.println(aaa1); //4
		
		aaa1 = 3;
		result = ++aaa1; // aaa1 먼저 1을 추가하고 result에 저장
		System.out.println(result);
		System.out.println(aaa1);
	}

}
