
public class ex_09 {

	public static void main(String[] args) {
		//2~100사이의 소수를 구해보자
		int x;
		
		for(int i = 2 ; i <=100 ; i++) {
			for( x = 2; x < i ; x++) {
				if( i%x==0 || i!=x) {
					//System.out.println(i);
					continue;
				} else if(i == x){
					System.out.println(i + "hh");
					
				}
			}
		}
	}
}
