package lesson5.chess;

import java.util.Iterator;

public abstract class ChessItem {
    protected int x;
    protected int y;
    int worth;

    public ChessItem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public int getX() {
        return x;
    }
}
