public class AccountDetailsCommand implements Command{
    private Bank bank;
    public AccountDetailsCommand(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void execute() {
        bank.accountDetails();
    }
}
