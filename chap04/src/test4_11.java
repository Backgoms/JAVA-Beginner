
public class test4_11 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구해보자
		/*int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i; //sum같에 i를 누적시킴
		} */
		
		//3의 배수가 아닌 값의 합만
		int sum = 0;
		for(int x = 1 ; x <= 100 ; x++) { //for문도 실행문이 한 줄만있을 경우 중괄호를 생략가능, for문뒤에는 절대 ;를 넣지 말기
			if(x%3==0) {
				continue;
			}
			sum += x;
		}
		System.out.println("총 합 : " + sum);
	}

}
