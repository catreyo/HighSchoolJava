import java.util.Random;
import java.util.Scanner;

public class GameHelper
{
	static Board b;
    static int dimension; static Coordinate lastAdd;
    
    public static void main(String args[]) {
    	Scanner give = new Scanner(System.in);
    	String pAgain = "Y";
    	while(pAgain.equals("Y")) {
        	lastAdd = null;
    		System.out.print("Dimension of array: ");
        	dimension = give.nextInt();
    		b = new Board(dimension);
	    	System.out.println("(1) Player VS Computer");
	    	System.out.println("(2) Player VS Player");
	    	System.out.print("--> ");
	    	int mode = Integer.parseInt(give.next());
	    	b.display();
	    	String winner = b.getWin();
	    	while(winner.equals("") && !b.isBoardFull()) {
	    		System.out.println("Player One:");
	    	    add(true, promptUser());
		    	winner = b.getWin();
		    	b.display();
		    	if(winner != "") {break;}
	    		if(mode == 1) {
	    			System.out.println("Computer:");
	    		    randPlay();
			    	winner = b.getWin();
			    	b.display();
			    	if(winner != "") {break;}
	    		}else if(mode == 2) {
	    		    System.out.println("Player Two:");
	    		    add(false, promptUser());
			    	winner = b.getWin();
			    	b.display();
			    	if(winner != "") {break;}
	    		}
	    	}
	    	if(winner.equals("x")) {System.out.println("X WINS");}
	    	else if(winner.equals("o")) {System.out.println("O WINS");}
	    	else if(winner.equals("") && b.isBoardFull()) {System.out.println("DRAW");}
	    	System.out.print("Play Again? (Y/N)");
	    	pAgain = give.next();
    	}
    	System.out.println("Have a great day!");
    }
    
    public static int promptUser() {
    	Scanner give = new Scanner(System.in);
    	int n = 0;
    	while(true) {
    		System.out.print("Value between 0 and " + (dimension*dimension-1) + ": ");
	    	n = give.nextInt();
	    	if(b.getBoardList().get(n).isFull()) {
	    		continue;
	    	}
	    	else {
	    		break;
	    	}
    	}
    	return n;
    }
    
    public static void add(boolean xo, int n) {
    	if(xo) {
    		b.getBoardList().get(n).setVal(" X ");
    	}else {
    		b.getBoardList().get(n).setVal(" O ");
    	}
    	lastAdd = new Coordinate(n);
    }
    
    //Figure out exit criteria if all values of ArrayList are full
    public static void randPlay() {
    	Random rand =  new Random();
    	while(!b.isBoardFull()) {
    	    int randIndex = rand.nextInt(b.boardlist.size());
    		if(!(b.getBoardList().get(randIndex).isFull())) {
    			add(false, randIndex);
    			break;
    		}
    	}
    }
    
    /*public static void opponent() {
    	int lastX = lastAdd.getX();
    	int lastY = lastAdd.getY();
    }*/
    
}