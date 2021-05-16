package main.java.com.yhtyyar.javacore.practic.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestList {

    /*
       You have a guest list of the people who registered their stay at the hotel.
    There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests.
    The guest list consists of 4 lines. Each line contains the name
    or the names of the guests registered together in one room.

      Read the names of the registered guests from the list and output each
    name in a separate line and in reverse order starting with the last registered guest.
    Note that the order of the guests registered in each room is undefined.

    Sample Input 1:

    Jane Kate
    John
    Mary Susan Paul
    Boris Ann

     Sample Output 1:

     Ann
     Boris
     Paul
     Susan
     Mary
     John
     Kate
     Jane

     */




    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 8; i++ ) {
            arrayList.add(scan.next());
        }

        for (int i = 7; i > -1; i--) {
            System.out.println(arrayList.get(i));
        }

        // put your code here



    }
}
