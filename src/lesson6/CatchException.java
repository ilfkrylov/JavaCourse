package lesson6;

public class CatchException {
    public static void main(String[] args) {
        System.out.println("Program starts");

        try {
            System.out.println("Before method1 calling");
            m2();
            System.out.println("After method1 calling. Never will be shown");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Program is still running");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }

    public static void m2() {
        method1();
    }
}
