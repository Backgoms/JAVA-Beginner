
public class test5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[3];
		arr1[2] = 50;
		
		if(arr1[0] == 0){
			arr1 = new int[3]; //arr1 에 새로운 값을 넣음
			arr1[1] = 30;
		} //삭제되는 변수는 없음 arr1은 밖에서 선언된 참조변수
		System.out.println(arr1[2]);
	}

}
