import Game.Board;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

public class MainTest {
    @Test
    public void RunMainTest(){
       /**Assertions.assertEquals(isRobotAtEnd(9,9,9,9), isDone());
        SpaceLimit spaceLimit = SpaceLimit.OFF_LIMITS;
        SpaceLimit emptyBlock = SpaceLimit.FREE;
        Assertions.assertEquals(spaceLimit, SpaceLimit.OFF_LIMITS);
        Assertions.assertNotEquals(spaceLimit, emptyBlock);
        System.out.println("Random number: " + getRandomInt(10));
        Robot object = new Robot();*/
        Board game = new Board(9,9);
        game.PlaceFlags(5,5);
        game.PlaceFinalFlag(9,9);
        /**
         * Setting up the game board is the main priority in order to run a successful robot game.
         * */
        game.Play();
    }

    public boolean isDone(){
        return true;
    }

    public boolean isNotDone(){
        return false;
    }

    public enum SpaceLimit {OFF_LIMITS, FREE}

    public boolean isRobotAtEnd(int maxRow, int maxCol, int currRow, int currCol){
        if ((maxRow == currRow) && (maxCol == currCol)){
            return isDone();
        }
        else {
            return isNotDone();
        }
    }

    public static int getRandomInt(int maxValue){
        return ThreadLocalRandom
                .current()
                .nextInt(0, maxValue);
    }
}
