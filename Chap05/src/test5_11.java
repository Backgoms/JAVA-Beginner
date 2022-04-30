
public class test5_11 {

	public static void main(String[] args) {
		//2중 배열 = 2중 for문으로 돌릴 수 있음.
		
		int [][] arr = new int[3][2]; //2중 배열의 참조변수 , 3행 2열

		arr[0][0] = 30;
		arr[2][1] = 50;
		arr[1][1] = 40;
		arr[1] = new int[5];
		arr[1][4] = 80;
		//arr[2] = null;
		
		for(int x1 = 0 ; x1 <arr.length; x1++) {
			for(int y1 =0 ; y1 < arr[x1].length ; y1++) {
				System.out.println("x1 = " + x1 + " |y1 ="+ y1 + " |값 =" + arr[x1][y1]);
			}
		}		
		
/*		int [][] arr;
		arr =new int[3][];
		arr[0] = new int [2];
		arr[1] = new int [2];
		arr[2] = new int [2];
*/
		
	}
}
