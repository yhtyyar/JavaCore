package main.java.com.yhtyyar.javacore.chapter13;

public class InstanceOf {

    public static void main(String [] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A) {
            System.out.println("a является экземпляром А");
        }
        if (b instanceof B) {
            System.out.println("b является экземпляром B");
        }
        if (c instanceof C) {
            System.out.println("c является экземпляром C");
        }
        if (c instanceof A) {
            System.out.println("c является экземпляром А");
        }
        if (a instanceof C) {
            System.out.println("a является экземпляром C");
        }

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob теперь ссылается на d");

        if (ob instanceof D) {
            System.out.println("оb является экземпляром D");
        }

        System.out.println();

        ob = c;
        System.out.println("ob теперь ссыдается на с");

        if(ob instanceof D) {
            System.out.println("ob можно привести к типу D");
        } else {
            System.out.println("ob нельзя привести к типу D");
        }

        if(ob instanceof A) {
            System.out.println("ob можно привести к типу А");
        }

        System.out.println();

        if(a instanceof Object) {
            System.out.println("a можно привести к типу Object");
        }
        if(b instanceof Object) {
            System.out.println("b можно привести к типу Object");
        }
        if(c instanceof Object) {
            System.out.println("c можно привести к типу Object");
        }
        if(d instanceof Object) {
            System.out.println("d можно привести к типу Object");
        }

    }
}

class A{
    int i,j;
}

class B {
    int i,j;
}

class C extends A {
    int k;
}
class D extends A {
    int k;
}
