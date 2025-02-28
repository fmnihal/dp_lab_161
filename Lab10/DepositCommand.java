public class DepositCommand implements Command{
    private Bank bank;
    public DepositCommand(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void execute() {
        bank.deposit();
    }
}
