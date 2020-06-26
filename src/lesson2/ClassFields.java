package lesson2;

public class ClassFields {
    public static void main(String[] args) {
//         System.out.println(a); // нет доступа без экземпляра класса
//         System.out.println(o); // нет доступа без экземпляра класса
        // print(); // нет доступа

        MyClass mc = new MyClass();
        System.out.println(mc.a); // теперь есть
        System.out.println(mc.o); // теперь есть
        System.out.println(); // просто перенос строки
        mc.print(); // теперь есть

        MyClass mc2 = new MyClass();
        System.out.println("mc: " + mc.o);
        System.out.println("mc2: " + mc2.o);
    }
}

class MyClass {
    int a = 0;
    public int print() {
        System.out.println("внутри MyClass " + a); // есть доступ
        System.out.println("внутри MyClass " + o + "\n"); // есть доступ ("\n" - символ переноса строки)
        a = 20;
        if (a != 0)
            return 5;
        else {
            System.out.println("что то еще");
            return 1;
        }
    }

    public static void main(String args) {
//         System.out.println(a); // нет доступа из статического метода
//         System.out.println(o); // нет доступа из статического метода
    }

//    public int a = 5;
    public Object o = new Object();
}
