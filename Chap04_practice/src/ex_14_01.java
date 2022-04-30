import java.util.Scanner;

public class ex_14_01 {

	public static void main(String[] args) {
		//거스름돈 문제 :그리디 알고리즘(탐욕법)
		System.out.println("거슬러 줄 금액을 입력하세요>");
		Scanner scn = new Scanner(System.in);
		
		String inputValue = scn.nextLine();
		
		int count = 0;
		
		int changeMoney = Integer.parseInt(inputValue);
		
		while(changeMoney >= 500) {
			changeMoney -=500;
			count++;
		}
		while(changeMoney >= 100) {
			changeMoney -=100;
			count++;	
		}
		while(changeMoney >= 50) {
			changeMoney -=50;
			count++;
		}
		while(changeMoney >= 10) {
			changeMoney -=10;
			count++;
		}
		System.out.println("결과 : 거스름돈의 개수 : " + count);
	}

}
