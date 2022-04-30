
public class ex_13_01 {

	public static void main(String[] args) {
	      System.out.println("\n13번 -------");
	      {
	         String jjak = " ";
	         
	         
	         for(int i=1;i<100;i++) {
	        	 jjak = " ";
	            for(int j=1;true;j*=10) {
	               if(i/j<1) break;
	               if((i/j)%10==3 || (i/j)%10==6 || (i/j)%10==9)
	                  jjak=jjak+" 짝";
	               
	            }
	            System.out.println(i+jjak);
	            
	         }
	         
	      }

	}

}
