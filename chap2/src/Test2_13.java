
public class Test2_13 {

	public static void main(String[] args) {
		//실수
		//정밀도가 존재, 근사값 => 정말 세밀하게 연산해야된다하면 정수로 계산 후 다시 나눠야함
		float aaa1 = 3.33F; //거의 안씀
		double aaa2 = 3.333; //가장 많이 사용
		
		aaa2 = 0.00000007;
		System.out.println(aaa2);
		
		aaa2 = 7e-7;
		System.out.println(aaa2);
		
		float var1 = 0.1234567890123456789F; //문법적으로 문제가 없으나 범위의 한계로 근사값을 출력
		double var2 = 0.1234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
	}

}
