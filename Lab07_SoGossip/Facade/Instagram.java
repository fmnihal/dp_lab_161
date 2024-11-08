package Facade;

public class Instagram implements Notif{
    @Override
    public void sendNotif() {
        System.out.println("Insta Notification sent");
    }

    @Override
    public void markAsRead() {
        System.out.println("Insta Notification marked as read");
    }

    @Override
    public void markAsUnread() {
        System.out.println("Insta Notification marked as unread");
    }

    @Override
    public void deleteNotif() {
        System.out.println("Insta Notification deleted");
    }
}
