import java.util.Scanner;
public class calculatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number:");
        double number2 = scanner.nextDouble();
        
        
        System.out.println("Select an operaton: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        
        System.out.print("Enter the number corresponding to the operation: ");
        int option = scanner.nextInt();
        double result = 0; 
        
        switch(option) {
        case 1:
        	 result = number1 + number2;
        	break;
        case 2:
        	result = number1 - number2;
        	break;
        case 3:
        	result = number1 * number2;
        	break;
        case 4:
        	if (number2 !=0) {
        		result = number1 /number2;
        	}else {
        		System.out.println("Error! Cannot divide by zero");
        		return;
        	}
        	break;
        default:
        	System.out.println("Invalid option");
        	return;	
        }
        System.out.println("The result is: " + result);
	}
}	
