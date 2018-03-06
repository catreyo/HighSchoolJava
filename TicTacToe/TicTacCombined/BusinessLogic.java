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
				btnEmpty[currentMove].setText("L");
				b.getBoardList().get(currentMove-1).setVal(" X ");
			}
			else
			{
				btnEmpty[currentMove].setText("W");
				b.getBoardList().get(currentMove-1).setVal(" O ");
			}
		}
		else
		{
			btnEmpty[currentMove].setText("L");
			b.getBoardList().get(currentMove-1).setVal(" X ");
			GameHelper.lastAdd = new Coordinate(currentMove-1);
			//this is gonna be the AI thing
			if(remainingMoves <= GameHelper.dimension*GameHelper.dimension) {
				int AImove = b.intelPlayer();
				btnEmpty[AImove].setFont(font);
				btnEmpty[AImove].setText("W");
				b.getBoardList().get(AImove-1).setVal(" O ");
			}
		}
		GameHelper.lastAdd = new Coordinate(currentMove-1);
	}// End of GetMove
	
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
	}//	End of ClearPanelSouth 
}