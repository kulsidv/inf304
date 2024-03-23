package Exam01;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("schedule.txt"));
        try {
            List<String> channels = new LinkedList<>();
            List<Program> programs = new LinkedList<>();
            String channelLine = "";
            String timeLine = "";
            String titleLine = "";
            while (reader.hasNext()) {
                String line = reader.next();
                if (line.charAt(0) == '#') channels.add(channelLine);
                if ((int)line.charAt(0) < 10) timeLine = line;
                titleLine = line;
                programs.add(new Program(channelLine, timeLine, titleLine));
            }
            List<String> list = Files.readAllLines(new File("schedule.txt").toPath(), Charset.defaultCharset());
            System.out.println(programs.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}
