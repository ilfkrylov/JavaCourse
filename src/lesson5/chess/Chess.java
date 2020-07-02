package lesson5.chess;


public class Chess {
    public static void main(String[] args) {
        King king = new King(5,1);
        Queen queen = new Queen(4,1);
        Rook rookLeft = new Rook(1,1);
        Rook rookRight = new Rook(8,1);

        king.draw();
        queen.draw();
        rookLeft.draw();
        rookRight.draw();

//        ChessItem chessItem = new ChessItem(0, 0);
//        chessItem.draw();
    }
}
