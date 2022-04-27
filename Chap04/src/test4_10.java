
public class test4_10 {

	public static void main(String[] args) {
		//for 가로( ; ; )는문법적으로 비워도 문제가 되지않음, 무한반복이 되어짐
		int x = 0;
		for( ; x < 10 ; ) { //위에서 선언 했을 경우 초기화식을 공백으로 되도됨, 증감문은 for안쪽으로 넣을 경우 공백으로 가능 
			System.out.println(x);
			x++;
		}
	}
}
