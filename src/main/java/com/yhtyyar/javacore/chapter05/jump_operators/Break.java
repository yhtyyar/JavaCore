package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class Break {

    public static void main(String [] args) {

        boolean t = true;

        first: {
            second: {
               third: {
                System.out.println(" Предшествует оператору break. ");
                if (t) break second; // это выход из блока second
                   System.out.println("Этот оператор не будет выполняться");
            }
                System.out.println("Этот оператор следует до блоока third");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
