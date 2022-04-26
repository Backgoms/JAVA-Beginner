
public class ex_07 {

	public static void main(String[] args) {
		//피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 
		//다음 수를 만들어 나가는 수열이다. 
		//예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 
		//그 다음 수는 1과 2를 더해서 3이 되어서 
		//1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
		//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 
		//계산하는 프로그램을 완성하시오.
		int i = 1;
		int r = 1;
		System.out.println(i);
		System.out.println(r);

		int sum = 0;
		int x = 1;
		int s = 2;
		
		for(i = 1 ; i <= 10 ; i++) {
			sum = x + s;
			System.out.println(i+ "번째 = " + sum);
				s = sum;
				x = s - x;
		}
		System.out.println("10번 째 수는 " +sum);
	}
}

/*
int left = 1;
int right = 1;

for(int x = 1; x < 100 ; x ++){
	int sum = left +right;
	
	left = right ;
	right = sum;
	}
	
	System.out.println(left);
*/
