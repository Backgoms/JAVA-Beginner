
public class test5_07 {

	public static void main(String[] args) {

		int [] arr = new int[5];
		arr[3] = 70;
		arr[2] = 30;
		
		if(arr[0] == 0){
			int [] list = new int [3];
			list[0] = 80;
			System.out.println(list[0]);
		} //if문을 나가면 list참조변수 소멸 -stack에서
		  //heap메모리와 연결되어잇어 참보변수가 제거되어도 heap로 연결 불가
		  //가뷔지컬렉터가 주기적으로 heap메모리를 확인 후 참조변수가 연결되어있지 않으면 삭제
		
	}

}
