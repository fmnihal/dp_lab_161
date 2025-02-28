// 210042161, SWE 4502
public interface Command {
    void execute();
}

/*
Features:
CreateAccount();
Deposit();
Withdraw();
AccountDetails();
TranxHistory();

Command Interface:
Command;

Concrete Command Classes: all implements Command;
CreateAccountCommand;
DepositCommand;
WithdrawCommand;
AccountDetailsCommand;
TranxHistoryCommand;

Receiver Classes (Bank/Device):
public interface Bank;
public class App implements Bank;
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

//Invoker Class (Remote Control):
public class OnlineBanking {    //RemoteControl
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void enterApp() {
        command.execute();
    }
}

//Main Class
public class CommandPatternExample {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on
        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}

 */