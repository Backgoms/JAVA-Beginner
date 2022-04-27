
public class ex_02 {

	public static void main(String[] args) {
		// for문 이용해서 1부터 100까지 출력하고 난 다음에,
		// 3의 배수만 더하는 코드를 작성하자
		
		int sum = 0;
		
		for(int i = 1 ; i <= 1000 ; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
