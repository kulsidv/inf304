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
    public static MyFile createFile(String fileName,String message) {
        MyFile file = new MyFile(fileName);
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file.file))) {
            byte[] buffer = message.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
            out.close();
        } catch (IOException e) {}
        return file;
    }
}

