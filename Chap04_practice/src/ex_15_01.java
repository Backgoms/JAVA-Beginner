import java.util.Scanner;

public class ex_15_01 {

	public static void main(String[] args) {
		// 탐욕적 알고리즘(그리디 알고리즘)
		Scanner scn = new Scanner(System.in);
		
		System.out.println("N K의 값을 입력하세요.");
		String input = scn.nextLine();
		String [] values = input.split(" ");
		
		int n = Integer.parseInt(values[0]);
		int k = Integer.parseInt(values[1]);
		
		int count = 0;
		
		while(n != 1) {
			if(n%k==0) n/=k;
			else n -= 1;
			
			count++;
		}
		
		System.out.println(count);
	}

}
