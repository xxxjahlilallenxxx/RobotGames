package Board;

import java.util.concurrent.ThreadLocalRandom;

/**This class sets up the board object and the state of the places on the board*/
public class Board {
    private int maxRows;
    private int maxCol;
    private int offLimitsPosX;
    private int offLimitsPosY;
    private SpaceLimit board[][];
    Robot objectPosition = new Robot();

    public Board(int maxRows, int maxCol) {
        this.maxRows = maxRows;
        this.maxCol = maxCol;

        this.board = new SpaceLimit[this.maxRows][this.maxCol];

        this.offLimitsPosX = getRandomInt(maxRows);
        this.offLimitsPosY = getRandomInt(maxCol);

        this.board[this.offLimitsPosX][this.offLimitsPosY] = SpaceLimit.OFF_LIMITS;
        this.board[maxRows][maxCol] = SpaceLimit.FINAL_SPACE;
        this.board = fillBoard(this.board,maxRows,maxCol);

    }

    private SpaceLimit[][] fillBoard(SpaceLimit[][] twoDArray, int maxRows, int maxCol){
        for(int i = 0; i < maxRows; i++){
            for(int j = 0; j < maxCol; j++){
                if ((twoDArray[i][j] != SpaceLimit.OFF_LIMITS) && (twoDArray[i][j] != SpaceLimit.FINAL_SPACE)){
                    twoDArray[i][j] = SpaceLimit.FREE_SPACE;
                }
            }
        }
        return twoDArray;
    }

    private int getRandomInt(int maxValue){
        return ThreadLocalRandom
                .current()
                .nextInt(0, maxValue);
    }
}
