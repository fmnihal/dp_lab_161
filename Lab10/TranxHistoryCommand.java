public class TranxHistoryCommand implements Command{
    private Bank bank;
    public TranxHistoryCommand(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void execute() {
        bank.tranxHistory();
    }
}
