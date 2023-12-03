public class Print {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 2;
		String name = "Fan";
		int result_multi = number1 * number2;
		int result_add = number1 + number2;
		double result_div = number1 / number2;
		float result_sub = number1 -  number2;
		
		System.out.println("This app is made by: " + name );

		System.out.println("The value of number1 is "+ number1);
		System.out.println("The value of number2 is "+ number2);	

		System.out.println(number1 + " * " + number2 + " = " + result_multi);		
		System.out.println(number1 + " + " + number2 + " = " + result_add);		
		System.out.println(number1 + " - " + number2 + " = " + result_sub);		
		System.out.println(number1 + " / " + number2 + " = " + result_div);		
		
	}

}
