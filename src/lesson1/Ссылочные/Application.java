package lesson1.Ссылочные;

public class Application {
    public static void main(String[] args) {
        Person person; // Создали переменную person, её значение null
        person = new Person(); // Занесли в неё адрес новосозданного объекта
        //person = null; // Присвоили переменной ссылку null

//        Cat cat = new Cat();
        Cat catBars = new Cat("Барсик", 3);
        System.out.println(catBars.name);
//        System.out.println(Cat.count);

        catBars = new Cat();
        catBars.setName();
        System.out.println(catBars.name);
//        System.out.println(Cat.count);

        catBars = new Cat();
        catBars.setName("Васька");
        System.out.println(catBars.name);
//        System.out.println(Cat.count);


//        cat = new Cat(); // Создали объект Cat, занесли его ссылку в переменную cat
//        System.out.println("cat.owner равен " + cat.owner);
//        cat.owner = new Person();
//        cat.name = "Барсик";
//        cat.owner.name = "Хозяин Барсика";
//        System.out.println("cat.owner равен " + cat.owner.name);
//
//
//        Cat cat1 = cat; // cat1 ссылается на Барсика (ссылки две, а объект один)
//        System.out.println(cat1.name);
//        cat1 = new Cat(); // cat1 теперь ссылается на нового кота (две ссылки и два объекта)
//        System.out.println(cat1.name);
    }
}
