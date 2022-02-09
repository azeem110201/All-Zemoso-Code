import java.io.IOException;
import java.net.InetAddress;

public class CalculateMedianHostPing {
    public static void getMedianHostPingTime(String HostIPAddress) throws IOException {
        long start=System.currentTimeMillis();

        InetAddress giveAddress=InetAddress.getByName(HostIPAddress);   // This method returns the instance of InetAddress containing LocalHost IP and name.

        System.out.println("Canonical host name for the given IP Address:" + giveAddress.getCanonicalHostName());   // This method returns the fully qualified domain name for this IP address.
        System.out.println("Get the host name for the given IP Address:" + giveAddress.getHostAddress());  //This method returns the host name for this IP address.

        System.out.println("Sending Ping request to host "+ HostIPAddress +".......");
        if(giveAddress.isReachable(10000)){  // isReachable tries to reach that host for that particular amount of time specified.
            System.out.println("Host is reachable.");
        }
        else{
            System.out.println("Host is not reachable. Please try again.");
            return;
        }
        long end=System.currentTimeMillis();
        long time=(end-start)>>1;

        System.out.println("Median time in milliseconds:" + time);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("For LocalHost............");
        getMedianHostPingTime("127.0.0.1");

        System.out.println("For Google............");
        getMedianHostPingTime("google.com");

        System.out.println("For Zemoso............");
        getMedianHostPingTime("zemosolabs.com");
    }
}
