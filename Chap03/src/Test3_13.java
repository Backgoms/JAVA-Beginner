
public class Test3_13 {

	public static void main(String[] args) {
		//double
		
		
		int apple = 1;
		System.out.println("apple = " + apple);
		double pieceUnit = 0.1;
		System.out.println("pieceUnit = " + pieceUnit);
		int member = 7;
		System.out.println("member = "+ member);
		System.out.println("실수로 바로 계산시");
		double result = apple - member * pieceUnit; //실수로 계산시 정밀도가 떨어짐
		System.out.println(" apple - member - pieceUnit = " + result);
		
		//정확도를 올리는 방법
		System.out.println("");
		System.out.println("정확도를 올리는 방법");
		int totalPiece = apple * 10;
		System.out.println("totalpiece = apple * 10 : " + totalPiece);
		int temp = totalPiece - member;
		System.out.println("tem = totalpiece - member : " + temp);
		double result1 = temp/10.0; //정수형태로 계산 후 소수점을 반영
		System.out.println(" temp / 10.0 = " + result1); 
	}
}
