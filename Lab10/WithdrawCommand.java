public class WithdrawCommand implements Command{
    private Bank bank;
    public WithdrawCommand(Bank bank) {
        this.bank= bank;
    }
    @Override
    public void execute() {
        bank.withdraw();
    }
    // Concrete command for turning a device off
//    public class TurnOffCommand implements Command {
//        private Device device;
//
//        public TurnOffCommand(Device device) {
//            this.device = device;
//        }
//
//        @Override
//        public void execute() {
//            device.turnOff();
//        }
//    }
}
