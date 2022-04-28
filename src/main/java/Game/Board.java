package Game;

public class Board {
    private BoardProperties board[][];
    int maxRow;
    int maxCol;

    public Board(int maxRow, int maxCol) {
        this.board = new BoardProperties[maxRow][maxCol];
        this.maxRow = maxRow;
        this.maxCol = maxCol;
    }
}
