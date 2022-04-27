
public class test5_12 {

	public static void main(String[] args) {
		//[20,30,10,50,70,90,80,40,60]
		//위와 같은 성적이 존재 할 때 가장 높은 점수를 구하세요.
		
		//int [] scores = new int[9];
		
		//scores[] = 20 ...
		
		int [] scores = {20,30,10,50,70,90,80,40,60};
		
		int max = 0;
		for(int i = 0 ; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("최대값: " + max);
	}

}
