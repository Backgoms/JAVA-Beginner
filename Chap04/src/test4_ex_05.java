
public class test4_ex_05 {
	public static void main(String [] args) {
		//1부터 200까지 정수 중에 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int sum = 0;
		
		for(int i = 1; i <= 200; i++) {
			if(i%2 ==0 || i%3==0) continue;
			
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
