import java.util.Scanner;
public class Calculator{

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String [] args){

	char operator;
	double number1, number2, number3, number4 ;
	Scanner input = new Scanner(System.in);

	System.out.println("Please Enter the following operators (+, -, *, /) ");
	operator = input.next().charAt(0);

	System.out.println("Enter A maximum of four numbers one by one ");
	number1 = input.nextDouble();
	number2 = input.nextDouble();
	number3 = input.nextDouble();
	number4 = input.nextDouble();

	input.close();

	switch(operator){
		case '+':
				System.out.printf("%.2f + %.2f + %.2f + %.2f = %.2f" , number1, number2, number3, number4, (number1 + number2 + number3 + number4  ));
				break;

		case '-':
				System.out.printf("%.2f - %.2f + %.2f - %.2f = %.2f" , number1, number2, number3, number4, (number1 - number2 - number3 - number4  ));
				break;
		case '*':
				System.out.printf("%.2f * %.2f * %.2f * %.2f = %.2f" , number1, number2, number3, number4, (number1 * number2 * number3 * number4  ));
				break;
		case '/':
				if(number2!=0)
				System.out.printf("%.2f / %.2f / %.2f / %.2f = %.2f" , number1, number2, number3, number4,  (number1 / number2 / number3/ number4));
				else
					System.out.printf("Divide by zero situation");
				break;

			default:
				System.out.printf("%c is an invalid operator ", operator);
	}



	}
}
	
	