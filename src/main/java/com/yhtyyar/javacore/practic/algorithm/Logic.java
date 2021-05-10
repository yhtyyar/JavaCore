package main.java.com.yhtyyar.javacore.practic.algorithm;

import java.util.*;

public class Logic {

    static  String text;

    public static void main(String [] args) {

        final Scanner input = new Scanner(System.in);

        System.out.println("Введите текст: ");
        text = input.nextLine();

        isValid(text);

        if (isValid(text) == true) {
            System.out.println(" Всё правильно! ");
        } else {
            System.out.println("Закройте не закрытые скобки!");
        }
    }



    public static boolean isValid (String string) {

        HashMap <Character, Character> closeBracket = new HashMap <>();
        closeBracket.put('}', '{');  // ключь и значение
        closeBracket.put(')', '(');
        closeBracket.put(']', '[');


        HashSet <Character> openBracket = new HashSet <>(closeBracket.values()); // передаем значения
        ArrayDeque <Character> arrayDeque = new ArrayDeque <>();

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char array = chars [i];

            // проверка на присутсвие значения и возвращает true, если там есть все эелементы
            if (openBracket.contains(array)) {
                arrayDeque.push(array); // добавляет элемент в самое начало
            } else {
                if (arrayDeque.isEmpty()) {
                    return false;
                }
                if (arrayDeque.peek() != closeBracket.get(array) ) {
                    return false;
                }
                arrayDeque.poll(); // возвращает с удалением элемента из начала очереди
            }
        }

        return arrayDeque.isEmpty(); // возвращает true если пустая строка, если нет то false
    }
}
