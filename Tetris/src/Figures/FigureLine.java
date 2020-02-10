package Figures;

public class FigureLine extends Figures {

    public FigureLine(int startingPoint) {
        super(startingPoint);
        if(this.startingPoint>8){this.startingPoint=8;}
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

    @Override
    public void rotate() {

    }

    @Override
    public void dropDown(Figures[][] board) {

    }

    @Override
    public void removeFigure(Figures[][] board) {

    }
}
