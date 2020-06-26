package lesson2;

public class OperatorIf {
    public static void main(String[] args) {
//        int a = 3;
//        System.out.println(1);
//        System.out.println(2);
//        if (a > 5) {
//            System.out.println(a);
//        }
//        System.out.println(5);

//        System.out.println("======");
//        new OperatorIf().ifelse();
        System.out.println("======");
        new OperatorIf().switchCase();
    }

    public void ifelse() {
        boolean b = false;
        if (b == true) {
            System.out.println(1);
        } else if (b) {
            System.out.println(2);
        } else if (b && b == true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }

    public void switchCase() {
        int b = 5;
        switch (b) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
            case 4:
                System.out.println("3 or 4");
                break;
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
//                break;
            default:
                System.out.println("default");
        }
    }
}
