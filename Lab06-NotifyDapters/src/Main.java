
public class Main {
    public static void main(String[] args) {
        // Sending Email
        INotify email = new Email();
        NotificationService emailService = new NotificationService(email);
        emailService.sendNotification("user@example.com", "Your email message!");

        // Sending SMS
        INotify sms = new SMS();
        NotificationService smsService = new NotificationService(sms);
        smsService.sendNotification("+1234567890", "Your SMS message!");

        // Sending Postal Mail (using Adapter)
//        PostalMailAdapter postalMailService = new PostalMailAdapter();
//        INotify postalMailAdapter = new PostalMailAdapter(postalMailService);
//        NotificationService postalMailServiceObj = new NotificationService(postalMailAdapter);
//        postalMailServiceObj.sendNotification("John Doe", "Your postal mail message!");

        ThirdPartyPostalMail thirdPartyPostalMailService = new ThirdPartyPostalMail();  // Initialize the third-party service
        INotify postalMailAdapter = new PostalMailAdapter(thirdPartyPostalMailService); // Use adapter with third-party postal mail
        NotificationService postalMailServiceObj = new NotificationService(postalMailAdapter);
        postalMailServiceObj.sendNotification("John Doe", "Your postal mail message!");
    }
}
