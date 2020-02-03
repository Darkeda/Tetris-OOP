package Figures;

import Utilities.Finals;

public class FigureSquare extends Figures {

    public FigureSquare(int startingPoint) {
        super(startingPoint);
        if(this.startingPoint>10){this.startingPoint=10;}
    }

    @Override
    public void draw() {

    }


    @Override
    public void addFigureToBoard(Figures[][] board) {
    }

    @Override
    public void moveFigureOnBoard(Figures[][] board, int position) {

    }
}
