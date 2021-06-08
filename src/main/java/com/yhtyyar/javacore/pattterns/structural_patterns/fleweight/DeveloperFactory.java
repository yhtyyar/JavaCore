package main.java.com.yhtyyar.javacore.pattterns.structural_patterns.fleweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {

            switch (specialty) {

                case "java":
                    System.out.println("Hiring Java developer....");
                    developer = new JavaDeveloper();
                    break;

                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;

                default:
                    System.out.println("Wrong specialty");
                    break;
            }
            developers.put(specialty, developer);
        }

        return developer;
    }
}
