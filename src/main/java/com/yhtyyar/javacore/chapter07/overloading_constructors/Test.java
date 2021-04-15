package main.java.com.yhtyyar.javacore.chapter07.overloading_constructors;

public class Test {

    int a,b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    Test () {}  // просто конструктор, чтобы не было ошибок

    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test (a + 10);
        return temp;
    }

    boolean equals (Test o) {       // проверка на рвенство значений объектов
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

    void meth (int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth (Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
