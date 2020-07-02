package lesson5.chess;

public class Rook extends ChessItem {

    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Ладья на поле %d-%d", x, y));
    }
}
