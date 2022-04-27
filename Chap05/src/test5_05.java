
public class test5_05 {

	public static void main(String[] args) {
		//배열 - 같은 타입을 순서가 있는 구조로 저장하는 자료구조
		//반복문하고 결합이 좋음
		
		//배열의 선언
		//복수명명법은 복수형태이여야한다.
		int [] scores = new int[4];  // int타입의 배열이고 참조타입의 변수인scores 선언
									 //new-> heap메모리에 메모리를 생성을 하고 scores에 주소값 반환
								     //[4] -> 4개의 int값을 담을 수 있는
		
		//배열 메모리에 접근 [], index조합, index는 0부터 시작한다.
		scores[0] = 70; //scores참조변수에 접근해서 0번째에 70이라는 값을 넣겠다. //접근 연산자
		scores[2] = 80;
		//heap메모리는 생성하면 내용을 입력하지 않더라도 초기값이 세팅이되어있음
		
		for(int i = 0 ; i < scores.length ; i++) { //scores.length->배열의 범위까지
			System.out.println(scores[i]);
		}
		
		
		
		
		/*int score1 = 40;
		int score2 = 30;
		int score3 = 70;
		int score4 = 80;
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);*/
	}

}
