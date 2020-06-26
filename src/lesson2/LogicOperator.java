package lesson2;

public class LogicOperator {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        if (++i > 0 && ++j > 0) {
            // nothing
        }
//        System.out.println(i);
//        System.out.println(j);

        int k = 1;
        if (++k == 2) {
            System.out.println("to do");
        }
        System.out.println(k);
    }
}
