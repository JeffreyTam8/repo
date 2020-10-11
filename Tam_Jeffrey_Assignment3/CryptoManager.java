import javax.management.RuntimeErrorException;
/*
 * Jeffrey Tam
 * 10/11/20
 * CMSC 203
 * CRN 21599
 * 
 */
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		//Loops to the number of letters in the string argument
		for(int i = 0; i < plainText.length(); i++) {
			if(plainText.charAt(i) < LOWER_BOUND) {				//If character is out of Range, return false
				return false;
			}else if(plainText.charAt(i) > UPPER_BOUND) {		//If character is our of Range, return false
				return false;
			}
		}
		return true; //Returns true only if the entire string's character is within bounds
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		String encryptedText = "";			//Holds Final Text 
		char newCharacter;					//Holds encrypted character
		
		for(int index = 0; index < plainText.length(); index++) {
			
			newCharacter = (char) (plainText.charAt(index) + key);	//Encrypts new character with key
			
			while(newCharacter > UPPER_BOUND) {		//If the new character is over the bound, it gets subtracted by the Range
				
				newCharacter = (char) (newCharacter - RANGE);
				
			}
			
			while(newCharacter < LOWER_BOUND) {		//If the new character is under the bound, it gets added by the Range
				
				newCharacter = (char) (newCharacter + RANGE);
				
			}
			
			encryptedText += newCharacter;			//Combines to get new encrypted word

		}
		
		return encryptedText;						//Returns the final Text
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		String newText = "";			//Holds Final Text 
		char newCharacter;				//Holds encrypted character
		int keyIndex = 0;				//Counts the index of the bellaso key
		
		for(int i = 0; i < plainText.length(); i++) {		//Loops until method reaches every character of the string
			
				if(keyIndex == bellasoStr.length()) {		//Reset counter of bellaso key
					keyIndex = 0;
				}
			
				newCharacter = (char)(plainText.charAt(i) + bellasoStr.charAt(keyIndex));		//Encrypts the character of the plainText
			
				while(newCharacter > UPPER_BOUND) {			//If the new character is over the bound, it gets subtracted by the Range
			
					newCharacter = (char) (newCharacter - RANGE);
			
				}
		
				while(newCharacter < LOWER_BOUND) {			//If the new character is under the bound, it gets added by the Range
			
					newCharacter = (char) (newCharacter + RANGE);
			
				}
				
				newText += newCharacter;					//Combines to get new encrypted word
				
				keyIndex++;									//Increases to the next index of the bellase character
		}
		return newText;										//Returns Final text
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		
		String newText = "";		//Holds Final Text 
		char newChar;				//Holds decrypted character
		
		for(int i = 0; i < encryptedText.length(); ++ i) {		//Loops until method reaches every character of the string
			
			newChar = (char)(encryptedText.charAt(i) - key);	//Decrypts the character of the encryptedText
			
			while(newChar < LOWER_BOUND) {		//If the new character is under the bound, it gets added by the Range
				newChar += RANGE;
			}
			
			while(newChar > UPPER_BOUND) {		//If the new character is over the bound, it gets subtracted by the Range
				newChar -= RANGE;
			}
			newText += newChar;		//Combines to get decrypted word
		}
		return newText;			//Returns Final text
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		
		String newText = "";		//Holds Final Text 
		char newCharacter;			//Holds decrypted character
		int keyIndex = 0;			//Counts the index of the bellaso key
		
		for(int i = 0; i < encryptedText.length(); i++) {		//Loops until method reaches every character of the string
				if(keyIndex == bellasoStr.length()) {			//Reset counter of bellaso key
					keyIndex = 0;	
				}
				newCharacter = (char)(encryptedText.charAt(i) - bellasoStr.charAt(keyIndex));		//Decrypts the character of the encryptedText
				
				while(newCharacter < LOWER_BOUND) {		//If the new character is under the bound, it gets added by the Range
					
					newCharacter = (char) (newCharacter + RANGE);
			
				}
				
				while(newCharacter > UPPER_BOUND) {		//If the new character is over the bound, it gets subtracted by the Range
			
					newCharacter = (char) (newCharacter - RANGE);
			
				}
				newText += newCharacter;		//Combines to get decrypted word
				keyIndex++;		//Increases to the next index of the bellase character
		}
		
		return newText;		//Returns Final text
	}
}