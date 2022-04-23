
public class Test3_20 {

	public static void main(String[] args) {
		//구구단 출력
		
		for(int left = 2; left <=9; left++) {
			if(!(left%5==0 || left%6==0)) {
				System.out.println(left + "단");
				
				for(int right = 1; right <= 9; right++) {
					int result = left * right;
					System.out.println(left + " X " + right + " = " + result);
				}
			}
		}
		
/*		for(int l =2; l <= 9; l++) {
			for(int r = 1; r <=9; r++) {
				int sum = l*r;
				System.out.println(l + " x " + r + " = " + sum);
			}
			System.out.println("");
		}p*/

	}

}
