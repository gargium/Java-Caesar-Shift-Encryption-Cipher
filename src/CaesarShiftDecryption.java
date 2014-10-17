/**
 * Decryption class
 * @purpose Handles the decryption logic
 * @author rakshitgarg
 *
 */

public class CaesarShiftDecryption 
{
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public CaesarShiftDecryption()
	{
		
	}
	
	public static String decrypt(String encryptedMessage, int shiftKey)
	{
		encryptedMessage = encryptedMessage.toLowerCase();
		String decryptedMessage = "";
		for (int i = 0; i < encryptedMessage.length(); i++)
		{
			int positionOfCharacterInMessage = ALPHABET.indexOf(encryptedMessage.charAt(i));
			int valueAtIndex = (positionOfCharacterInMessage - shiftKey) % 26;
			
			if (valueAtIndex < 0)
			{
				valueAtIndex = ALPHABET.length() + valueAtIndex;
			}
			
			char decryptedValue = ALPHABET.charAt(valueAtIndex);
			decryptedMessage += decryptedValue;
		}
		return decryptedMessage;
	}
}
