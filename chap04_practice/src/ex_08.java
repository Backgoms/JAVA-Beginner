
public class ex_08 {

	public static void main(String[] args) {
		//863은 소수 인가?
		int i = 863;
		
	
		for(int n = 2 ; n < i; n++) {
			if(i%n==0){
				System.out.println("863은 소수가 아님." + n);
				break;
			}
			
		}
	}
}
// 소수란 1과 자기자신 이외의 자연수로 나누어지지 않는 수
/*
	int number = 863;
	
	boolean isPrime = true; //로직에 따라 true 또는 false를 잘 정해야함
							//스위치 변수
	for(int x = 2; x <= math.sqrt(number) ; x++){ //number의 루트
		if(number%x== 0){
			isPrime = false;
			break;
		}
		
	if(isPrime) { //한번이라도 나눠지면 isPrime은 false로 변경됨
		System.out.println("소수입니다.");
	}else {
		System.out.println("소수 아닙니다.");
	}
*/