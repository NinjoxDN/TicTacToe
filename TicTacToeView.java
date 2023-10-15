package exo2;

import exo2.TicTacToe;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class TicTacToeView extends JComponent {

    public final static int WIDTH = 300;
    public final static int HEIGHT = 300;

    private final TicTacToe game;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TicTacToeView(TicTacToe game) {
        super();
        this.game = game;
        addMouseListener(new MyListener(this));
        setOpaque(true);
        setSize(WIDTH, HEIGHT);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.WHITE);
        int width = getSize().width;
        int height = getSize().height;
        g.setColor(Color.BLACK);
        drawLines(g, width, height);
        drawMoves(g);
    }

    private void drawLines(Graphics g, int width, int height) {
        g.drawLine(width / 3, 0, width / 3, height);
        g.drawLine(width * 2 / 3, 0, width * 2 / 3, height);
        g.drawLine(0, height / 3, width, height / 3);
        g.drawLine(0, height * 2 / 3, width, height * 2 / 3);
    }

    private void drawMove(Graphics g, int posX, int posY) {
        int x = getSize().width * posX / 3;
        int xWidth = getSize().width / 3;
        int y = getSize().height * posY / 3;
        int yWidth = getSize().height / 3;
        g.fillRect(x, y, xWidth, yWidth);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, xWidth, yWidth);
    }

    private void drawMoves(Graphics g) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(game.getCell(i,j) ==1){
                    g.setColor(Color.RED);
                    drawMove(g,i,j);
                }
                if(game.getCell(i,j) == 2){
                    g.setColor(Color.BLUE);
                    drawMove(g,i,j);
                }
            }
        }
        repaint();
    }

    public TicTacToe getGame(){
        return game;
    }

}