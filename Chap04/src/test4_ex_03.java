
public class test4_ex_03 {
	public static void main(String [] args) {
		//구구단을 출력해보자
		int value = 0;
		for(int left = 2; left <= 9; left++) {
			System.out.println(left + "단");
			for(int right = 1; right <= 9; right++) {
				value = left *right;
				System.out.println(left + " X " + right + " = " + value);
			}
		}
	}
}
