package ru.geekbrains.java_1.lesson_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork6 {

    private static final String fNameIn1 = "d:/java/filein1.txt";
    private static final String fNameIn2 = "d:/java/filein2.txt";
    private static final String fNameOut = "d:/java/fileout.txt";
    private static final String findPath = "d:/java/find_dir/";
    private static final String word = "geekbrains";
    private static final int filesLength = 100;

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(fNameIn1);
            for (int i = 0; i < filesLength; i++) fos.write('X');
            fos.flush();
            fos.close();
            fos = new FileOutputStream(fNameIn2);
            for (int i = 0; i < filesLength; i++) fos.write('O');
            fos.flush();
            fos.close();
            concatFiles(fNameIn1, fNameIn2, fNameOut);
            long start_time = System.nanoTime();
            printAllFilesContentWord(findPath, word);
            System.out.println("Затраченное время " + (System.nanoTime() -
                    start_time) * 0.000001f + " мсек");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void concatFiles(String fNameIn1, String fNameIn2,
                                    String fNameOut) throws IOException {
        FileInputStream fis = new FileInputStream(fNameIn1);
        FileOutputStream fos = new FileOutputStream(fNameOut);
        int b;
        while ((b = fis.read()) != -1) fos.write(b);
        fis.close();
        fis = new FileInputStream(fNameIn2);
        while ((b = fis.read()) != -1) fos.write(b);
        fis.close();
        fos.flush();
        fos.close();
    }

    private static void printAllFilesContentWord(String path, String word)
        throws IOException {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNext()) {
                if(scanner.next().equals(word)) {
                    System.out.println(file.getName());
                    break;
                }
            }
            scanner.close();
        }
    }
}
