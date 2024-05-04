package IOStream;

import Map.Map;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MyFile file1 = new MyFile("src/IOStream/File1.txt");
        MyFile file2 = new MyFile("src/IOStream/File2.txt");
        MyFile file3 = new MyFile("src/IOStream/File3.txt");

        file1.merge(file2, file3);
        file3.counting();
        MyFile file4 = MyFile.createFile();
    }
}
