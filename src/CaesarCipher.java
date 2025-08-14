import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class Encrypt{
    String userInput;
    public Encrypt(String userInput){
        this.userInput = userInput;
    }
    public Cipher cipherInitializerForEncryption(Cipher cipher, SecretKey secretKey) throws InvalidKeyException {
        cipher.init(Cipher.ENCRYPT_MODE, (Key) secretKey);
        return cipher;
    }
    byte[] encryptUserInput(Cipher cipher) throws IllegalBlockSizeException, BadPaddingException {
        return cipher.doFinal(userInput.getBytes());
    }
}
class Decrypt {
    byte[] encryptedInput;
    public Decrypt(byte[] encryptedInput){
        this.encryptedInput = encryptedInput;
    }
    public Cipher cipherInitializerForDecryption(Cipher cipher, SecretKey secretKey) throws InvalidKeyException {
        cipher.init(Cipher.DECRYPT_MODE, (Key) secretKey);
        return cipher;
    }
    byte[] decryptUserInput(Cipher cipher) throws IllegalBlockSizeException, BadPaddingException {
        return cipher.doFinal(encryptedInput);
    }
}

class SecretKeyGenerator {
    private KeyGenerator getKeyGeneratorInstance(){
        try {
            return KeyGenerator.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    private KeyGenerator KeyGeneratorInitializer(){
        KeyGenerator keyGen = getKeyGeneratorInstance();
        keyGen.init(128);
        return keyGen;
    }

    public SecretKey secretKeyGenerator() {
        KeyGenerator keyGen = getKeyGeneratorInstance();
        KeyGenerator initializedKeyGen = KeyGeneratorInitializer();
        return keyGen.generateKey();
    }
}
public class CaesarCipher {
    private static final Scanner sc = new Scanner(System.in);
    private static final String[] cryptoOperations = {"Encrypted Version", "Decrypted"};

    private static String getUserInput() {
        System.out.print("Enter a word: ");
        return sc.nextLine();
    }
    private static Cipher AESCipherCreator() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES");
    }
    private static void printResult(String cryptoOperation, String result){
        System.out.println();
        System.out.format("%s: %s", cryptoOperation, result);
    }

    private static boolean isValid(String userInput){
        return !userInput.isEmpty();
    }

    void main() throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        System.out.println("\nCaesar Cipher\n");
        Cipher initial_cipher = AESCipherCreator();
        SecretKeyGenerator secretKeyGenerator = new SecretKeyGenerator();
        SecretKey secretKey = secretKeyGenerator.secretKeyGenerator();
        while (true) {
            String userInput = getUserInput();
            if (isValid(userInput)) {
                Encrypt encrypt = new Encrypt(userInput);
                Cipher cipherForEncryption = encrypt.cipherInitializerForEncryption(initial_cipher, secretKey);
                byte[] encryptedUserInput = encrypt.encryptUserInput(cipherForEncryption);
                printResult(cryptoOperations[0], new String(encryptedUserInput));

                Decrypt decrypt = new Decrypt(encryptedUserInput);
                Cipher cipherForDecryption = decrypt.cipherInitializerForDecryption(initial_cipher, secretKey);
                byte[] decryptedUserInput = decrypt.decryptUserInput(cipherForEncryption);
                printResult(cryptoOperations[1], new String(decryptedUserInput));
                System.out.println("\n");
            }
        }
    }
}
