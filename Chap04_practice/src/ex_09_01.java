
public class ex_09_01 {

	public static void main(String[] args) {
		// 2~100사이 소수
		// 에라토스테네스의 체법

		int [] numbers = new int[200];
		
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i + 2;
		}
		
		
		for(int i = 0 ; i <numbers.length ; i++) {
			if(numbers[i] != -1) {
				System.out.println(numbers[i] + "는 소수 입니다.");
				
				for(int x = i +1 ; x < numbers.length ; x++) {
					if(numbers[x]%numbers[i] == 0) {
						numbers[x] = -1;
					}
				}
			}
		}
	}

}
