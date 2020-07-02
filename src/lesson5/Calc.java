package lesson5;

public class Calc {

    public static void print(int n) {
        System.out.println("int " + n);
    }

    public static void print(short n) {
        System.out.println("short " + n);
    }

    public static void print(Integer n) {
        System.out.println("Integer " + n);
    }

    public static void print(String s) {
        System.out.println("String " + s);
    }

    public static void main(String[] args) {
        Calc.print(1); // полностью совпадает
        Calc.print((byte) 1); // byte сначала будет расширен до short, а уж затем расширен до int
        Calc.print("1"); // полностью совпадает
        // Calc.print(null); // не скомпилируется - у null нет типа
        Calc.print((Integer)null); // так можно
    }
}
