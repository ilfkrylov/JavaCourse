package lesson1;

public class Примитивы {
    /* Целые числа */
    byte b;     // 8 бит: от -128 до 127
    short s;    // 16 бит: от -32768 до 32767
    int i;      // 32 бит: от -2147483648 до 2147483647
    long l;     // 64 бит: от -9223372036854775808L до 9223372036854775807L

    /* Символьный */
    char c; // беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)

    /* Логический */
    static boolean bol;

    /* Числа с плавающей точкой */
    float f;    // 32 бит: от 1.4e-45f до 3.4e+38f
    double d;   // 64 бит: от 4.9e-324 до 1.7e+308

    public static void main(String[] args) {
        byte b = 120;
         //byte b2 = 216; // - ошибка, код не скомпилируется
        short s = 12345;
        int i = 1234567890;
        long l = 987654320000L;

        присваивание();

        значениеПоУмолчанию();

        printChar();
    }

    private static void значениеПоУмолчанию() {
        /* Значение по умолчанию для целых */
        int i; // = 0
        /* Значение по умолчанию для чисел с плавающей точкой */
        double d; // = 0.0
        /* Значение по умолчанию для логических */
        boolean b; // = false
    }

    private static void присваивание() {
        int i = 123;
        long l = i;     // можно положить меньшее число в бОльшую область памяти
         // int i2 = l;  // но нельзя наоборот (ошибка компиляции)

        float f = i;
        f = l;
        double d = f;
    }

    private static void printChar() {
        char c0 = 75;
        char c1 = 76;
        char c2 = 77;
        char c3 = 78;
        System.out.println("Символьный (char):");
        System.out.print(c0);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
    }

}
