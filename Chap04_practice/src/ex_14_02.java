
public class ex_14_02 {

	public static void main(String[] args) {
		//탐욕적 알고리즘은 대부분의 경우 옳기는 하지만 항상 옳지는 않음.
		//만약 화폐종류가 500,400,100일 경우 동전의 갯수가 가장적게 할려면 탐욕적 알고리즘이 맞지 않음.
		// 탐욕적 알고리즘이 맞지 않으면 완전탐색이나 다른 알고리즘을 사용해야함
		int [] coins = {500,100,50,10};  
		
		int changeMoney = 1160;
		int count = 0;
		for( int i = 0 ; i < coins.length ; i++) {
			count += changeMoney/coins[i];
			changeMoney %= coins[i];
		}
		System.out.println(count);
	}
	

}
