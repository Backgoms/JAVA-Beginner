
public class Test3_13 {

	public static void main(String[] args) {
		//정밀도 double
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
	
		double result = apple - number * pieceUnit;
		System.out.println(result); //정밀도가 떨어짐
	}

}
