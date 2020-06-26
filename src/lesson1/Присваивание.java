package lesson1;

import lesson1.Ссылочные.Cat;

public class Присваивание {
    public static void main(String[] args) {

        String имяПеременнойString;
        Cat имяПеременнойКота; // null

        Cat cat = new Cat("Васька"); // создали объект
        // cat.name // "Васька"
        // cat.age 0

        System.out.println(cat.name);

//        noChangeCatName(cat.name); // передаем в метод переменную name тип String  ...
//        System.out.println(cat.name);

        changeCatName(cat);
        System.out.println(cat.name);
    }

    private static void noChangeCatName(String catName) { // ...
        System.out.println("внутри метода: " + catName);
        catName = "Барс";
        System.out.println("после изменения: " + catName);
    }

    private static void changeCatName(Cat aCat) {
        System.out.println("внутри метода: " + aCat.name);
        aCat.setName("Барс");
        System.out.println("после изменения: " + aCat.name);
    }
}
