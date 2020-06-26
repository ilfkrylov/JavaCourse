package lesson2;

public class Cycle {
    public static void cycleWhile() {
        int a = 0;
        int b = 10;
        while (true) {
            System.out.println(a);
            if (a == 4)
                continue;
            a++;
            if (a == 8)
                break;

        }
        System.out.println();
    }

    public static void cycleForEach() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i : array) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Cycle.cycleWhile();
    }
}
