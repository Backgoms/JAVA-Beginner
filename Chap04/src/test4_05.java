
public class test4_05 {

	public static void main(String[] args) {
		//switch case 문
		//if문으로 완벽하게 대체할 수 있음.
		//많이 사용하지 않음
		//변수가 일치하면 그 위치 이루 코드를 전부 실행하는 원리
		//처음 공부하는 사람은 if문을 확실하게 공부
		//switch case문을 사용하는 경우: break를 사용하지 않아도되는 경우, if문이 너무 복잡하여 switch case문으로 간편하게 할 수 있을 경우(한눈에 들어오는 경우)
		int value = 3;
		
		switch(value) { //조건문이 조건식(true or false)이 아니고 변수가 들어감
		case 1:
			System.out.println("1입니다.");
			break; //switch문을 탈출함
		case 2: 
			System.out.println("2입니다.");
			break;
		case 3: 
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default://else와 같음 , 마지막에 경우는 break문을 넣지 않음
			System.out.println("그 외의 경우입니다.");
		}
	}

}
