package gitShowcaseThree;

import java.util.Scanner;

public class GitShowcaseThree {

	public static void main(String[] args) 
	{
		// Display Welcome Message
		System.out.println("*********Solar Roof Energy Calculator********");
		
		
		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in); 
		
		// Prompt user for input and store it in a integer variable 
		System.out.print("Enter the number of solar panels :  "); 
			int solarNum = scanner.nextInt(); 
		
		// Prompt user for Input and store it in a integer variable 
		System.out.print("Enter the Wattage rating of each solar panel (in watts): ");
			int wattNum = scanner.nextInt();
		
		 
		// Prompt user for Input and store it in a double variable 
		System.out.print("Enter the average number of solar hours per day : ");
			double dayHr = scanner.nextDouble(); 
		
		
		// Prompt user for input and store it in a double variable 
		System.out.print("Enter the efficieny  of the solar panels (as a percentage) : "); 
			double effPer = scanner.nextDouble() / 100; // Convert percentage to a decimal  
		
		
		// Create a double variable to store the Daily Energy Production Numerator formula 
		double dailyFormulaNum = solarNum * wattNum * dayHr * effPer; 
		
		// Create a double variable that combines the two formulas and stores it 
		double dailyTot = dailyFormulaNum / 1000; // Convert watts to KWh 
		
		// Create multiple display messages on one line, String.format is used to set the precision of decimal places to a specific number
		System.out.println("\nDaily Energy Production : " + String.format("%.4f", dailyTot) + " KWh");  
		
		// Create double variable to store the Annual Energy Production formula 
		double annualFormula = dailyTot * 365; // 365 days in a year
		
		// Display Results, String.format is used to set the precision of decimal places to a specific number
		System.out.print("Annual Energy Production : " + String.format("%.4f", annualFormula) + " KWh"); 
		
		
		// Display farewell message
		System.out.println("\nThank you for using the Solar Roof Energy Calculator!");
		
		
		// Close The Scanner so there's no warning of a leak
		scanner.close();}
	}