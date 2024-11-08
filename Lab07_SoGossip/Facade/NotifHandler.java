package Facade;

public class NotifHandler {
    private Twitter twt;
    private Facebook fb;
    private LinkedIn in;
    private Instagram ig;

    public NotifHandler(){
        twt = new Twitter();
        fb = new Facebook();
        in = new LinkedIn();
        ig = new Instagram();
    }

    public void sendNotifTwitter(){
        twt.sendNotif();
    }
    public void sendNotifFacebook(){
        fb.sendNotif();
    }
    public void sendNotifLinkedIn(){
        in.sendNotif();
    }
    public void sendNotifInstagram(){
        ig.sendNotif();
    }

    public void markAsReadTwitter(){
        twt.markAsRead();
    }
    public void markAsReadFacebook(){
        fb.markAsRead();
    }
    public void markAsReadLinkedIn(){
        in.markAsRead();
    }
    public void markAsReadInstagram(){
        ig.markAsRead();
    }

    public void markAsUnreadTwitter(){
        twt.markAsUnread();
    }
    public void markAsUnreadFacebook(){
        fb.markAsUnread();
    }
    public void markAsUnreadLinkedIn(){
        in.markAsUnread();
    }
    public void markAsUnreadInstagram(){
        ig.markAsUnread();
    }

    public void deleteNotifTwitter(){
        twt.deleteNotif();
    }
    public void deleteNotifFacebook(){
        fb.deleteNotif();
    }
    public void deleteNotifLinkedIn(){
        in.deleteNotif();
    }
    public void deleteNotifInstagram(){
        ig.deleteNotif();
    }

}
