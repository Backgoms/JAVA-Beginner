
public class test4_08 {

	public static void main(String[] args) {
		// continue - 밑에 있는 코드를 더 이상 실행하지 않고 다시 반복문을 실행(탈출x)
		int value = 0;
		
		while(value < 100) {
			value++;

			if(value%3==0) {
				continue; 
			}
			System.out.println("value : " + value);
			
		}
	}

}
