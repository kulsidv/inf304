package IOStream;

import Map.Map;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Scanner;

public class MyFile {
    File file;

    MyFile(String pathname) {
        this.file = new File(pathname);
    }

    //Написать программу, объединяющую 2 файла в один
    public void merge(MyFile file2, MyFile file3) throws FileNotFoundException {
        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file3.file));
             BufferedInputStream input1 = new BufferedInputStream(new FileInputStream(this.file));
             BufferedInputStream input2 = new BufferedInputStream(new FileInputStream(file2.file))) {
            while (input1.available() != 0) {
                output.write(input1.read());
            }
            while (input2.available() != 0) {
                output.write(input2.read());
            }
            input1.close();
            input2.close();
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Прочитать файл по-символьно, и вывести талицу: буква - количество вхождений
    public void counting() throws FileNotFoundException {
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(this.file))) {
            Map<Integer, Integer> map = new Map<Integer, Integer>();
            while (input.available() != 0) {
                int a = input.read();
                if (map.containsKey(a)) {
                    int prevCount = map.get(a);
                    map.put(a, prevCount + 1);
                } else map.put(a, 1);
            }
            Iterator<Integer> iteratorKeys = map.keySet().iterator();
            Iterator<Integer> iteratorValues = map.values().iterator();
            while (iteratorKeys.hasNext()) {
                int ch = iteratorKeys.next();
                System.out.print((char)ch + " : ");
                System.out.println(iteratorValues.next());
            }
        } catch (IOException e) {}
    }

    //создать файл в формате:
    //1-е 4 байта - число N (длина сообщения в байтах)
    //следующие N байтов - сообщение
    public static MyFile createFile() {
        MyFile file = new MyFile("src/IOStream/File4.txt");
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file.file))) {
            System.out.println("Введите сообщение");
            Scanner in = new Scanner(System.in);
            String message = in.nextLine();
            byte[] buffer = message.getBytes(StandardCharsets.UTF_8);
            out.writeInt(buffer.length);
            out.write(buffer);
            out.close();
        } catch (IOException e) {}
        length(file);
        return file;
    }

    public static void length(MyFile file) {
        try(DataInputStream input = new DataInputStream(new FileInputStream(file.file))) {
            int len = input.readInt();
            while (input.available() != 0) {
                System.out.print((char)input.read());
            }
            System.out.println();
            System.out.println(len);
        } catch (IOException e) {}
    }
}
