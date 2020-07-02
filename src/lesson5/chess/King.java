package lesson5.chess;

public class King extends ChessItem {

    public King(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Король на поле %d-%d", x, y));
    }
}
