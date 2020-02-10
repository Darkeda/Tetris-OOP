package Visual;

class Cell{

    private final int row, column;
    boolean visited;

    public Cell(int i, int j)
    {
        row = i;
        column = j;

    }

    int getRow() {  return row; }

    int getColumn() {return column; }





    @Override
    public String toString()
    {
        return row + " " + column;
    }
}