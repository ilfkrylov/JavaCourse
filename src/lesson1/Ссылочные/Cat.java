package lesson1.Ссылочные;

public class Cat {
    private static int count = 0;

    public Person owner = new Person();
    public String name; //
    public int age = 0;



    public Cat(String aName) {
        name = aName;
//       name = s;
//       System.out.println("Это конструктор");
       count = count + 1;
    }

    public Cat() {
        count = count + 1;
    }

    public Cat(String aName, int i) {
        name = aName;
        age = i;
//        data = aName + i;
        count = count + 1;
    }

    public void setName() {
        name = "Имя по умолчанию";
    }

    public void setName(String s) {
        name = s;
    }
}
