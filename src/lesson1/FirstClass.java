// пакет
package lesson1;

/**
 * javadoc
 */

/*
многострочный
комментарий
 */

// класс - это шаблон для объекта
public class FirstClass {


    // поле или переменная класса определяют состояние
    String s;

    // методы класса определяют поведение
    public static String main(String args) {
        return "Просто метод";
    }

    public static void printSomeInfo(String arg, int num) {
        System.out.println(num + num + arg + num + num);
    }

    public static String returnString(String arg, int num) {
        String result = num + num + arg + num + num;
        return result;
    }

    public static void main(String[] args) {

//        FirstClass экземплярКлассаFirstClass = new FirstClass();
//
//        // объект
//        System.out.println(экземплярКлассаFirstClass.s);
//
//
//        // объявление переменной
        String s = "новая строка";
//
//        // вызов метода
         printSomeInfo(s, 3);
    }
}
