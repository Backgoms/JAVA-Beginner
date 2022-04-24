
public class Test3_14 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		
		int temp = totalPiece - number;
		
		double result = temp/10.0;
		
		System.out.println(result); //10을 곱하여 올린 후(int타입) 다시 10으로 나눔 
	}

}
