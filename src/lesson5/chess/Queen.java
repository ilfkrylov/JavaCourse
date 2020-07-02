package lesson5.chess;

public class Queen extends ChessItem {

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Ферзь на поле %d-%d", x, y));
    }
}
