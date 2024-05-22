package Exam02;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13");
        File[] files = folder.listFiles();

        for (int i = 0; i < files.length; i++) {
            MyReader reader = new MyReader(files[i]);
            reader.start();
        }
    }
}
