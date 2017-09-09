package com;

import java.util.Scanner;

public class BitWiseLogicalAND {
	
	// Function to show BitWise and Logical AND
	public void bitWiseLogical(byte firstByteVariable, byte secondByteVariable) {

		boolean firstBooleanVariable = false;
		boolean secondBooleanVarible = false;
		
		int bitWiseANDResult = firstByteVariable & secondByteVariable;	//	BitWise AND condition
		
		if(firstByteVariable == 0){					//	Checking the Input Byte Variable value and using the same to assign logical value to a variable
			firstBooleanVariable = false;
		} else if (firstByteVariable == 1){
			firstBooleanVariable = true;
		}
		
		if(secondByteVariable == 0){				//	Checking the Input Byte Variable value and using the same to assign logical value to a variable
			secondBooleanVarible = false;
		} else if (secondByteVariable == 1){
			secondBooleanVarible = true;
		}
		
		boolean logicalANDResult = firstBooleanVariable && secondBooleanVarible;	//	Logical AND condition
		
		System.out.println("BitWise AND Result - > " + bitWiseANDResult);		//	Prints BitWise AND condition result
		
		System.out.println("Logical AND Result - > " + logicalANDResult);		// Prints Logical AND condition result
	}

	//	Main Function
	public static void main(String[] args) {
		
		BitWiseLogicalAND bitWiseLogicalAND = new BitWiseLogicalAND();
		
		System.out.println("Enter Values in terms of 0's and 1's - > \n");	
		
		System.out.println("First Byte value - >");			//	Taking First Input from the User
		Scanner firstUserInput = new Scanner(System.in);
		String firstValue = firstUserInput.nextLine();
		
		System.out.println("Second Byte value - >");		//	Taking Second Input from the User
		Scanner secondUserInput = new Scanner(System.in);
		String secondValue = secondUserInput.nextLine();
		
		if((Byte.valueOf(firstValue) <= 1 && Byte.valueOf(secondValue) <= 1)){		// Condition to check the values entered from the user to match the assignment criteria
			bitWiseLogicalAND.bitWiseLogical(Byte.valueOf(firstValue), Byte.valueOf(secondValue));
		} else {
			System.out.println("***** Please enter values in terms of BYTES (0's and 1's) *****");
		}
		
		firstUserInput.close();		//	Closing the Scanner InputStream
		secondUserInput.close();	//	Closing the Scanner InputStream
	}

}