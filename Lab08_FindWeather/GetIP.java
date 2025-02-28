import java.net.*;
public class GetIP {
    public GetIP() throws UnknownHostException {
        String ipify = "https://api.ipify.org/";
        try {
            InetAddress ip = InetAddress.getByName(new URL(ipify).getHost());
            System.out.println(ip);
        } catch (MalformedURLException e) {
            System.out.println("The URL is invalid");
        }
    }
}