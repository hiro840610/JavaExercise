package xxx;

public class Test4Numbers {

	public static void main(String[] args) {
		for(int i =0; i<=100; i++) {
			if(i%4==0) 
			System.out.println(i);
		}
		
		for (int i = 0; i<=100; i = i + 4) {
			System.out.println(i);
		}
//也可以用countinue來完成
	}

}
