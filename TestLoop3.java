package xxx;

public class TestLoop3 {

	public static void main(String[] args) {
		/* • 請設計一隻Java程式,輸出結果為以下:
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF*/
		
//		char A = 'A';
//		 int a = A;
//		 System.out.println(a);
		
		char k ='\u0041';
		 for (int j = 1; j <= 6; j++) {    
		        for (int i = 1; i <= j; i++) { 
		            System.out.print(k);
		        }
		        k+=1;
		        System.out.println();
		 }	
	}
}
