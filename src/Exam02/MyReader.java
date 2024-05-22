package Exam02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyReader extends Thread{
    File file;
    MyReader(File file) {
        this.file = file;
    }
    int k; // размер в байтах строки с данными в формате UTF-8
    String s; // строка с данными
    int d; // контрольное число - количество символов в строке с данными
    int p; // номер части

    @Override
    public void run() {
        try {
            System.out.println(checking(this.file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean checking(File file) throws FileNotFoundException {
        try(DataInputStream reader = new DataInputStream(new FileInputStream(file));
            DataOutputStream writer = new DataOutputStream(new FileOutputStream(
                "C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13.log"));
            DataOutputStream merger = new DataOutputStream(new FileOutputStream(
                    "C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13.txt"))) {
            k = reader.readInt();
            byte[] buffer = new byte[k];
            reader.read(buffer);
            d = reader.readInt();
            p = reader.readInt();
            s = new String(buffer, StandardCharsets.UTF_8);
            reader.close();
            String message = "прочитали файл" + file + "\nкол-во байт данных: " + k + ",\n" + "кол-во считанных символов:" + s.length() + ",\nконтрольное число: " + d + ",\nномер части: " + p;
            writer.write(message.getBytes(StandardCharsets.UTF_8));
            writer.close();
            merger.write(s.getBytes(StandardCharsets.UTF_8));
            merger.close();
            if (s.length() == d) return true;
        } catch (IOException e) {
            System.out.println("ошибка");
        }
        return false;
    }
}
