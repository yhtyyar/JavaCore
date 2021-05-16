package main.java.com.yhtyyar.javacore.practic.problems;

public class Cinema {


    /*
    There is not a lot of space in our new cinema theatre, so you need to take into account
    the restrictions on the number of seats. Your friends said that the room would fit 7 rows of 8 seats.
    Your task is to help them visualize the seating arrangement by printing the scheme to the console.

    Your output should be like in the example below and should contain 9 lines.

    Cinema:
     1 2 3 4 5 6 7 8
   1 S S S S S S S S
   2 S S S S S S S S
   3 S S S S S S S S
   4 S S S S S S S S
   5 S S S S S S S S
   6 S S S S S S S S
   7 S S S S S S S S
     */


    public static void main(String[] args) {


        System.out.println("Cinema:");

        final char [] [] field  = new char [7][8];

        System.out.println("  1 2 3 4 5 6 7 8");
        for(int i = 0; i < 7; i++) {
            System.out.print(i + 1 + " ");
            for(int j = 0; j < 8; j++) {
                field[i][j] = 'S';
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }
}
