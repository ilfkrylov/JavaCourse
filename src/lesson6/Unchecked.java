package lesson6;

public class Unchecked {

    public static void main(String[] args) {
        System.out.println("program start");
         method1();
//        method2();
        System.out.println("program end");
    }

    static void method1() {
        try {
            byZero();
        } catch (ArithmeticException e) {
            throw new RuntimeException("на 0 делить нельзя", e);
        }
    }

    static void byZero() {
        int a = 2;
        int b = 0;
        System.out.println(a / 0);
    }

    static void method2() {
        try {
            infinity();
        } catch (StackOverflowError s) {
            s.printStackTrace();
        }
    }

    static void infinity() {
        infinity();
    }
}
