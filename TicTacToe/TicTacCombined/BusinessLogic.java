// ============================================================================
//     Taken From: http://programmingnotes.org/
// ============================================================================
import javax.swing.*;
import java.awt.*;
 
public class BusinessLogic
{
    static Board b = null;
    public static void setBoard(int n) {
        GameHelper.dimension = n;
        b = new Board(n);
    }
    //L = X and W = O
    public static void GetMove(int currentMove, int remainingMoves, Font font, JButton btnEmpty[], 
            String startingPlayer)
    {// gets the current move "X" or "O" for the user & displays to screen
        btnEmpty[currentMove].setFont(font);
 
        if(startingPlayer.equals("X"))
        {
            if(remainingMoves % 2 != 0)
            {               
                btnEmpty[currentMove].setText("X");
                b.getBoardList().get(currentMove-1).setVal(" X ");
                GameHelper.lastAdd = new Coordinate(currentMove-1);
                b.display();
                System.out.println();
            }
            else
            {
                btnEmpty[currentMove].setText("O");
                b.getBoardList().get(currentMove-1).setVal(" O ");
                GameHelper.lastAdd = new Coordinate(currentMove-1);
                b.display();
                System.out.println();
            }
        }
        else
        {
            btnEmpty[currentMove].setText("X");
            b.getBoardList().get(currentMove-1).setVal(" X ");
            GameHelper.lastAdd = new Coordinate(currentMove-1);
            b.display();
            System.out.println();
            /*//This is obsolete code because the user will never will.
            String winner = b.getWin();
            if(winner.equals("x")) {lWinMessage();}
            else if(winner.equals("o")) {wWinMessage();}
            else if(winner.equals("") && BusinessLogic.b.isBoardFull()) {dWinMessage();}
            */
            //this is gonna be the AI thing
            int AImove = -1;
            AImove = b.intelPlayer();
            if(btnEmpty[AImove].getText() == "") {
            	btnEmpty[AImove].setFont(font);
                btnEmpty[AImove].setText("O");
                btnEmpty[AImove].setEnabled(false);
                b.getBoardList().get(AImove-1).setVal(" O ");
            }else {
            	System.out.print("UR AI IS BROKEN AF");
            }
            GameHelper.lastAdd = new Coordinate(AImove-1);
            b.display();
            System.out.println();
        }
    }// End of GetMove
    
    public static void wWinMessage() {
        JOptionPane.showMessageDialog(null, "X Wins");
    }
    public static void lWinMessage() {
        JOptionPane.showMessageDialog(null, "O Wins");
    }
    public static void dWinMessage() {
        JOptionPane.showMessageDialog(null, "DRAW!");
    }

    public static void ShowGame(JPanel pnlSouth, JPanel pnlPlayingField)
    {// shows the Playing Field
        pnlSouth.setLayout(new BorderLayout());
        pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
        pnlPlayingField.requestFocus(); 
    }// End of ShowGame
    
    public static void ClearPanelSouth(JPanel pnlSouth, JPanel pnlTop, 
         JPanel pnlNewGame, JPanel pnlPlayingField, JPanel pnlBottom, JPanel radioPanel)    
    {// clears any posible panels on screen
        pnlSouth.remove(pnlTop); 
        pnlSouth.remove(pnlBottom);
        pnlSouth.remove(pnlPlayingField);
        pnlTop.remove(pnlNewGame);
        pnlSouth.remove(radioPanel);
    }// End of ClearPanelSouth 
}