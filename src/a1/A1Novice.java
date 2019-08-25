package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numbCustomer = 0;
		String firstName;
		String lastName;
		int itemTypes;
		int itemQuant;
		String itemName;
		double itemPrice;
		
		System.out.println("How many customers?");
		numbCustomer = scan.nextInt();
		
		while(numbCustomer > 0) {
			firstName = scan.next();
			lastName = scan.next();
			itemTypes = scan.nextInt();
			double totalPrice = 0;
				while(itemTypes > 0) {
					itemQuant = scan.nextInt();
					itemName = scan.next();
					itemPrice = scan.nextDouble();
					totalPrice = itemQuant * itemPrice + totalPrice;
					itemTypes--;
				}
			System.out.println(firstname.charAt(0) + ". " lastName + " " + totalPrice);
		numbCustomer--;
		}
	}
}
