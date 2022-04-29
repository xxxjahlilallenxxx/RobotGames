package Game;

import java.util.Scanner;

public class Board {
    private BoardProperties board[][];
    /**
     * Both of the enums below are giving the program trouble in runtime.
     * Setting an enum is the issue right now
     * */
    private End end = End.DONE;
    private Limit limit;

    public Board(int maxRow, int maxCol) {
        this.board = new BoardProperties[maxRow][maxCol];
    }

    public void PlaceFlags(int flagRow, int flagCol){
        this.board[flagRow][flagCol].setLimit(this.limit = Limit.OFF_LIMITS);
    }

    public void PlaceFinalFlag(int flagRow, int flagCol){
        this.board[flagRow][flagCol].setEnd(this.end);
    }

    public void Play(){
        int row = 0;
        int col = 0;
        Scanner in = new Scanner(System.in);
        String choice;
        while (this.board[row][col].getEnd() != this.end){
            if(this.board[row][col].getLimit() != this.limit){
                this.board[row][col].setVisit();
                System.out.println("Please enter a move(you can only move right and move down): ");
                choice = in.nextLine();
                if((choice == "right") || (choice == "Right")){
                    if(this.board[row][col + 1].getLimit() == this.limit){
                        System.out.println("This block is off limits. Please go down");
                    } else{
                        col++;
                    }
                } else{
                    if(this.board[row + 1][col].getLimit() == this.limit){
                        System.out.println("This bloc is off limits. Please go right");
                    } else{
                        row++;
                    }
                }
            }
        }
        in.close();
    }
}
