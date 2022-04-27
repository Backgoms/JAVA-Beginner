
public class test5_01 {

	public static void main(String[] args) {
		// 변수는 전부 stack 메모리에 들어감
		// int처럼 주황색이 있으면 기본타입, 주황색이 아니라면 전부 참조타입
		int a = 10; //int a-> a라는 메모리생성(RAM에)
		int b = 20;// int b-> b라는 메모리생성(RAM에)
		
		if(a > 0 ) { 
			int c = 40; //int c -> c라는 메모리생성(RAM에)
			//...
		}else {
			int d = 50;
			//...
		}
		// if문을 빠져나가면 c라는 메모리는 소멸(RAM에)-스택
		
		
	} //main를 빠저나갈 때 a b도 소멸 후 프로그램 종료 -스택
}