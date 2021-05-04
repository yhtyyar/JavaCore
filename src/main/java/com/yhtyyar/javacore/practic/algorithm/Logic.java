package main.java.com.yhtyyar.javacore.practic.algorithm;

import java.util.*;

public class Logic {

    public boolean isValid(String s) {

        HashMap <Character, Character> closeBracket = new HashMap <Character, Character>();
        closeBracket.put('{', '}');
        closeBracket.put('(', ')');
        closeBracket.put('[', ']');


        HashSet <Character> openBracket = new HashSet <Character>(closeBracket.values());
        ArrayDeque <Character> arrayDeque = new ArrayDeque <Character>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char array = chars[i];
            if (openBracket.contains(array)) {
                arrayDeque.push(array);
            } else { // закрывающие скобки
                if (arrayDeque.isEmpty()) {
                    return false;
                }
                if (closeBracket.get(array) != arrayDeque.peek()) {
                    return false;
                }
                arrayDeque.pop();
            }
        }

        return arrayDeque.isEmpty();
    }
}
