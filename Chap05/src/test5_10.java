
public class test5_10 {

	public static void main(String[] args) {

		int [] arr1 = new int[3]; //가장 일반적인 방법, 초기값으로 모두 0이 세팅됨
		
		int [] arr2 = {30,50,0,70}; //배열 초기화 코드, 안쪽에 있는 수의 갯수만큼 크기가 만들어짐
		
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}

}
