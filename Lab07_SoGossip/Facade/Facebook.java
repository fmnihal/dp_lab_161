package Facade;

public class Facebook implements Notif{

    @Override
    public void sendNotif() {
        System.out.println("Facebook Notification sent");
    }

    @Override
    public void markAsRead() {
        System.out.println("Facebook Notification marked as read");
    }

    @Override
    public void markAsUnread() {
        System.out.println("Facebook Notification marked as unread");
    }

    @Override
    public void deleteNotif() {
        System.out.println("Facebook Notification deleted");
    }
}
