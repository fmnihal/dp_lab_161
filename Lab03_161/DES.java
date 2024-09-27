import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DES {
    // Method to generate a secret key
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        keyGenerator.init(56); // DES uses a 56-bit key
        return keyGenerator.generateKey();
    }

    // Method to encrypt a string
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes); // Convert to Base64 for readability
    }

    // Method to decrypt a string
    public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
    }
}


// import javax.crypto.Cipher;
// import javax.crypto.KeyGenerator;
// import javax.crypto.SecretKey;
// import javax.crypto.spec.SecretKeySpec;
// import java.util.Base64;
// import java.util.Scanner;

// public class DES {

//     // Method to generate a secret key
//     public static SecretKey generateKey() throws Exception {
//         KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
//         keyGenerator.init(56); // DES uses a 56-bit key
//         return keyGenerator.generateKey();
//     }

//     // Method to encrypt a string
//     public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
//         Cipher cipher = Cipher.getInstance("DES");
//         cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//         byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
//         return Base64.getEncoder().encodeToString(encryptedBytes); // Convert to Base64 for readability
//     }

//     // Method to decrypt a string
//     public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
//         Cipher cipher = Cipher.getInstance("DES");
//         cipher.init(Cipher.DECRYPT_MODE, secretKey);
//         byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
//         byte[] decryptedBytes = cipher.doFinal(decodedBytes);
//         return new String(decryptedBytes);
//     }

//     public static void main(String[] args) {
//         try {
//             Scanner scanner = new Scanner(System.in);

//             // Input for the string to encrypt
//             System.out.print("Enter text to encrypt: ");
//             String originalText = scanner.nextLine();

//             // Generate a secret key
//             SecretKey secretKey = generateKey();

//             // Encrypt the text
//             String encryptedText = encrypt(originalText, secretKey);
//             System.out.println("Encrypted Text: " + encryptedText);

//             // Decrypt the text
//             String decryptedText = decrypt(encryptedText, secretKey);
//             System.out.println("Decrypted Text: " + decryptedText);

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }



// import javax.crypto.Cipher;
// import javax.crypto.KeyGenerator;
// import javax.crypto.SecretKey;
// import javax.crypto.spec.SecretKeySpec;
// import java.util.Base64;

// public class DES {

//     // Method to generate a secret key
//     public static SecretKey generateKey() throws Exception {
//         KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
//         keyGenerator.init(56); // DES uses a 56-bit key
//         return keyGenerator.generateKey();
//     }

//     // Method to encrypt a string
//     public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
//         Cipher cipher = Cipher.getInstance("DES");
//         cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//         byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
//         return Base64.getEncoder().encodeToString(encryptedBytes); // Convert to Base64 for readability
//     }

//     // Method to decrypt a string
//     public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
//         Cipher cipher = Cipher.getInstance("DES");
//         cipher.init(Cipher.DECRYPT_MODE, secretKey);
//         byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
//         byte[] decryptedBytes = cipher.doFinal(decodedBytes);
//         return new String(decryptedBytes);
//     }

//     public static void main(String[] args) {
//         try {
//             // Generate a secret key
//             SecretKey secretKey = generateKey();

//             // Example usage
//             String originalText = "Hello, World!";
//             System.out.println("Original Text: " + originalText);

//             // Encrypt the text
//             String encryptedText = encrypt(originalText, secretKey);
//             System.out.println("Encrypted Text: " + encryptedText);

//             // Decrypt the text
//             String decryptedText = decrypt(encryptedText, secretKey);
//             System.out.println("Decrypted Text: " + decryptedText);

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
