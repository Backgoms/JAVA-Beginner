
public class test5_06 {

	public static void main(String[] args) {
		//배열은 생성 할 때 크기를 무조건 지정해야된다.
		boolean [] arr = new boolean[5]; //초기값은 가장 부정적인 값이 저장 , 숫자 = 0 , 참조 = null, 논리 = false
		
		arr[0] = true;
		arr[1] = false;
		arr[4] = true;
//		arr[50] = false; //문법적으로는 오류가 나지 않음. 실행시 문제 발생, index out of bounds

		
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
