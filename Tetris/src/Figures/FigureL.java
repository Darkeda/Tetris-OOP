package Figures;

public class FigureL extends Figures {

    public FigureL(int startingPoint) {
        super(startingPoint);
        if(this.startingPoint>9){this.startingPoint=9;}
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
}
