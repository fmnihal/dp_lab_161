package Facade;

public class Main {
    public static void main(String[] args){
        NotifHandler notifHandler = new NotifHandler();

        notifHandler.sendNotifTwitter();
        notifHandler.sendNotifFacebook();
        notifHandler.sendNotifLinkedIn();
        notifHandler.sendNotifInstagram();

        notifHandler.markAsReadTwitter();
        notifHandler.markAsReadFacebook();
        notifHandler.markAsReadLinkedIn();
        notifHandler.markAsReadInstagram();

        notifHandler.markAsUnreadTwitter();
        notifHandler.markAsUnreadFacebook();
        notifHandler.markAsUnreadLinkedIn();
        notifHandler.markAsUnreadInstagram();

        notifHandler.deleteNotifTwitter();
        notifHandler.deleteNotifFacebook();
        notifHandler.deleteNotifLinkedIn();
        notifHandler.deleteNotifInstagram();
    }
}
