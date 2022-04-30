import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		// 당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원,
		// 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다. 손님에게 거슬러 주어야 
		// 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하세요. 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
	    // [출처] 4/26 실습 문제|작성자 s001lec
		System.out.print("거슬러줘야하는 금액을 적으세요>");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m10 = 10;
		int m50 = 50;
		int m100 = 100;
		int m500 = 500;
		int count = 0;

		while (n != 0) {
			if (n / m500 != 0) {
				count = count + (n / m500);
				n = n - (n / m500 * 500);
			} else if (n / m100 != 0) {
				count += n / m100;
				n = n - (n / m100 * 100);
			} else if (n / m50 != 0) {
				count += n / m50;
				n = n - (n / m50 * 50);
			} else if (n / m10 != 0) {
				count += n / m10;
				n = n - (n / m10 * 10);
			}
		}
		System.out.println(count);
	}

}
