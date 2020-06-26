package lesson1;

import lesson1.модификаторы_доступа.PackageClass;
import lesson1.модификаторы_доступа.PrivateClass;

import java.util.Date;

//import java.util.Date;
//import lesson1.модификаторы_доступа.PublicClass;

public class МодификаторыДоступа {
    public static void main(String[] args) {
        lesson1.модификаторы_доступа.PublicClass publicClass = new lesson1.модификаторы_доступа.PublicClass();
        String name1 = publicClass.name;

        PackageClass packageClass = new PackageClass();
        // String name2 = packageClass.name; // нет доступа

        PrivateClass privateClass = new PrivateClass();
//        privateClass.name = 4;
        // String name3 = privateClass.name; // нет доступа
        MyDate date = new MyDate();
        Date date1 = new Date();
    }

}

class MyDate {

}
