package Facade;

public class Twitter implements Notif{

    @Override
    public void sendNotif() {
        System.out.println("Twitter Notification sent");
    }

    @Override
    public void markAsRead() {
        System.out.println("Twitter Notification marked as read");
    }

    @Override
    public void markAsUnread() {
        System.out.println("Twitter Notification marked as unread");
    }

    @Override
    public void deleteNotif() {
        System.out.println("Twitter Notification deleted");
    }
}
