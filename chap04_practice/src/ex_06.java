
public class ex_06 {

	public static void main(String[] args) {
		//구구단의 짝수 (2,4,6,8)단만 출력하는 프로그램을 작성화되.
		// 2단은 2X2까지, 4단은 4X4까지 6단은 6X6까지 8단 8X8까지
		// 출력하도록 구현자
		for(int l = 2 ; l<=8; l+=2) {
			System.out.println("");
			System.out.println(l + "단");
			for(int r = 1 ; r <= l ; r++) {
				int value = l * r;
				System.out.println( l + " X " + r + " = " + value);
			}
		}
	}
}