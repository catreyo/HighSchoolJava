// ============================================================================
//     Taken From: http://programmingnotes.org/
// ============================================================================
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{
    // setting up ALL the variables
	JFrame window = new JFrame("Thicc Tac Hoe");

    JMenuBar mnuMain = new JMenuBar();
    JMenuItem   mnuNewGame = new JMenuItem("  New Game"), 
    mnuGameTitle = new JMenuItem("|Tic Tac Toe|  "),
    mnuStartingPlayer = new JMenuItem(" Starting Player"),
    mnuExit = new JMenuItem("    Quit");

    String m = JOptionPane.showInputDialog("Size of board?");
	private int dimension = Integer.parseInt(m);
	
    JButton btnEmpty[] = new JButton[(dimension*dimension)+1];

    JPanel  pnlNewGame = new JPanel(),
    pnlNorth = new JPanel(),
    pnlSouth = new JPanel(),
    pnlTop = new JPanel(),
    pnlBottom = new JPanel(),
    pnlPlayingField = new JPanel();
    JPanel radioPanel = new JPanel();

    private JRadioButton SelectX = new JRadioButton("User Plays X", false);
    private  JRadioButton SelectO = new JRadioButton("User Plays O", false);
    private ButtonGroup radioGroup;
    private  String startingPlayer= "";
    final int X = 800, Y = 480, color = 190; // size of the game window
    private boolean inGame = false;
    private boolean win = false;
    private boolean btnEmptyClicked = false;
    private boolean setTableEnabled = false;
    private String message;
    int size = 0;
    private int remainingMoves = 1;
    private Font font;
    public void letterFont() {
	    if(dimension < 6) {
	    	size = 100;
	    }else {
	    	size = 50;
	    }
	    font = new Font("Rufscript", Font.BOLD, size);
    }

    //===============================  GUI  ========================================//
    public GUI() //This is the constructor
    {
    	letterFont();
    	BusinessLogic.setBoard(dimension*dimension);
    	//Setting window properties:
        window.setSize(X, Y);
        window.setLocation(300, 180);
        window.setResizable(true);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        //------------  Sets up Panels and text fields  ------------------------//
        // setting Panel layouts and properties
        pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlNorth.setBackground(new Color(70, 70, 70));
        pnlSouth.setBackground(new Color(color, color, color));

        pnlTop.setBackground(new Color(color, color, color));
        pnlBottom.setBackground(new Color(color, color, color));

        pnlTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlBottom.setLayout(new FlowLayout(FlowLayout.CENTER));

        radioPanel.setBackground(new Color(color, color, color));
        pnlBottom.setBackground(new Color(color, color, color));
        radioPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Who Goes First?"));


        // adding menu items to menu bar
        mnuMain.add(mnuGameTitle);
        mnuGameTitle.setEnabled(false);
        mnuGameTitle.setFont(new Font("Purisa",Font.BOLD,18));
        mnuMain.add(mnuNewGame);
        mnuNewGame.setFont(new Font("Purisa",Font.BOLD,18));
        mnuMain.add(mnuStartingPlayer);
        mnuStartingPlayer.setFont(new Font("Purisa",Font.BOLD,18));
        mnuMain.add(mnuExit);
        mnuExit.setFont(new Font("Purisa",Font.BOLD,18));//---->Menu Bar Complete

        // adding X & O options to menu
        SelectX.setFont(new Font("Purisa",Font.BOLD,18));
        SelectO.setFont(new Font("Purisa",Font.BOLD,18));
        radioGroup = new ButtonGroup(); // create ButtonGroup
        radioGroup.add(SelectX); // add plain to group
        radioGroup.add(SelectO);
        radioPanel.add(SelectX);
        radioPanel.add(SelectO);

        // adding Action Listener to all the Buttons and Menu Items
        mnuNewGame.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuStartingPlayer.addActionListener(this);

        // setting up the playing field
        pnlPlayingField.setLayout(new GridLayout(dimension, dimension, 2, 2));
        pnlPlayingField.setBackground(Color.black);
        for(int x=1; x <= dimension*dimension; ++x)   
        {
            btnEmpty[x] = new JButton();
            btnEmpty[x].setBackground(new Color(240, 40, 40));
            btnEmpty[x].addActionListener(this);
            pnlPlayingField.add(btnEmpty[x]);
            btnEmpty[x].setEnabled(setTableEnabled);
        }

        // adding everything needed to pnlNorth and pnlSouth
        pnlNorth.add(mnuMain);
        BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);

        // adding to window and Showing window
        window.add(pnlNorth, BorderLayout.NORTH);
        window.add(pnlSouth, BorderLayout.CENTER);
        window.setVisible(true);
    }// End GUI

    // ===========  Start Action Performed  ===============//
    public void actionPerformed(ActionEvent click)  
    {
        // get the mouse click from the user
        Object source = click.getSource();

        // check if a button was clicked on the gameboard
        for(int currentMove=1; currentMove <= dimension*dimension; ++currentMove) 
        {
            if(source == btnEmpty[currentMove] && remainingMoves < dimension*dimension+1)  
            {
                btnEmptyClicked = true;
                BusinessLogic.GetMove(currentMove, remainingMoves, font, 
                    btnEmpty, startingPlayer);              
                btnEmpty[currentMove].setEnabled(false);
                pnlPlayingField.requestFocus();
                ++remainingMoves;
            }
        }

        // if a button was clicked on the gameboard, check for a winner
        if(btnEmptyClicked) 
        {
            inGame = true;
            String winner = BusinessLogic.b.getWin();
	    	if(winner.equals("x")) {lWinMessage();}
	    	else if(winner.equals("o")) {wWinMessage();}
	    	else if(winner.equals("") && BusinessLogic.b.isBoardFull()) {dWinMessage();}
            btnEmptyClicked = false;
        }

        // check if the user clicks on a menu item
        if(source == mnuNewGame)    
        {
            System.out.println(startingPlayer);
            BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
                pnlPlayingField,pnlBottom,radioPanel);
            if(startingPlayer.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Select a Starting Player", 
                    "Oops..", JOptionPane.ERROR_MESSAGE);
                BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
            }
            else
            {
                if(inGame)  
                {
                    int option = JOptionPane.showConfirmDialog(null, "If you start a new game," +
                            " your current game will be lost..." + "n" +"Are you sure you want to continue?"
                        , "New Game?" ,JOptionPane.YES_NO_OPTION);
                    if(option == JOptionPane.YES_OPTION)    
                    {
                        inGame = false;
                        startingPlayer = "";
                        setTableEnabled = false;
                    }
                    else
                    {
                        BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
                    }
                }
                // redraw the gameboard to its initial state
                if(!inGame) 
                {
                    RedrawGameBoard();
                }
            }       
        }       
        // exit button
        else if(source == mnuExit)  
        {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", 
                    "Quit" ,JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        // select X or O player 
        else if(source == mnuStartingPlayer)  
        {
            if(inGame)  
            {
                JOptionPane.showMessageDialog(null, "Cannot select a new Starting "+
                    "Player at this time.nFinish the current game, or select a New Game "+
                    "to continue", "Game In Session..", JOptionPane.INFORMATION_MESSAGE);
                BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
            }
            else
            {
                setTableEnabled = true;
                BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
                    pnlPlayingField,pnlBottom,radioPanel);

                SelectX.addActionListener(new RadioListener());
                SelectO.addActionListener(new RadioListener());
                radioPanel.setLayout(new GridLayout(2,1));

                radioPanel.add(SelectX);
                radioPanel.add(SelectO);
                pnlSouth.setLayout(new GridLayout(2, 1, 2, 1));
                pnlSouth.add(radioPanel);
                pnlSouth.add(pnlBottom);
            }
        }
        pnlSouth.setVisible(false); 
        pnlSouth.setVisible(true);  
    }// End Action Performed

    // ===========  Start RadioListener  ===============//  
    private class RadioListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            JRadioButton theButton = (JRadioButton)event.getSource();
            if(theButton.getText().equals("User Plays X")) 
            {
                startingPlayer = "X";
            }
            if(theButton.getText().equals("User Plays O"))
            {
                startingPlayer = "O";
            }

            // redisplay the gameboard to the screen
            pnlSouth.setVisible(false); 
            pnlSouth.setVisible(true);          
            RedrawGameBoard();
        }
    }// End RadioListener
    /*
    ----------------------------------
    Start of all the other methods. |
    ----------------------------------
     */
    private void RedrawGameBoard()  
    {
        BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
            pnlPlayingField,pnlBottom,radioPanel);
        BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);       

        remainingMoves = 1;

        for(int x=1; x <= dimension*dimension; ++x)   
        {
            btnEmpty[x].setText("");
            btnEmpty[x].setEnabled(setTableEnabled);
        }

        win = false;        
    }
    private void wWinMessage() {
        int option = JOptionPane.showConfirmDialog(null, "W Wins!", "New Game?" ,JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)    
        {
        	System.out.println(startingPlayer);
            BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
                pnlPlayingField,pnlBottom,radioPanel);
        }
        else
        {
            BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
        }
    }
    private void lWinMessage() {
        int option = JOptionPane.showConfirmDialog(null, "L Wins!", "New Game?" ,JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)    
        {
        	System.out.println(startingPlayer);
            BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
                pnlPlayingField,pnlBottom,radioPanel);
        }
        else
        {
            BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
        }
    }
    private void dWinMessage() {
        int option = JOptionPane.showConfirmDialog(null, "DRAW!", "New Game?" ,JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)    
        {
        	System.out.println(startingPlayer);
            BusinessLogic.ClearPanelSouth(pnlSouth,pnlTop,pnlNewGame,
                pnlPlayingField,pnlBottom,radioPanel);
        }
        else
        {
            BusinessLogic.ShowGame(pnlSouth,pnlPlayingField);
        }
    }


/*    private void CheckWin() 
    { //old code for 3x3
    	for(int x = 1; x <= 7; x+=3) {
    		if(btnEmpty[x].getText().equals("W") && btnEmpty[x+1].getText().equals("W") && btnEmpty[x+2].getText().equals("W")) {
    			wWinMessage();
    		}else if(btnEmpty[x].getText().equals("L") && btnEmpty[x+1].getText().equals("L") && btnEmpty[x+2].getText().equals("L")) {
                lWinMessage();
    		}
    	}
    	for(int x = 0; x <= 2; x++)
    		if(btnEmpty[1+x].getText().equals("W") && btnEmpty[4+x].getText().equals("W") && btnEmpty[7+x].getText().equals("W")) {
                wWinMessage();
    		}else if(btnEmpty[1+x].getText().equals("L") && btnEmpty[4+x].getText().equals("L") && btnEmpty[7+x].getText().equals("L")) {
                lWinMessage();
    		}
    	if(btnEmpty[1].getText().equals("W") && btnEmpty[5].getText().equals("W") && btnEmpty[9].getText().equals("W")) {
            wWinMessage();
		}else if(btnEmpty[3].getText().equals("W") && btnEmpty[5].getText().equals("W") && btnEmpty[7].getText().equals("W")) {
            lWinMessage();
		}else if(btnEmpty[1].getText().equals("L") && btnEmpty[5].getText().equals("L") && btnEmpty[9].getText().equals("L")) {
            wWinMessage();
		}else if(btnEmpty[3].getText().equals("L") && btnEmpty[5].getText().equals("L") && btnEmpty[7].getText().equals("L")) {
            lWinMessage();
		}
    	int counter = 0;
        for(int x=1; x <= 9; ++x)   
        {
            if(btnEmpty[x].getText() == "W" || btnEmpty[x].getText() == "L") {
            	counter++;
            }
        }
        if(counter == 9) {
        	dWinMessage();
        }

    } */

}	