package course.oop.others;

import course.oop.others.GameBoard;
import org.junit.Test;

public class GameBoardTest {
    GameBoard board = new GameBoard(3,3,0);

    @Test
    public void testing(){
        board.getArrayDisplay();
    }
}