package Practice;
import java.util.Scanner;

public class BlessingPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double balance = 0.0;
		
		System.out.println("Enter amount to deposit:");
		int deposit = input.nextInt();
		
	System.out.println("Enter amount to withdraw:");
		int withdraw = input.nextInt();
		
		balance += deposit; 
		double newBalance = balance - withdraw;
		
		if (withdraw > balance || balance <= 1000) {
			System.out.printf("Insufficient funds! %nEnter new withdrawal amount%n");
		}
		else {
			System.out.printf("Your new balance is %f%n", newBalance);
		}
		
	} 

}

