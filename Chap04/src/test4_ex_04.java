
public class test4_ex_04 {

	public static void main(String[] args) {
		//구구단을 출력을 하되 6단과 7단을 제외하고 출력하자
		int value = 0;
		for(int left = 1; left <= 9; left++) {
			if(left%6 == 0 || left%7 == 0) {
				continue;
				}
			System.out.println(left + "단");
			for(int right =1 ; right <=9; right++) {
				value = left * right;
				System.out.println(left + " X " + right + " = " + value);
			}
		}

	}

}
