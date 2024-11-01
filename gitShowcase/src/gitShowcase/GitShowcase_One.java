package gitShowcase;

import java.util.Scanner;

public class GitShowcase_One {

	public static void main(String[] args) {
		
			// Create scanner tool to read user input 
			Scanner myObj = new Scanner (System.in) ; 
				
			// Display welcome message 
			System.out.println("Welcome to the Perfect Bank ATM!"); 
			
			// Declare variables 
			int option;  
			double depositAmt = 0; 
			double withdrawAmt = 0; 
			double balance = 0;
			
		// Use do/while statement to loop options list
		do {
				
			// Print menu options 
			System.out.println("\n-----------------------------------------"); 
			System.out.println("Please choose an option: "); 
			System.out.println("\t1. Check Balance");
			System.out.println("\t2. Deposit");
			System.out.println("\t3. Withdraw");
			System.out.println("\t4. Exit");
			
			// Prompt user for input 
			System.out.print("Enter your choice: " );
			
			// Grab user input and store
			option = myObj.nextInt(); 
			
			// Switch statement for menu options list
			switch (option) {
			
			// Menu option 1 'Check balance' 
			case 1: 
				
				// Print balance amount to 2 decimal places 
				System.out.printf("%nYour balance is: $" + "%.2f", balance); 
			break;
				
			// Menu option 2 'Deposit'
			case 2:
				
				// Prompt user for input 
				System.out.print("Enter amount to deposit: ");
				
				// Read user input 
				depositAmt = myObj.nextDouble(); 
			
			// Print error message if amount requested is either less that $5 or more than $10 000 
			if (depositAmt < 5 || depositAmt > 10000) {System.out.println("Invalid deposit amount! Deposits must be between $5 & $10 000");
			break;}
				
			// Print message saying invalid if deposit amount if a decimal amount is entered or if deposit amount isn't a multiple of 5 or a decimal
			if (depositAmt % 5 != 0 || depositAmt % 1 != 0){System.out.println("Invalid deposit amount ! You may only deposit amounts that are multiples of 5,10,50 or 100.");
			break;}

			// Else if everything passes, deposit amount is updated 
			else if (depositAmt % 5 == 0){
			
				// Update balance amount 
				balance += depositAmt; 
				
				// Display message success 
				System.out.println("Deposit successful!"); 
			break;} 
			
			
			// Menu option 3 'Withdraw'	
			case 3: 
				
				//Prompt user for input 
				System.out.print("Enter amount to withdraw (multiples of 5, 10, 50, or 100): "); 
				
			// Read and store users withdrawal amount 
			withdrawAmt = myObj.nextDouble(); 
				
			// Print insufficient funds message if the user requests to withdraw more than their balance
			if ( balance < withdrawAmt) {System.out.println("Insufficient balance to withdraw. Please try again. ");
			break;}
			
			// Print invalid message if balance is not a multiple of 5 or a decimal
			else if (withdrawAmt % 5 != 0 || withdrawAmt % 1 != 0) {System.out.println("Invalid withdrawal amount ! You may only withdraw amounts that are multiples of 5, 10, 50, or 100. ");
			break;}
				
			// Print error message if amount requested is either less that $5 or more than $10 000 
			else if (withdrawAmt < 5 || withdrawAmt > 10000) {System.out.println("Invalid withdrawal amount ! You may only withdraw amounts between $5 & $10 000! ");
			break;}
			
			
			// If balance is greater than or equal to withdrawal amount the program passes 
			if (balance >= withdrawAmt)
			{ 
				// Declare array to store bill amounts 
				int bills[] = {5,10,50,100}; 
				
			if (withdrawAmt % 5 == 0) {
				
				// Update balance if withdraw amount is a multiple of 5
				balance -= withdrawAmt; 
				
				// Display message
				System.out.println("You will reiceve: ");
				
			// If withdrawal amount is able to be split into $100 bills, calculate how many 
			if (withdrawAmt / bills[3] >= 1) {
				int numHund = (int)withdrawAmt / bills[3];
				
				// Updates withdraw amount in case there needs to be $50 bills 
				withdrawAmt -=  (numHund * bills[3]);
				
				// If one $100 bill is required, message displayed is singular 
				if (numHund == 1) {System.out.println("\t" + numHund + " bill of $100");}
				
				// If more than one $100 bill is required, message displayed is plural
				else if (numHund > 1) {System.out.println("\t" + numHund + " bills of $100");}
				}
					
			// If updated withdrawal amount is able to be split into $50 bills, calculate how many 
			if (withdrawAmt / bills[3] < 1 && withdrawAmt / bills[2] >= 1) {
				
				// Calculates how many $50 bills needed
				int numFift = (int)withdrawAmt / bills[2];
				
				// Updates withdraw amount in case there needs to be $10 bills 
				withdrawAmt -=  (numFift * bills[2]);
				
				// if one $50 bill is required, message displayed is singular
				if (numFift == 1) {System.out.println("\t" + numFift + " bill of $50");}
					
				// If more than one $50 bill is required, message displayed in plural
				else if (numFift > 1) {System.out.println("\t" + numFift + " bills of $50");}
				}
			
			// If updated withdrawal amount is able to be split into $10 bills, calculate how many 
			if (withdrawAmt / bills[2] < 1 && withdrawAmt / bills[1] >= 1) {
				
				// Calculates how many $10 bills needed 
				int numTen = (int)withdrawAmt / bills[1];
				
				// Updates withdraw amount in case there needs to be $5 bills 
				withdrawAmt -= (numTen * bills[1]);
				
				// If one $10 bill is required, message displayed is singular 
				if (numTen == 1) {System.out.println("\t" + numTen + " bill of $10");}	
				
				// If more than one $10 bill is required, message displayed is plural 
				else if (numTen > 1) {System.out.println("\t" + numTen + " bills of $10");}
				}
			
			// If updated withdrawal amount is able to be split into $5 bills, calculate how many 
			if (withdrawAmt / bills[1] < 1 && withdrawAmt / bills[0] >= 1) {	
				
				// Calculates how many $5 bills needed 
				int numFive = (int)withdrawAmt / bills[0];
				
				// Updates withdraw amount  
				withdrawAmt -= (numFive * bills[0]);
				
				// If one $5 bill is required, message displayed is singular 
				if (numFive == 1) {System.out.println("\t" + numFive + " bill of $5");}
				
				// If more than one $5 bill is required, message displayed is plural
				else if (numFive > 1) {System.out.println("\t" + numFive + " bills of $5");}
			 	}
			 
				// Display successful withdrawal message 
				System.out.println("Withdrawal successful ! "); 
			break;}
			}
				
			// Menu option 4 'Exit' 
			case 4: 
				
				// Display goodbye message 
				System.out.println("\nThank you for using the Perfect Bank ATM ! Goodbye! "); 
			break;
			
			// Display error message if menu option selected isn't one on the list
			default : 
				if ( option < 1 || option > 4 ) {System.out.println("Invalid choice! Please try again."); }
			break;
			}
		} while ( option == 1 || option == 2 || option == 3 ||  option > 4 || option < 1);
			 
		// Close scanner 
		myObj.close();	
		
	System.exit(0);}
	}
