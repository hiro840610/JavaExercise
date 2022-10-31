package xxx;

public class TestNineNine {

	public static void main(String[] args) {
	
		
		for(int j=1; j<=9; j++) {
			for(int i = 1; i<=9; i++) {
				System.out.print(j + "x" + i + "=" + j*i + " " );
			}
			System.out.println();
		}
		System.out.println("===============================================");
				
		int j = 1;
		do {
			for(int i = 1; i<=9; i++) {
				System.out.print(j + "x" + i + "=" + j*i + " " );
			}
			System.out.println();
			j++;
		}while(j<=9);
		System.out.println("===============================================");
		int k = 1;
		
		do {
		
			int i = 1; 
			while(i<=9) {
				System.out.print(k + "x" + i + "=" + k*i + " " );
				i++;
			}
			System.out.println();
			k++;
		}while(k<=9);
	}

}
