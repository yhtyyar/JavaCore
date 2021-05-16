package main.java.com.yhtyyar.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main (String [] args) {


        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Ларри",
                "555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джеймс",
                "555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри",
                "555-3333","Mary@HerbSchildt.com"));

        System.out.println("Исходные элементы из списка myList: " );
        myList.stream().forEach( (a) ->
                System.out.println(a.name + " " + a.phone + " " + a.eMail));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                                                (a) -> new NamePhone(a.name,a.phone));


        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach( (a) -> System.out.println(a.name + " " + a.phone));
    }
}

class NamePhoneEmail {

    String name;
    String phone;
    String eMail;

    NamePhoneEmail(String name, String phone, String eMail) {

        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }
}

class NamePhone {

    String name;
    String phone;

    NamePhone(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }
}