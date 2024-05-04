import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class MyFileTest {
    MyFile file1;
    MyFile file2;
    MyFile file3;
    @Before
//    public void setup() {
//        MyFile file1 = MyFile.createFile("File1.txt", "Hello");
//        MyFile file2 = MyFile.createFile("File2.txt", ", world!!!");
//        MyFile file3 = MyFile.createFile("File3.txt", "");
//    }

    @Test
    public void mergeTest() throws FileNotFoundException {
        MyFile file1 = MyFile.createFile("File1.txt", "Hello");
        MyFile file2 = MyFile.createFile("File2.txt", ", world!!!");
        MyFile file3 = MyFile.createFile("File3.txt", "");
        String actual = "Hello, world!!!";
        file1.merge(file2, file3);
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file3.file))) {
            StringBuilder sb = new StringBuilder();
            while(reader.available() != 0) {
                sb.append((char)reader.read());
            }
            String expected = sb.toString();
            Assert.assertEquals(expected, actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
