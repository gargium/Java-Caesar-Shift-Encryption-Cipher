/**
 * @purpose Tests the encryption and decryption methods to secure and decrypt a user's
 * 			message using a Caesar Shift. Shift key is to be inputted by the user. 
 * @author rakshitgarg
 * @version	3/15/14
 *
 */

import java.util.Scanner;

public class CaesarShiftTester 
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		String messageToBeEncrypted = "";
		String encryptedMessage = "";
		String userChoice = "";
		int shiftKey = 0;
		
		System.out.println("1 -- Encryption");
		System.out.println("2 -- Decryption");
		System.out.println("Q -- Quit");
		System.out.println("====================");
		while(!userChoice.equalsIgnoreCase("1"))
			{
				System.out.println("Make a choice: ");
				userChoice = in.nextLine();
				if(userChoice.equalsIgnoreCase("1"))
				{
					System.out.println("Please enter a message to be encrypted: ");
					messageToBeEncrypted = in.nextLine();
					
					System.out.println("Please enter a shift value for the cipher (0-25): ");
					shiftKey = in.nextInt();
					
					System.out.println("Encrypting.........");
					System.out.println("===================================");
					System.out.println("Done! Your encrypted text is: ");
					
					System.out.println(CaesarShiftEncryption.encrypt(messageToBeEncrypted, shiftKey));	
				}
				
				else if(userChoice.equalsIgnoreCase("2"))
				{
					System.out.println("Please enter a message to be decrypted: ");
					encryptedMessage = in.nextLine();
					
					System.out.println("Please enter a shift value for the cipher (0-25): ");
					shiftKey = in.nextInt();
					
					System.out.println("Decrypting.........");
					System.out.println("===================================");
					System.out.println("Done! Your decrypted text is: ");
					
					System.out.println(CaesarShiftDecryption.decrypt(encryptedMessage, shiftKey));	
				}
				
				else if(userChoice.equalsIgnoreCase("Q"))
				{
					System.out.println("Thanks for using the program");
				}
			}
		
	}
}
