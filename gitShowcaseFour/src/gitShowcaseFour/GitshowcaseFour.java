package gitShowcaseFour;


import java.util.Scanner; 

public class GitshowcaseFour {

	
public static void main(String[] args) {
		
		// Create scanner
		Scanner myObj = new Scanner(System.in);
		
		// Print welcome message
		System.out.println("\n**************************************************\n   Welcome to Inventory Management System!  \n**************************************************");
		
		// Initialize variables into arrays 
		double price[];
		price = new double[5]; 
		
		int quantity[]; 
		quantity = new int[5]; 
		
		
		String name[]; 
		name = new String[5]; 
		
		// Prompt user for information & store into variables
		System.out.println("\nEnter details for 5 products (price, quantity, name): \nProduct 1: "); 
		System.out.println("Enter product details (price, quantity, name): ");
		
		price[0] = myObj.nextDouble();
		quantity[0] = myObj.nextInt(); 
		name[0] = myObj.nextLine();
		
		// Prompt user for information & store into variables
		System.out.println("\nEnter details for 5 products (price, quantity, name): \nProduct 2: "); 
		System.out.println("Enter product details (price, quantity, name): ");
		
		price[1] = myObj.nextDouble();
		quantity[1] = myObj.nextInt(); 
		name[1] = myObj.nextLine();
		 
		// Prompt user for information & store into variables
		System.out.println("\nEnter details for 5 products (price, quantity, name): \nProduct 3: "); 
		System.out.println("Enter product details (price, quantity, name): ");
		
		price[2] = myObj.nextDouble();
		quantity[2] = myObj.nextInt(); 
		name[2] = myObj.nextLine();
		
		// Prompt user for information & store into variables
		System.out.println("\nEnter details for 5 products (price, quantity, name): \nProduct 4: "); 
		System.out.println("Enter product details (price, quantity, name): ");
		
		price[3] = myObj.nextDouble();
		quantity[3] = myObj.nextInt(); 
		name[3] = myObj.nextLine();
		
		// Prompt user for information & store into variables
		System.out.println("\nEnter details for 5 products (price, quantity, name): \nProduct 5: "); 
		System.out.println("Enter product details (price, quantity, name): ");
		
		price[4] = myObj.nextDouble();
		quantity[4] = myObj.nextInt(); 
		name[4] = myObj.nextLine();
		
		// Initialize option variable 
		int option; 
		
		// Use do/while statement to loop options list
		do {
			
			// Print menu options
			System.out.println("\nInevntory Management Menu:"); 
			System.out.println("\t1. Display information of all products");
			System.out.println("\t2. Update the quantity of a product"); 
			System.out.println("\t3. Search for a product by name"); 
			System.out.println("\t4. Find a product with the lowest quantity"); 
			System.out.println("\t5. Find the product with the highest price"); 
			System.out.println("\t6. Exit"); 
			
			// Prompt user for input 
			System.out.print("Enter your choice: ");
			
			// Grab user input 
			option = myObj.nextInt(); 
			
			// Switch statement for menu options list
			switch (option) {
			
			// Menu option '1'
			case 1 : 
				
				// Print product list and their information
				System.out.println("Product List: "); 
				System.out.println("\tProduct 1:\n" + "\tName:" + name[0] + "\n" + "\tPrice: " + "$" + price[0] + "\n" + "\tQuantity: " + quantity[0] + "\n----------------------------");
				System.out.println("\tProduct 2:\n" + "\tName:" + name[1] + "\n" + "\tPrice: " + "$" + price[1] + "\n" + "\tQuantity: " + quantity[1] + "\n----------------------------");
				System.out.println("\tProduct 3:\n" + "\tName:" + name[2] + "\n" + "\tPrice: " + "$" + price[2] + "\n" + "\tQuantity: " + quantity[2] + "\n----------------------------");
				System.out.println("\tProduct 4:\n" + "\tName:" + name[3] + "\n" + "\tPrice: " + "$" + price[3] + "\n" + "\tQuantity: " + quantity[3] + "\n----------------------------");
				System.out.println("\tProduct 5:\n" + "\tName:" + name[4] + "\n" + "\tPrice: " + "$" + price[4] + "\n" + "\tQuantity: " + quantity[4] + "\n----------------------------");
			break; 
				
			
			// Menu option '2'	
			case 2 : 
			
				// Prompt user to choose a product to update quantity 
				System.out.print("Enter the product number (1-5) to update quantity: ");
				int product = myObj.nextInt();  
				
				// If product '1' is chosen, prompt user to new quantity and update variable
				if ( product == 1 ) {
				System.out.print("Enter new quantity for" + name[0] +": ");
				quantity[0] = myObj.nextInt(); 
				
				System.out.println("Quantity updated successfully!");}
				
				// Else if product '2' is chosen, prompt user to new quantity and update variable
				else if ( product == 2 ) {
					System.out.print("Enter new quantity for" + name[1] +": ");
					quantity[1] = myObj.nextInt(); 
					
					System.out.println("Quantity updated successfully!");}
				
				// Else if product '3' is chosen, prompt user to new quantity and update variable
				else if ( product == 3 ) {
					System.out.print("Enter new quantity for" + name[2] +": ");
					quantity[2] = myObj.nextInt(); 
					
					System.out.println("Quantity updated successfully!");}
				
				// Else if product '4' is chosen, prompt user to new quantity and update variable
				else if ( product == 4 ) {
					System.out.print("Enter new quantity for" + name[3] +": ");
					quantity[3] = myObj.nextInt(); 
					
					System.out.println("Quantity updated successfully!");}
				
				// Else if product '5' is chosen, prompt user to new quantity and update variable
				else if ( product == 5 ) {
					System.out.print("Enter new quantity for" + name[4] +": ");
					quantity[4] = myObj.nextInt(); 
					
					System.out.println("Quantity updated successfully!");}
			break;
				
			// Menu option '3'	
			case 3 :
				
				// Prompt user to enter product name to search for and store in variable
				System.out.println("Enter the name of the product to search for: ");
				myObj.nextLine(); // Consume left over whitespace
				String prodSearch = myObj.nextLine();
				
				// If statement to compare user input to stored information .trim() removes the whitespace before and after the string
				if ( prodSearch.equalsIgnoreCase(name[0].trim()) ) {
					System.out.println("\nProduct found: ");
					System.out.println("\tName:" + name[0]);
					System.out.println("\tPrice: $" + price[0]);
					System.out.println("\tQuantity: " + quantity[0] + "\n");}
				
				// Else if statement to compare user input to stored information .trim() removes the whitespace before and after the string
				else if ( prodSearch.equalsIgnoreCase(name[1].trim()) ) {
					System.out.println("\nProduct found: ");
					System.out.println("\tName:" + name[1]);
					System.out.println("\tPrice: $" + price[1]);
					System.out.println("\tQuantity: " + quantity[1]+ "\n");}
				
				// Else if statement to compare user input to stored information .trim() removes the whitespace before and after the string
				else if ( prodSearch.equalsIgnoreCase(name[2].trim()) ) {
					System.out.println("\nProduct found: ");
					System.out.println("\tName:" + name[2]);
					System.out.println("\tPrice: $" + price[2]);
					System.out.println("\tQuantity: " + quantity[2]+ "\n");}
				
				// Else if statement to compare user input to stored information .trim() removes the whitespace before and after the string
				else if ( prodSearch.equalsIgnoreCase(name[3].trim()) ) {
					System.out.println("\nProduct found: ");
					System.out.println("\tName:" + name[3]);
					System.out.println("\tPrice: $" + price[3]);
					System.out.println("\tQuantity: " + quantity[3]+ "\n");}
				
				// Else if statement to compare user input to stored information .trim() removes the whitespace before and after the string
				else if ( prodSearch.equalsIgnoreCase(name[4].trim()) ) {
					System.out.println("\nProduct found: ");
					System.out.println("\tName:" + name[4]);
					System.out.println("\tPrice: $" + price[4]);
					System.out.println("\tQuantity: " + quantity[4]+ "\n");}
				
				// If user input is not found, display error message
				else if (!prodSearch.equalsIgnoreCase(name[0].trim()) || !prodSearch.equalsIgnoreCase(name[1].trim()) || !prodSearch.equalsIgnoreCase(name[2].trim()) || !prodSearch.equalsIgnoreCase(name[3].trim()) || !prodSearch.equalsIgnoreCase(name[4].trim() ))
				{System.out.println("Product not found !");}
			break; 
			
			// Menu option '4'
			case 4 :
				
				// Display message
				System.out.println("\nProduct with the Lowest Quantity: ");
				
				// If product '1' has the lowest quantity, display product information
				if ( quantity[0] < quantity[1] && quantity[0] < quantity[2] && quantity[0] < quantity[3] && quantity[0] < quantity[4] ) {
					System.out.println("\tName:" + name[0]);
					System.out.println("\tPrice: $" + price[0]);
					System.out.println("\tQuantity: " + quantity[0] + "\n");}
				
				// Else if product '2' has the lowest quantity, display product information
				else if ( quantity[1] < quantity[0] && quantity[1] < quantity[2] && quantity[1] < quantity[3] && quantity[1] < quantity[4] ) {
					System.out.println("\tName:" + name[1]);
					System.out.println("\tPrice: $" + price[1]);
					System.out.println("\tQuantity: " + quantity[1] + "\n");}
				
				// Else if product '3' has the lowest quantity, display product information
				else if ( quantity[2] < quantity[0] && quantity[2] < quantity[1] && quantity[2] < quantity[3] && quantity[2] < quantity[4] ) {
					System.out.println("\tName:" + name[2]);
					System.out.println("\tPrice: $" + price[2]);
					System.out.println("\tQuantity: " + quantity[2] + "\n");}
				
				// Else if product '4' has the lowest quantity, display product information
				else if ( quantity[3] < quantity[0] && quantity[3] < quantity[2] && quantity[3] < quantity[1] && quantity[3] < quantity[4] ) {
					System.out.println("\tName:" + name[3]);
					System.out.println("\tPrice: $" + price[3]);
					System.out.println("\tQuantity: " + quantity[3] + "\n");}
				
				// Else if product '5' has the lowest quantity, display product information
				else if ( quantity[4] < quantity[0] && quantity[4] < quantity[2] && quantity[4] < quantity[3] && quantity[4] < quantity[1] ) {
					System.out.println("\tName:" + name[4]);
					System.out.println("\tPrice: $" + price[4]);
					System.out.println("\tQuantity: " + quantity[4] + "\n");}
			break; 
				
			// Menu option '5'
			case 5 : 
				
				// Display message
				System.out.println("\nProduct with the Highest Price: ");
				
				// If product '1' has the highest price, display product information
				if ( price[0] > price[1] && price[0] > price[2] && price[0] > price[3] && price[0] > price[4] ) {
					System.out.println("\tName:" + name[0]);
					System.out.println("\tPrice: $" + price[0]);
					System.out.println("\tQuantity: " + quantity[0] + "\n");}
				
				// Else if product '2' has the highest price, display product information
				else if ( price[1] > price[0] && price[1] > price[2] && price[1] > price[3] && price[1] > price[4] ) {
					System.out.println("\tName:" + name[1]);
					System.out.println("\tPrice: $" + price[1]);
					System.out.println("\tQuantity: " + quantity[1] + "\n");}
				
				// Else if product '3' has the highest price, display product information
				else if ( price[2] > price[0] && price[2] > price[1] && price[2] > price[3] && price[2] > price[4] ) {
					System.out.println("\tName:" + name[2]);
					System.out.println("\tPrice: $" + price[2]);
					System.out.println("\tQuantity: " + quantity[2] + "\n");}
				
				// Else if product '4' has the highest price, display product information
				else if ( price[3] > price[0] && price[3] > price[2] && price[3] > price[1] && price[3] > price[4] ) {
					System.out.println("\tName:" + name[3]);
					System.out.println("\tPrice: $" + price[3]);
					System.out.println("\tQuantity: " + quantity[3] + "\n");}
				
				// Else if product '5' has the highest price, display product information
				else if ( price[4] > price[0] && price[4] > price[2] && price[4] > price[3] && price[4] > price[1] ) {
					System.out.println("\tName:" + name[4]);
					System.out.println("\tPrice: $" + price[4]);
					System.out.println("\tQuantity: " + quantity[4] + "\n");}
			break;
				
			// Menu option '6'
			case 6 : 
				
				// Print goodbye message
				System.out.println("\nThank you for using the Inventory Management System! Goodbye! ");
			break;
			
			// Display error message if menu option selected isn't one on the list
			default : 
				if ( option < 1 || option > 6 ) {System.out.println("Invalid choice! Please try again."); }
			break;}
			
		} while (option == 1 || option == 2 || option == 3|| option == 4 || option == 5 || option < 1 || option > 6);
		
		// Close scanner
		myObj.close();
		
// System exit
System.exit(0);}
}


