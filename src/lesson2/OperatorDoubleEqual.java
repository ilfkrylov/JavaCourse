package lesson2;

public class OperatorDoubleEqual {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);

        Cat cat1 = new Cat("Vaska");
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);

        String s = new String("Mama");
        String s2 = s;
        System.out.println(s == s2);

        Cat cat3 = new Cat("Vaska");
        Cat cat4 = new Cat("Vaska");
        System.out.println(cat3 == cat4);

        String s3 = new String("Mama");
        String s4 = new String("Mama");
        System.out.println(s3 == s4);

        Cat cat5 = new Cat("Vaska");
        Cat cat6 = new Cat("Vaska");
        System.out.println(cat5.equals(cat6));

        String s5 = new String("Mama");
        String s6 = new String("Mama");
        System.out.println(s5.equals(s6));
    }
}

class Cat {
    public String name;

    public Cat(String n) {
        name = n;
    }

    public boolean equals(Cat otherCat){
        return name.equals(otherCat.name);
    }
}
