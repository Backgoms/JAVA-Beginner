
public class ex_05 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+..(1+2+3+...+10)의 결과를
		//계산하시오
		int i = 1;
		int r = 0;
		int sum = 0;
		for( i = 1; i <=10 ; i++) {
			sum = sum + i;
			r += sum ;
			}
		System.out.println(r);
	}
}
/*
문제의 의도를 파악하여 푼 방법
int sum = 0;

for(int outer = 1 ; outer <= 10 ; outer++){
	for(int inner = 1; inner <= outer ; inner++){
		sum += inner;
	}
}
*/

// 다른 방법
/*
int tempSum = 0;
int sum = 0;

for(int x = 1; x <= 10; x++){
	tempSum += x;
	sum += tempSum;
}
System.out.println(sum);
*/

/*또 다른 방법
int sum = 0;
for(int x = 1 ; x <= 10 ; x++){
	sum += x * (11-x);
}
System.out.println(sum);
*/