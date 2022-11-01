package xxx;
import java.util.Arrays;
import java.util.Scanner;
public class TestTriangles {

	public static void main(String[] args) {
		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、
		//等腰 三角形、其它三角形或不是三角形,如圖示結果: 555 正三角形
		// 5 8 5等腰三角形 5 6 7 其他三角形 0 0 0不是三角形
		// (進階功能:加入直角三角形的判斷)
		 System.out.println("請輸入三個數字:");
		 int input[] = new int[3];
		 Scanner sc = new Scanner(System.in);
	    
	     for (int i = 0; i < input.length; i++) {
	     input[0] = sc.nextInt();
	     }
		
	     Arrays.sort(input);
    
	     if(input[0] + input[1] <= input[2]) {
	    	 System.out.println("不是三角形");
	     }else if(input[0] == input[1] && input[1] == input[2]){
	    	 System.out.println("正三角形");
	     }else if((input[0] == input[1] && input[1] == input[2]) ){
	    	 System.out.println("等腰三角形");
	     }else if (input[0] *input[0] + input[1] *input[1] == input[2]*input[2]) {
	    	 System.out.println("直角三角形");
	     }else {
	    	 System.out.println("其他三角形");
	     }
	     
	}

}
