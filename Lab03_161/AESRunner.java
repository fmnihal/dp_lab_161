import javax.crypto.SecretKey;
import java.util.Scanner;

public class AESRunner {
    public void runAES() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("AES encryption selected.");
            
            // Input for the string to encrypt
            System.out.print("Enter text to encrypt: ");
            String originalText = scanner.nextLine();

            // Generate a secret key
            SecretKey secretKey = AES.generateKey(128); // 128-bit AES key
            
            // Encrypt the text
            String encryptedText = AES.encrypt(originalText, secretKey);
            System.out.println("Encrypted Text: " + encryptedText);

            // Decrypt the text
            String decryptedText = AES.decrypt(encryptedText, secretKey);
            System.out.println("Decrypted Text: " + decryptedText);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}




// import java.util.Scanner;

// public class AESRunner {
//     public void runAES(){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("AES Encryption selected");
//         System.out.println("Enter a string to encrypt using AES: ");
//         String input = scanner.nextLine();
//         System.out.println("AES encrypted output: "+ input);
//         scanner.close();
//     }
// }
