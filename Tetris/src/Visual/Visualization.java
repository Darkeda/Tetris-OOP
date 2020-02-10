package Visual;

import Figures.FigureL;
import Figures.Figures;
import GameManager.GameBoard;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static GameManager.GameBoard.board;
import static GameManager.GameBoard.stillPlaying;

public class Visualization extends JPanel {

    private final Cell[][] map;

    private static final int SIZE = 35;

    public Visualization() {
        setPreferredSize(new Dimension(12 * SIZE, 24 * SIZE));

        map = new Cell[24][12];
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 24; col++) {
                g.drawRect(SIZE * row, SIZE * col, SIZE, SIZE);


                try {
                    if (board[col][row] != null) {
                        g.fillRect(SIZE * row, SIZE * col, SIZE, SIZE);
                    }

                } catch (ArrayIndexOutOfBoundsException exception) {


                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Figures currentFig;

        Visualization p = new Visualization();
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.pack();
        f.setVisible(true);
        f.repaint();

        f.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {

                    case KeyEvent.VK_LEFT:
                        System.out.println("Уви не работи");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("Уви не работи");
                        break;

                }
            }

            public void keyReleased(KeyEvent e) {
            }
        });


        do {

            currentFig = new FigureL(0);
            GameBoard.checkCol();
            currentFig.addFigureToBoard(board);

            do {


                Thread.sleep(50);
                currentFig.dropDown(board);
                f.repaint();

            } while (currentFig.stillDroping);
        } while (stillPlaying);


    }
}



