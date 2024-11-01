package gitShowcaseTwo;

import java.util.Scanner;

public class GitshowcaseTwo {

	public static void main(String[] args) {
		
		// Display welcome message 
				System.out.println("#########################################");
				System.out.println("    Fall Weather Adventure Planner !!! "); 
				System.out.println("#########################################");
				
				// Display welcome message (cont'd) 
				System.out.println("Welcome to the Fall Adventure Planner ! "); 
				
				// Create scanner object to read user input 
				Scanner scanner = new Scanner (System.in) ;
				
				// Display information and prompt user for temperature input 
				System.out.print("Enter the current temperature (ºC) : ");
				
					// Read & store user input 
					int temp = scanner.nextInt(); 
					
					scanner.nextLine(); // Consume left over newline
					
				// Display information and prompt user for weather condition input 
				System.out.print("Enter the weather condition (sunny/rainy/snowy) : " ); 
				
					// Read & store user input 
					String cond = scanner.nextLine(); 
					
				
					// Turn user input lower case to read various inputs
					cond = cond.toLowerCase(); 
				
					
					
				// Create recommendation variables, initialized to "" so I can use the value in the if statement outside.
				String tempRec = "";
				String safeTip = ""; 
				
				
				// If statements that set recommendation & safety tips
				if ( temp > 20 || cond.equals("sunny"))
				{
					tempRec = "Light clothing (t-shirt and shorts).";
					safeTip = "Don't forget sunscreen and stay hydrated!"; 
				}
					 
				// If temperature is between 10 & 20 º, recommend accordingly 
				if ( temp >= 10 && temp <= 20 ) 
				{
					tempRec = "A light jacket."; 
				}
				
				// If temperature is under 10º display recommendation
				if ( temp < 10 )
				{
					tempRec = "Warm clothing (a sweater and a coat). ";
				}
				 
				// If the condition is equal to rainy, automatically override and set recommendations 
				if ( cond.equals("rainy"))
				{
					tempRec = "Waterproof clothing. "; 
					safeTip = "Be cautious of slippery paths! " ; 
				}
				
				 // If the condition is equal to snowy, automatically override and set recommendations 
				 if ( cond.equals("snowy"))
				{
					tempRec = "Heavy winter clothing. ";
					safeTip = "Stay warm and watch out for icy conditions! "; 
				}
				
				// Spacing 
				System.out.println("\n"); 
				
				// Display recommendations 
				System.out.println("Recommended clothing : " + tempRec ); 
				System.out.println("Safety tip : " + safeTip);
				
				// Display farewell message 
				System.out.println("Thank you for using the Fall Adventure Planner!"); 
				
				// Close Scanner
				scanner.close();}
}
