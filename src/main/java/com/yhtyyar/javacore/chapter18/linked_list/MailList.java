package main.java.com.yhtyyar.javacore.chapter18.linked_list;

import java.util.LinkedList;

public class MailList {

    public static  void main(String [] args) {

        LinkedList <Address> linkedList = new LinkedList<>();

        linkedList.add(new Address("J.W.West","11 Oak Ave","Urbana",
                                      "IL","61801"));
        linkedList.add(new Address("Ralph Baker","1142 Maple Lane","Mahomet",
                                     "IL","61853"));
        linkedList.add(new Address("Tom Carlton", "867 Elm St", "Champaign",
                                     "IL","61820"));

        for(Address element : linkedList)
            System.out.println(element + "\n");

        System.out.println();
    }
}
