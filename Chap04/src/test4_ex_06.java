
public class test4_ex_06 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상 되는지 구하시오
		int sum = 0;
		int i = 1;
		for(i = 1; sum < 100; i++) {
			if(i%2 ==1) {
				if(sum >=100) {
					break;
				}
				sum += i;
			}else if(i%2 == 0) {
				sum += -i;
			}
			System.out.println(sum +" "+ i);
		}
	}
}	

