
public class test4_03 {

	public static void main(String[] args) {
		//if - else if - else 문은 조건식의 순서가 매우 중요함,
		//순서대로 진행 후 true나오면 그 다음은 실행조차 하지 않음.
		int value = 7;
		
		if(value > 10 ) {//true이면 아래 실행문을 실행, false이면 else if로 넘어감
			System.out.println("10보다 크다.");
		}else if(value > 5) { //if문이 false여야 else if로 올 수 있음
			System.out.println("값은 5보다 크고 10보다 작다"); 
		}else if(value >3 ) { 
			System.out.println("값은 3보다 크고 5보다 작다");
		}else {
			System.out.println("이도 저도 아닌경우 입니다.");
		}
	}

}
