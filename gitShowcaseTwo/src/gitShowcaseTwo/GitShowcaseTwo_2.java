package gitShowcaseTwo;

import java.util.Scanner;

public class GitShowcaseTwo_2 {

	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("************************************************************");
		System.out.println("            Perfect Currency Exchange Shop ! ");
		System.out.println("************************************************************\n"); 
				
				// Create scanner to read user input 
				Scanner scanner = new Scanner(System.in) ; 
				
				// Display welcome message and prompt user for input 
				System.out.println("Welcome to the Perfect Currency Exchange Shop! ");
				System.out.print("Do you want to buy foreign currency (B) or sell foreign currency (S)? ");
				
				// Read user input and store it in a variable
				String opt = scanner.nextLine();
					
					
					
				// Set user option to upper case to be read by if, else if statements
				opt  = opt.toUpperCase(); 
				
				// Initialize variables, certain ones to blanks to be used in and out if/switch statements 
				double buyAmt; 
				double sellAmt;  
				double sellRate = 0.00; 
				double buyRate = 0.00; 
				String currency;
				
				// If statement for if the user wants to buy currency 
				if (opt.equals("B"))
				{	
				// Prompt user for information 
				System.out.print("Enter the currency you want to buy (USD, EUR, GBP, JPY, AUD) : "); 
					
				// Read user input 
				currency = scanner.nextLine(); 
					
				// Turn the users option to upper-case to be read by the switch statement and display properly 
				currency = currency.toUpperCase(); 
					
					// Switch statement to set the sell rate depending on currency
					switch (currency) 
					{ 
					case "USD" : 
						sellRate = 1.25; 
					 break;
						
					case "EUR" : 
						sellRate = 1.50; 
					 break;
						
					case "GBP" : 
						sellRate = 1.75;
					break;
					
					case "JPY" : 
						sellRate = 0.01; 
					 break; 
					
					case "AUD" : 
						sellRate = 0.95;
					break;}
					
				// Prompt user for information 
				System.out.print("Enter the amount of " + currency + " you want to buy : ");
					
				// Read user input 
				sellAmt = scanner.nextDouble(); 
					
				// Display information 
				System.out.println("You need to spend " + sellAmt * sellRate + " CAD to receive " + sellAmt + " " + currency); 
					
				// Display  farewell message 
				System.out.println("Thank you for visiting! ");}
				
				
				// else if statement if the user wants to sell currency 
				else if (opt.equals("S")) 
				{ 
				// Prompt user for information 
				System.out.print("Enter the CAD amount you would like to receive : ");
					
				// Read user input 
				buyAmt = scanner.nextDouble(); 
					
				// Display information 
				System.out.print("Enter the target currency to sell (USD, EUR, GBP, JPY, AUD) : ");
					 
				// Consume the remaining whitespace 
				scanner.nextLine(); 
					
				// Read user input 
				currency = scanner.nextLine(); 
					
				// Turn the users option to upper-case to be read by the switch statement and display properly	
				currency = currency.toUpperCase(); 
						
					// Switch statement to set the buy rate depending on currency
					switch (currency)
					{
					case "USD" : 
						buyRate = 1.30; 
					break;
					
					case "EUR" : 
						buyRate = 1.55; 
					break; 

					case "GBP" :
						buyRate = 1.80; 
					break; 

					case "JPY" :
						buyRate = 0.012; 
					break; 

					case "AUD" : 
						buyRate = 1.00;
					break;}
						
				// Display information 
				System.out.println("You will need to spend " + buyAmt / buyRate + " " + currency + " to receive " + buyAmt + " CAD ");
					
				// Display farewell message
				System.out.println("Thank you for visiting! ");}	
				
				// Close scanner
				scanner.close();}
			}	
