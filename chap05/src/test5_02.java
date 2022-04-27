
public class test5_02 {

	public static void main(String[] args) {
		//기본타입, 참조타입
		//기본타입을 제외한 다른 타입은 전부 참조타입
		//JVM는 메모리공간을 stack과 heap으로 나눔
		//주황색 변수는 전부 stack,
		//참조타입은 stack메모리에 메모리의 주소(4byte)를 값을 저장함, heap영억 어딘가에 저장되어있는 주소를 stack메모리에 그 주소값을 
		int a  = 10; //기본타입
		String b = "안녕하세여"; //참조타입
		Integer c = 20; //참조타입 20은 heap메모리 어딘가에 생성되어 그  생성된 주소를 stack메모리에 c 에 주소를 저장함
	}

}
