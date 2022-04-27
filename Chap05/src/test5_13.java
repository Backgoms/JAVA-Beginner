
public class test5_13 {

	public static void main(String[] args) {
		//[20,30,10,50,70,90,80,40,60]
		//합을 구해보자
		
		int [] scores = {20,30,10,50,70,90,80,40,60};
		int sum = 0;
		for(int i = 0; i <scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합 :" + sum);
		System.out.println("평균: " + sum/(double)scores.length);
	}

}
