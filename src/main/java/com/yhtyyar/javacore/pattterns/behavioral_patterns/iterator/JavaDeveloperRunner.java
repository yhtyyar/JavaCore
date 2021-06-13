package main.java.com.yhtyyar.javacore.pattterns.behavioral_patterns.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {

        String [] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Yhtyyar Kadyrov", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
