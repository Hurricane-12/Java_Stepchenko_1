package ru.geekbrains.java_1.lesson_6;

import java.io.*;
import java.util.Scanner;

public class InputOutput {

    private static final String fName = "d:\\java\\out.txt";

    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream(fName, true);
            out.write("Hello world\n qqq".getBytes());
            out.flush();
            out.close();

            Scanner in = new Scanner(new FileInputStream(fName));
//            InputStream in = new FileInputStream(fName);
//            int b;
//            while((b = in.read()) != -1 )
//                System.out.print((char)b);
            while(in.hasNextLine())
                System.out.println(in.nextLine());
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
