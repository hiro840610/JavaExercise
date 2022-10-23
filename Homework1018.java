package xxx;

public class Homework1018 {

	public static void main(String[] args) {
		// 請設計一隻Java程式，計算12 , 6這兩個數值的和與積
		int num1 = 6, num2 = 12;
		
		int sum1 = num1 + num2;  
		int sum2 = num1 * num2;
		System.out.println("請設計一隻Java程式，計算12 , 6這兩個數值的和與積");
		System.out.println("兩數和為:" + sum1); 
		System.out.println("兩數積為:" + sum2);  
		System.out.println("===================");
		// 請設計一隻Java	，計算200顆蛋共是幾打幾顆? (一打為12顆)
		
		int eggs = 200;
		int dozen =eggs / 12;
		int mod = eggs % 12;
		System.out.println("請設計一隻Java，計算200顆蛋共是幾打幾顆");
		System.out.println("200顆蛋共是" + dozen + "打" + mod + "顆"); 
		System.out.println("===================");
		
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalsecs = 256559; 
		int days = totalsecs /(60*60*24); //天
		int mod1 = totalsecs % (60*60*24);
		int hours = mod1 / (60*60) ;
		int mod2 = totalsecs % (60*60);
		int mins = mod2 / 60;
		int mod3 = mod2 % 60;
		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		System.out.println("256559秒為"+ days+ "天" + hours +"小時" + mins + "分鐘" + mod3 +"秒" );
		System.out.println("===================");
		
		//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與周常
		
		final double pi = 3.1415;
		int radius =5; 
		
		System.out.println("請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與周常");
		System.out.println("圓面積=" + radius * radius * pi );
		System.out.println("圓周長=" + (radius*2)* pi);
		System.out.println("===================");
		
		/*某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
		請用程式計算10年後，本金加利息有多少錢?(用複利計算，公式請自行Google)*/
		//複利計算公式：本利和=本金×(1+年利率)^期間
		int deposit = 1_500_000;
		double rate = 0.02;
		int years = 10;
		double total=deposit*Math.pow(1+rate, years);
		double total2=deposit*Math.pow(1 +0.02/12, years);

		System.out.println("某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息有多少錢?");
		System.out.println("本金加利息:" + Math.round(total)+"元");
		System.out.println("===================");
		/*請寫一支程式，利用System.out.println()印出以下三個運算式結果:
		5 + 5 5+'5' 5 + "5" 並請用註解各別說明答案的產生原因*/

		System.out.println(5 + 5); //兩個數字5皆為預設數字型別，數字型別與數字型別相加還是數字型別，因此答案為10
		System.out.println(5 +'5'); // '5'在unicode為16進制的0035，轉成10進制為0053，字元與整數相加將會以數字型別表示，因此為53+5=58
		System.out.println(5 + "5" ); //5為預設數字型別，"5"為String型別，整數與字串相加為串聯，因此為55
	
	}

}
