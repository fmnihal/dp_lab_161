public class SMS implements INotify{
    @Override
    public void sendNotif(String receiver, String message) {
        System.out.println("SMS sent to: "+receiver+": "+message);
    }
}
