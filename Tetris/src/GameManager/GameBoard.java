package GameManager;

import Figures.Figures;
import Utilities.Finals;

import java.awt.*;

public class GameBoard {
    public static Color[][] well;
    public static Figures board[][] = new Figures[Finals.ROWS_IN_BOARD][Finals.COLS_IN_BOARD];
    public static boolean stillPlaying = true;


    public static void checkCol() {

        boolean lineFull = false;

        for (int check1 = 0; check1 < 12; check1++) {

            if(board[0][check1]!=null){


                System.out.println("You lose!");
                stillPlaying = false;
            }
        }

    }

    public static void clearLine() {


    }


}

