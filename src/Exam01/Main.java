package Exam01;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        try (Scanner reader = new Scanner(new File("schedule.txt"))) {
            List<String> channels = new LinkedList<>();
            List<Program> programs = new LinkedList<>();
            String channelLine = "";
            String timeLine = "";
            String titleLine = "";
            int k = 0;
            while (reader.hasNext()) {
                switch (k) {
                    case 0: {
                        channelLine = reader.next();
                        channels.add(channelLine);
                        break;
                    }
                    case 1: {
                        timeLine = reader.next();
                        break;
                    }
                    case 2: {
                        titleLine = reader.next();
                        programs.add(new Program(channelLine, timeLine, titleLine));
                        k = 0;
                        break;
                    }
                }
                k++;
            }
            System.out.println(programs.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
