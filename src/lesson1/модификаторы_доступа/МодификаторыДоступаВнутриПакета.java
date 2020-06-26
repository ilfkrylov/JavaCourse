package lesson1.модификаторы_доступа;

public class МодификаторыДоступаВнутриПакета {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        String name1 = publicClass.name;

        PackageClass packageClass = new PackageClass();
        String name2 = packageClass.name;

        PrivateClass privateClass = new PrivateClass();
        // String name3 = privateClass.name; // нет доступа
    }
}
