package Practice;
import java.util.Scanner;
public class Invoice {
	private String partNumber;
	private String description;
	private int quantity;
	private double pricePerItem;
	
	Scanner input = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	public Invoice() {
		partNumber = null;
		description = null;
		System.out.println("Enter quantity of goods bought: ");
		quantity = input.nextInt();
		if (quantity < 1) {
			this.quantity = 0;
		} 
		else {
		}
		System.out.println("Enter price of each goods bought: ");
		pricePerItem = input.nextDouble();
		if (pricePerItem < 0) {
			this.pricePerItem = 0.0;
			}
		else {
			}
		}
	
	public int getQuantity() {
		return quantity;
}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public double getInvoiceAmount() {
		double invoiceAmount = quantity * pricePerItem;
		return invoiceAmount;
	}
	
	public void setQuantity() {
	}
	
	public void setPricePerItem() {
		}
}
