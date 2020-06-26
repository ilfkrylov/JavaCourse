package lesson3.inheritance.chess;

public class ChessItem {
    int x;
    int y;
    int worth;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public static void meth() {
        System.out.println("c-i");
    }
}
