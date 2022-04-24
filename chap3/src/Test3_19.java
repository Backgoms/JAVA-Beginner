
public class Test3_19 {

	public static void main(String[] args) {
		// 1부터 100사이 값 중 7과 8의 배수를 제외한 합을 구해보자
		
		int sum = 0;
		
		for(int i = 1; i <=100; i++){
			if( !(i%7 == 0 || i%8==0) ) { //(i%7!=0 && i%8!=0)도 같은 결과값
				sum += i;
			}
		}
		System.out.println(sum);
	
	
	}

}
