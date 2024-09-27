import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Give the user the option to choose between AES and DES
        System.out.println("Choose encryption algorithm:");
        System.out.println("1. AES");
        System.out.println("2. DES");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                // Call AES encryption
                //runAES();
                AESRunner aesrunner = new AESRunner();
                aesrunner.runAES();
                break;
            case 2:
                // Call DES encryption
                //runDES();
                DESRunner desrunner = new DESRunner();
                desrunner.runDES();
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
        }
        scanner.close();
    }

    // // Method to run AES encryption
    // public static void runAES() {
    //     try {
    //         AES aes = new AES();
    //         aes.main(null); // Calls AES's main method
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // // Method to run DES encryption
    // public static void runDES() {
    //     try {
    //         DES des = new DES();
    //         des.main(null); // Calls DES's main method
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}
