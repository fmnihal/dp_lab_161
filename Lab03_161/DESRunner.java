import javax.crypto.SecretKey;
import java.util.Scanner;

public class DESRunner {
    public void runDES() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("DES encryption selected.");

            // Input for the string to encrypt
            System.out.print("Enter text to encrypt: ");
            String originalText = scanner.nextLine();

            // Generate a secret key
            SecretKey secretKey = DES.generateKey();

            // Encrypt the text
            String encryptedText = DES.encrypt(originalText, secretKey);
            System.out.println("Encrypted Text: " + encryptedText);

            // Decrypt the text
            String decryptedText = DES.decrypt(encryptedText, secretKey);
            System.out.println("Decrypted Text: " + decryptedText);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}




// import java.util.Scanner;

// public class DESRunner {
//     public void runDES(){
//         Scanner scanner= new Scanner(System.in);
//         System.out.println("DES encryption selected");
//         System.out.println("Enter a string to encrypt using DES: ");
//         String input = scanner.nextLine();
//         System.out.println("DES encrypted output: "+input);
//         scanner.close();
//     }
// }

