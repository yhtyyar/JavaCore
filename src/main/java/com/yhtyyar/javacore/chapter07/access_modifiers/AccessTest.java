package main.java.com.yhtyyar.javacore.chapter07.access_modifiers;

public class AccessTest {

    public static void main(String [] args) {

        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

      //  ob.c = 15;   // нельзя вызвать "с" потому что у него модификатор доступа private

        ob.setc(100);
        System.out.println("a,b и c: " + ob.a + " " + ob.b + " и " + ob.getc());
    }
}
