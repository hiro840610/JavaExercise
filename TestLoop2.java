package xxx;

public class TestLoop2 {

	public static void main(String[] args) {
		// 阿文很熱衷大樂透1~49，但他不喜歡有4的數字，不論是個位數或十位數。
		// 請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些? 總共有幾個?
		int k = 10;
		int sum = 0;
			for (int i = 1; i<=49; i++) {
				if(i % k == 4) {
					
				}else if(i == 4){
					
				}else if(i >=40){
					
				}else{
					sum+=1;
					System.out.print(i+" ");	
				}	
			}
			System.out.println();
			System.out.println("總共有" +sum+"個");
			System.out.println("===================================");
		/*請設計一隻Java程式,輸出結果為以下:
			1 2 3 4 5 6 7 8 9 10
			1 2 3 4 5 6 7 8 9
			1 2 3 4 5 6 7 8
			1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1*/
		for(int j= 10; j>=1; j--) { 
			for(int i = 1; i<=j; i++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		
			
			
			
		
		
	}

}
