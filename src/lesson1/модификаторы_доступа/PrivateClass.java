package lesson1.модификаторы_доступа;

public class PrivateClass {
    private static String name = "имя";
    private static int age = 5;

    public static void main(String[] args) {
        System.out.println(getString(getAge()));
    }

    public static String getString(int a) {
        System.out.println("выполнен метод getString");
        return name + a;
    }

    private static int getAge() {
        System.out.println("выполнен метод getAge");
        return age;
    }
}
