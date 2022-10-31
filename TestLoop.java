package xxx;

public class TestLoop {

	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1~1000的偶數和(2+4+8...+100)
		int sum = 0;
		for (int i = 1; i<=1000; i++) {
			if(i % 2 == 0) 
				sum += i;
		}
		System.out.println("請設計一隻Java程式，計算1~1000的偶數和(2+4+8...+100)");
		System.out.println("1~1000的偶數和為:" + sum);
		System.out.println("===================================================");		

		// 請設計一隻Java程式，計算1~10的連乘積(1*2*3...*10)(用for迴圈)
		int sum1 = 1;
		for(int i = 1; i<=10; i++) {
			sum1 *=i;
		}
		System.out.println("請設計一隻Java程式，計算1~10的連乘積(1*2*3...*10)(用for迴圈)");
		System.out.println("1~10的連乘積為:" + sum1);
		System.out.println("===================================================");
		
		// 請設計一隻Java程式，計算1~10的連乘積(1*2*3...*10)(用while迴圈)
		
		int sum2 = 1; int i =1;
		
		while(i<=10) {
			sum2 *=i;
			i++;
		}
		System.out.println("請設計一隻Java程式，計算1~10的連乘積(1*2*3...*10)(用while迴圈)");
		System.out.println("1~10的連乘積為:" + sum2);
		System.out.println("===================================================");
		
		// 請設計一支Java程式，輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		
		System.out.println("請設計一支Java程式，輸出結果為以下:1 4 9 16 25 36 49 64 81 100");
		for(int k = 1 ; k <= 10 ; k++) {
			System.out.print((int)Math.pow(k, 2) + " " );
		}
		

			
			
			
		
		
			
		
	}

}

