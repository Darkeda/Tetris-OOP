package Figures;

public abstract class Figures {

    public int startingPoint;
    public int currentPoints;
    public int currentForm;
    public int nextForm;

    public Figures(int startingPoint) {
        this.startingPoint=startingPoint;
    }
    public abstract void draw();

    public abstract void addFigureToBoard(Figures board[][]);


    public abstract void moveFigureOnBoard(Figures board[][],int position);

    public abstract void rotate();

}
