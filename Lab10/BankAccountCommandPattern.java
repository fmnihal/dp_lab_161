// Main Class
public class BankAccountCommandPattern {
    public static void main (String args[]){
        App app= new App();

        Command createAccountCommand= new CreateAccountCommand(app);
        Command depositCommand= new DepositCommand(app);
        Command withdrawCommand= new WithdrawCommand(app);
        Command accountDetailsCommand= new AccountDetailsCommand(app);
        Command tranxHistoryCommand= new TranxHistoryCommand(app);

        OnlineBanking online= new OnlineBanking();

        online.setCommand(createAccountCommand);
        online.enterApp();  // account is created
        online.setCommand(depositCommand);
        online.enterApp();  // money deposit
        online.setCommand(withdrawCommand);
        online.enterApp();  // money withdraw
        online.setCommand(accountDetailsCommand);
        online.enterApp();  // account details is shown
        online.setCommand(tranxHistoryCommand);
        online.enterApp();  // transaction history is shown

        System.out.println("--------------------------------------");
        System.out.println("Level 1: basic Implementation Done.");
    }
}
