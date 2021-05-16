package main.java.com.yhtyyar.javacore.chapter22.inet_adress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    public static void main(String [] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress SW [] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
