package Practice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice obj = new Invoice();
		
		obj.setQuantity();
		obj.setPricePerItem();
		System.out.printf("The total invoice amount is %.2f%n", obj.getInvoiceAmount());
	}

}
