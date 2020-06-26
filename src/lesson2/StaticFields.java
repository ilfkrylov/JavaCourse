package lesson2;

public class StaticFields {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        System.out.println(d2.count);
        d1.addCount();
        System.out.println(d2.count);
    }
}

class Dog {
    static int count = 0; // статическая переменная (общая для всех Cat)

    int age; // переменная  класса (для каждого нового Cat своя)
    String name; // переменная  класса (для каждого нового Cat своя)

    void printCount() {
        System.out.println(count);
    }

    void addCount() {
        count = count + 1;
    }
}
