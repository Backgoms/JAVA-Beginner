
public class test4_04 {

	public static void main(String[] args) {
		// test4_03와 결과값이 같은 동일한 코드
		
		int value = 7;
		if(value > 10) {
			System.out.println("10보다 큽니다.");
		}else {
			if(value > 5) {
				System.out.println("10보다 크지 않고 5보다 크다.");
			}else {
				if(value >3) {
					System.out.println("10보다 크지않고 5보다 크지 않고 3보다 크다.");
				}else {
					System.out.println("이도저도 아닙니다.");
				}
			}
		}
	}

}
