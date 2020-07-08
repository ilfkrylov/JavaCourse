package lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {

    public static void main(String[] args) {
        System.out.println("program start");
        method1();
        System.out.println("program end");
    }

    static void method1() {
//         readFile();
    }

    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("C2:\badFileName.txt");
    }
}
