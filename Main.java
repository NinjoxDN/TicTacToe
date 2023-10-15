package exo2;
import javax.swing.JFrame;

public class Main{
    private static final int FRAME_LOCATION_X = 100;
    private static final int FRAME_LOCATION_Y = 100;

    private static JFrame frame;
    private static TicTacToeView view;

    // Ne touchez pas à ce code
    public static void main(String[] args) {
        newFenetre();
    }

    public static void fenetre(TicTacToeView view){
        frame = new JFrame("Tic Tac Toe");
        frame.add(view);
        frame.setSize(view.getSize());
        frame.setLocation(FRAME_LOCATION_X, FRAME_LOCATION_Y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void closeFenetre(){
        frame.dispose();


    }

    public static void newFenetre(){
        view = new TicTacToeView(new TicTacToe());
        fenetre(view);
    }

}
