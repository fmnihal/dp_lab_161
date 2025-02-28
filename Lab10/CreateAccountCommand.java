public class CreateAccountCommand implements Command{
    private Bank bank;
    public CreateAccountCommand(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void execute() {
        bank.createAccount();
    }
}
