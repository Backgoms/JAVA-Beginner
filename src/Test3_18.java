
public class Test3_18 {

	public static void main(String[] args) {
		int score = 70;
		int attend = 80;
		int bongsa = 100;
		
		 // (attend >=80 && (score >=90 || bongsa ==100) 아래와 같은 조건 문
		if((score >= 90 && attend >=80) || (bongsa == 100 && attend >= 80)) {
			System.out.println("갓챠 획득");
		}else {
			System.out.println("걋챠 실패");
		}
		
	}

}
