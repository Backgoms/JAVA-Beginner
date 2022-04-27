
public class test5_14 {

	public static void main(String[] args) {
		//[20,30,10,50,70,90,80,40,60]
		// 중앙값을 구하시오
		
		int [] scores = {20,30,10,50,70,90,80,40,60};
		
		//중앙값은 정렬해서 가운데 값을 구하면됨.
		//정렬
		for(int x = 0; x < scores.length-1; x++) {
			
			for(int y = x+1 ; y < scores.length; y++) {
				if(scores[x] > scores[y]) {
					int temp = scores[x];
					scores[x] = scores[y];
					scores[y] = temp;
				}
			}
			for(int i = 0 ; i <scores.length ; i++) {
//				System.out.println(scores[i]);
			}
		}
		System.out.println("중앙값 : " + scores[scores.length/2]);
	}
}
