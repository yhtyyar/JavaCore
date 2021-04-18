package main.java.com.yhtyyar.javacore.chapter09.Packages.MyPack;

public class AccountBalance {

    public static void main(String [] args) {

        Balance current[] = new Balance[3];

        current[0] = new Balance("K.J. Fielding", 123.5);
        current[1] = new Balance("Will Tell", 157.1);
        current[2] = new Balance("Tom Jackson", - 12.35);

        for (int i = 0; i < current.length; i++)
            current[i].show();
    }
}
