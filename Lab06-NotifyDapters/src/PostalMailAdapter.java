public class PostalMailAdapter implements INotify {
    private ThirdPartyPostalMail thirdPartyPostalMail;  // Hold a reference to the third-party postal mail service

    // Constructor that takes a ThirdPartyPostalMail instance
    public PostalMailAdapter(ThirdPartyPostalMail thirdPartyPostalMail) {
        this.thirdPartyPostalMail = thirdPartyPostalMail;  // Initialize it with the third-party service
    }

    @Override
    public void sendNotif(String receiver, String message) {
        // Adapting the interface: map the single receiver into multiple required parameters
        String address = "123 Street";  // In a real system, fetch this dynamically
        String postalCode = "12345";    // In a real system, fetch this dynamically
        thirdPartyPostalMail.sendPostalMail(receiver, address, postalCode, message);  // Call third-party method
    }
}



