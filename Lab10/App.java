// Concrete receiver for a Bank App
public class App implements Bank {
    @Override
    public void createAccount() {
        System.out.println("Account is created");
    }
    @Override
    public void deposit() {
        System.out.println("Money deposit into account");
    }
    public void withdraw() {
        System.out.println("Money withdrawn from account");
    }
    public void accountDetails() {
        System.out.println("Here is your account details");
    }
    public void tranxHistory() {
        System.out.println("Here is your transaction history");
    }
}