
public class ex_12 {

	public static void main(String[] args) {
		// 1~10000 사이에 8이 몇번 나오는가?
		int count = 0;
		
		for( int i = 1 ; i <= 10000; i++) {
			for(int x = 10; x <=10000; x*=10) {
				int num = (i%x)/(x/10);
					if(num == 8) {
						count += 1; 
					}
			}
		}
		System.out.println(count);
	}

}
