import java.net.InetAddress;

public class App {
    public static void main(String[] args) throws Exception {
        InetAddress inet = InetAddress.getByName("www.ubru.ac.th");
        System.out.println(inet.getHostName());
        System.out.println(inet.getHostAddress());
    }
}
