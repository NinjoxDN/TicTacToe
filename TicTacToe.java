package exo2;

import javax.swing.*;

public class TicTacToe {

    static final int NONE = 0;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;
    private int[][] board = new int[3][3];
    private int turn;

    public int getCell( int posX, int posY) {
        return board[posX][posY];
    }

    private void setCell( int posX, int posY, int player) {
        board[posX][posY] = player;
    }

    public boolean makeMove(int posX, int posY) {

        if(hasWon() !=0){
            if(hasWon() == 1){
                JOptionPane.showMessageDialog(null,
                        "Joueur 1 (red)",
                        "Gagnant",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "Joueur 2 (blue)",
                        "Gagnant",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);
            }
            new Main().closeFenetre();
            new Main().newFenetre();
        }

        if (posX < 0 || posX >= 3 || posY < 0 || posY >= 3)
            return false;
        if (getCell(posX, posY) != NONE) {
            JOptionPane.showMessageDialog(null,
                    "Tu peux pas jouer",
                    "t'es nul",
                    JOptionPane.ERROR_MESSAGE,
                    null);
            return false;
        }
        setCell(posX, posY, getPlayer());
        turn++;
        return true;
    }

    public int getPlayer() {
        return 2 - turn % 2;
    }

    public int hasWon() {

        for (int i = 0; i < 3; i++) {
            if(getCell(i,0) == getCell(i,1) && getCell(i,1) == getCell(i,2)){
                return getCell(i,0);
            }
        }

        for (int i = 0; i < 3; i++) {
            if(getCell(0,i) == getCell(1,i) && getCell(1,i) == getCell(2,i)){
                return getCell(0,i);
            }
        }

        for (int i = 0; i < 3; i++) {
            if(getCell(i,i) == getCell(i,i) && getCell(i,i) == getCell(i,i)){
                return getCell(1,1);
            }
        }

        for (int i = 0; i < 3; i++) {
            if(getCell(i,3) == getCell(i,i) && getCell(i,i) == getCell(i,0)){
                return getCell(1,1);
            }
        }
        return 0;
    }

}