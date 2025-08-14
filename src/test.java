import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class test {
    public static void main(String[] args) throws Exception {
        // 1. Generate AES key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 128-bit key
        SecretKey secretKey = keyGen.generateKey();

        // 2. Create Cipher for AES
        Cipher cipher = Cipher.getInstance("AES");

        // 3. Encrypt
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal("Hello World".getBytes());
        System.out.println("Encrypted: " + new String(encrypted)); // looks like gibberish

        // 4. Decrypt
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Decrypted: " + new String(decrypted));
    }
}
