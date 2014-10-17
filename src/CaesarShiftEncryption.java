/**
 * Encryption class
 * @purpose Handles the encryption logic
 * @author rakshitgarg
 *
 */

public class CaesarShiftEncryption 
{
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public CaesarShiftEncryption()
	{
		
	}
	
	public static String encrypt(String messageToBeEncrypted, int shiftKey)
	{
		messageToBeEncrypted = messageToBeEncrypted.toLowerCase();
		String encryptedText = "";
		for (int i = 0; i < messageToBeEncrypted.length(); i++)
		{
			int positionOfCharacterInMessage = ALPHABET.indexOf(messageToBeEncrypted.charAt(i));
			int valueAtIndex = (shiftKey + positionOfCharacterInMessage) % 26;
			char encryptedValue = ALPHABET.charAt(valueAtIndex);
			encryptedText += encryptedValue;
		}
		return encryptedText;
	}
}
