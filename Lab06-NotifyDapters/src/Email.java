public class Email implements INotify{
    @Override
    public void sendNotif(String receiver, String message) {
        System.out.println("E-mail sent to: "+receiver+": "+message);
    }
}
