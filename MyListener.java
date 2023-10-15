package exo2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener implements MouseListener {

    TicTacToe ttt;

    public MyListener(TicTacToeView ticTacToeView) {
        super();
        ttt = ticTacToeView.getGame();
    }

    @Override
    public void mouseClicked(MouseEvent e){

        if(e.getX() <= 100){
            if(e.getY() <= 100){
                //System.out.println("case haut gauche");
                ttt.makeMove(0,0);
            }
            else if(e.getY() >=100 && e.getY() <= 200){
                //System.out.println("case milieu gauche");
                ttt.makeMove(0,1);
            }
            else{
                //System.out.println("case bas gauche");
                ttt.makeMove(0,2);
            }
        }
        else if(e.getX() >=100 && e.getX() <= 200){
            if(e.getY() <= 100){
                //System.out.println("case milieu haut");
                ttt.makeMove(1,0);
            }
            else if(e.getY() >=100 && e.getY() <= 200){
                //System.out.println("case milieu");
                ttt.makeMove(1,1);
            }
            else{
                //System.out.println("case milieu bas");
                ttt.makeMove(1,2);
            }
        }
        else{
            if(e.getY() <= 100){
                //System.out.println("case haut gauche");
                ttt.makeMove(2,0);
            }
            else if(e.getY() >=100 && e.getY() <= 200){
                //System.out.println("case milieu droite");
                ttt.makeMove(2,1);
            }
            else{
                //System.out.println("case bas droite");
                ttt.makeMove(2,2);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}
}
