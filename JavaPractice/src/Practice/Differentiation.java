package Practice;
import java.util.Scanner;
public class Differentiation {
	private int number;
	private int coefficient;
	private int power;
	
	Scanner input = new Scanner(System.in);
	
	public void setPowerAndCoefficient() {
		System.out.println("Enter any number: ");
			number = input.nextInt();
				
				coefficient = number;
				power = number - 1;
	}
	
	public int getPower() {
		return power;
	}
	
	public int getCoefficient() {
		return coefficient;
	}
	
	public void displayResult() {
		System.out.printf("The answer is %dy^%d%n", coefficient, power);
	}
}
