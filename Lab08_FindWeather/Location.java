import java.net.UnknownHostException;
import java.util.Scanner;
public class Location {
    public void selectLocationMethod() throws UnknownHostException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Select location method: 1. By IP, 2. By City, 3. Exit");
        int method = Integer.parseInt(myScanner.nextLine());
        switch (method) {
            case 1:
                System.out.println("Getting weather data by IP...");
                GetIP getip = new GetIP();
                break;
            case 2:
                System.out.println("Choose City");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please choose a valid option");
        }
    }
    public void showLocation(){
        //lat, long, city

    }
}
