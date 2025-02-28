// Invoker Class (Remote Control):
public class OnlineBanking {    //RemoteControl
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void enterApp() {
        command.execute();
    }
}