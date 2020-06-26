package lesson3.inheritance.chess;

import lesson3.inheritance.chess.ChessItem;

public class King extends ChessItem {
    void movieKing() {
        // todo
    }

    @Override
    public int getWorth() {
        return worth + 1;
    }
}
