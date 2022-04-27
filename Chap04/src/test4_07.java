
public class test4_07 {
	public static void main(String [] args) {
		//break문을 사용하면 언제 반복문을 탈출할지 명확하게 보임
		int value = 1;
		
		while(true) {
			System.out.println("value : " + value);
			
			value++;
			
			if(value > 10) {
				break; //탈출
			}
		}
	}
}
