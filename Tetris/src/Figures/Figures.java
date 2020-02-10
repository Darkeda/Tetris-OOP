package Figures;

public abstract class Figures {

    public int startingPoint;
    public int currentPointRow=0;
    public int currentPointCol;
    public int currentForm;
    public int nextForm;
   public static boolean stillDroping = true;

    public Figures(int startingPoint) {
        this.startingPoint=startingPoint;
    }
    public abstract void draw();

    public abstract void addFigureToBoard(Figures board[][]);


    public abstract void moveFigureOnBoard(Figures board[][],int position);

    public abstract void rotate();

    public abstract  void dropDown(Figures board[][]);


    public abstract  void removeFigure(Figures board[][]);

}
