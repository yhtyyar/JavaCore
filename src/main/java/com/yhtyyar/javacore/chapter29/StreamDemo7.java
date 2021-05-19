package main.java.com.yhtyyar.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {

    public static void main(String [] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Ларри",
                "555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джеймс",
                "555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри",
                "555-3333","Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                                               (a) -> new NamePhone(a.name, a.phone));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List: ");
        for (NamePhone e : npList) {
            System.out.println(e.name + ": " + e.phone);
        }

        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phone));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set: ");
        for (NamePhone e : npSet) {
            System.out.println(e.name + ": " + e.phone);
        }
    }
}


