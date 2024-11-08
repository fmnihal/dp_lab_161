public class NotificationService {
    private INotify inotify;

    public NotificationService(INotify inotify) {
        this.inotify = inotify;
    }

    public void sendNotification(String receiver, String message) {
        inotify.sendNotif(receiver, message);
    }
}

