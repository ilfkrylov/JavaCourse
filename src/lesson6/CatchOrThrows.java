package lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CatchOrThrows {

    // пробрасываем исключение
    public static void methodThrowsException() throws ClassCastException{
        try {
            framework();
        } catch (FileNotFoundException e) {
            //
        }
    }

    // ловим исключение
    public static void methodCatchException() {
        try {
            methodThrowsException();
        } catch (ClassCastException e1) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        methodCatchException();
    }




    public static void framework() throws FileNotFoundException, ClassCastException {
         FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
    }
}
