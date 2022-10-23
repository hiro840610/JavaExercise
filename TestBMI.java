package xxx;

public class TestBMI {

	public static void main(String[] args) {
		double weight = 65;
//		double height = Math.pow(1.7,2);
		double height = 1.7;
		double bmi = weight/(Math.pow(height,2));
		System.out.println("BMI=" + bmi);
		System.out.printf("BMI= %.2f%n" , bmi);
		
		if (bmi<18.5) {
			System.out.println("過瘦");	
		}else if(bmi < 24){
			System.out.println("正常");	
		}else {
			System.out.println("過胖");	
		}
			System.out.println("=========");
			double height1 = 1.77;
			double height2 = 1.7;
			double newweight = 65;
			
			double bmi1 = newweight/(height1*height1);
			double bmi2 = newweight/(height2*height2);
			System.out.println(bmi1);
			System.out.println(bmi2);
			
			
			
	}

}
