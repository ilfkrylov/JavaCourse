package lesson2;

public class SimilarFields {
    public int count = 5;

    public void run() {
        count = 10;
        int count = 0;
        this.count = 20;
    }

    public static void printCount(int count) {
        System.out.println(count);
    }

    public static void main(String[] args) {
        SimilarFields obj = new SimilarFields();
        System.out.println(obj.count);
        System.out.println(obj.count);

        SimilarFields.printCount(5);

        System.out.println(Math.max(3,4));
    }
}
