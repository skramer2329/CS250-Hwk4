/*************************************************************
 * Homework04.java
 * Sabrina Kramer
 * CompSci 250 - 401
 * 
 * This program gets a phone number from user and checks to
 * see if the user inputs it with the correct format.
 **************************************************************/

import java.util.Scanner;

public class Homework04 
	{
		public static void main(String[] args)
		{
			Scanner stdId = new Scanner(System.in);
			
			String testString = "(xxx)xxx-xxxx";
			
			String userNumber;
			
			System.out.println("Please enter a phone number with format (xxx)xxx-xxxx: ");
			userNumber = stdId.nextLine();
				
			if (testString.length() == userNumber.length())
			{
				System.out.println("Cool Beans");


				if (testString.charAt(0) == userNumber.charAt(0))
				{
					System.out.println("Good");
					if (testString.charAt(4) == userNumber.charAt(4))
					{
						System.out.println("Very Good!");
						if (testString.charAt(8) == userNumber.charAt(8))
						{
								System.out.println("You deserve a gold star.");
								System.out.println(userNumber);
						}
						
						else
						{
								System.out.println("We're calling your parents now. What is their number?");
						}
					}
					
					else
					{
						System.out.println("Very Bad Human");
					}
				}
				else
				{
					System.out.println("Bad Human. You're not starting with '('");
				}
			}
			else
			{
				System.out.print(userNumber + " is invalid. You need EXACTLY 13 Characters. Try again...");
			}

			
			
			stdId.close();
			
		}
	}
