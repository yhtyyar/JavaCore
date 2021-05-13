package main.java.com.yhtyyar.javacore.chapter20.file;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {

    public static void main(String [] args) {

        String dirName = "/file";

        File file = new File(dirName);

        FilenameFilter only = new OnlyExt("html");
        String [] s = file.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
