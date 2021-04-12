package main.java.com.yhtyyar.javacore.chapter05.selection_operators;

public class IfElse {

    public static void main(String [] args) {

        int month = 5;  //May

        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        }else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        }else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        }else if (month == 9 || month == 10 || month == 11) {
            season = "autumn";
        }else {
            season = "fictional month ";
        }

        System.out.println(" May refers to " + season + ".");

    }
}
