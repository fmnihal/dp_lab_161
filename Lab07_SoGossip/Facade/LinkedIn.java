package Facade;

public class LinkedIn implements Notif{
    @Override
    public void sendNotif() {
        System.out.println("LinkedIn Notification sent");
    }

    @Override
    public void markAsRead() {
        System.out.println("LinkedIn Notification marked as read");
    }

    @Override
    public void markAsUnread() {
        System.out.println("LinkedIn Notification mark as unread");
    }

    @Override
    public void deleteNotif() {
        System.out.println("LinkedIn Notification deleted");
    }
}
