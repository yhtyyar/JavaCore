package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class InstanceMethWithObjectRefDemo {

    static <T> int counter (T [] vals, MyFunc<T> f, T v) {

        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i],v )){
                count++;
            }
        }
        return count;
    }

    public static  void main(String [] args) {

        int count;

        HighTemp [] weekDayHighs = { new HighTemp(31), new HighTemp(27),
                                     new HighTemp(32), new HighTemp(31),
                                     new HighTemp(31), new HighTemp(33),
                                     new HighTemp(29), new HighTemp(28)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(31));
        System.out.println("Дней когда максимальная температура была 31: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(31));
        System.out.println("Дней когда максимальная температура была меньше чем 31: " + count);

        HighTemp [] weekDayHighs2 = {new HighTemp(0), new HighTemp(-11),
                                     new HighTemp(-4), new HighTemp(-7),
                                     new HighTemp(-8), new HighTemp(-11),
                                     new HighTemp(-18), new HighTemp(-10)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(-11));
        System.out.println("Дней когда максимальная температура была -11: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(-7));
        System.out.println("Дней когда максимальная температура была меньше чем -7: " + count);


    }
}
