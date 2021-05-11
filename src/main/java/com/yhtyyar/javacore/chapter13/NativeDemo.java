package main.java.com.yhtyyar.javacore.chapter13;

public class NativeDemo {

    int i;
    public static void main(String [] args) {

        NativeDemo ob = new NativeDemo();

        ob.i = 10;

        System.out.println("Содержимое переменной ob.i перед вызовом " +
                "платформенно-ориентированного метода: " + ob.i);

        ob.test();
        System.out.println("Содержимое переменной ob.i после вызова " +
                "платформенно-ориентированного метода: " + ob.i);
    }

    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
