package Figures;

import Utilities.Finals;

public class FigureL extends Figures {

    public FigureL(int startingPoint) {
        super(startingPoint);
        if (this.startingPoint > 9) {
            this.startingPoint = 9;
        }
        currentPointRow = this.startingPoint;
        stillDroping=true;
    }

    @Override
    public void draw() {

    }

    @Override
    public void dropDown(Figures[][] board) {

        if (currentPointRow  > Finals.ROWS_IN_BOARD) {
            System.out.println("fail");
            stillDroping = false;
        }


        try {
            if (board[currentPointRow + 3][currentPointCol] == null &&
                    board[currentPointRow + 3][currentPointCol+1] == null && stillDroping==true) {

                removeFigure(board);

                board[currentPointRow + 1][currentPointCol] = this;
                board[currentPointRow + 2][currentPointCol] = this;
                board[currentPointRow + 3][currentPointCol] = this;
                board[currentPointRow + 3][currentPointCol+1] = this;




                this.currentPointRow+=1;
            } else {stillDroping=false;}
        } catch (ArrayIndexOutOfBoundsException exception) {

            stillDroping=false;

        }

    }


        @Override
        public void addFigureToBoard (Figures[][]board){
            board[0][startingPoint]= this;
            board[1][startingPoint] = this;
            board[2][startingPoint] = this;
            board[2][startingPoint+1] = this;

        }


        @Override
        public void moveFigureOnBoard (Figures[][]board,int position){
            if (board[currentPointCol + position][currentPointRow] == null &&
                    board[currentPointCol + position][currentPointRow+1] == null &&
                    board[currentPointCol + position + position][currentPointRow+2] == null &&
                    board[currentPointCol + 1 + position + position][currentPointRow+2] == null


            ) {

                removeFigure(board);





                board[currentPointRow][startingPoint + position] = this;
               board[currentPointRow+1][startingPoint + position] = this;
               board[currentPointRow+2][startingPoint + position] = this;
                board[currentPointRow+2][startingPoint + 1 + position] = this;

                currentPointCol += position;


            }


        }

        @Override
        public void rotate () {

        }

        @Override
        public void removeFigure (Figures[][]board){
            board[currentPointRow][currentPointCol] = null;
            board[currentPointRow + 1][currentPointCol] = null;
            board[currentPointRow + 2][currentPointCol]= null;
            board[currentPointRow + 2][currentPointCol+1] = null;


//            board[currentPointCol][currentPointRow] = null;
//            board[currentPointCol][currentPointRow + 1] = null;
//            board[currentPointCol] [currentPointRow + 2]= null;
//            board[currentPointCol + 1][currentPointRow + 2] = null;
        }
    }
