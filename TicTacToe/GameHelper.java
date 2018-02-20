import java.util.Scanner;

public class GameHelper
{
	static Board b;
    static int dimension; static Coordinate lastAdd;
    
    public static void main(String args[]) {
    	Scanner give = new Scanner(System.in);
    	System.out.print("Dimension of array: ");
    	dimension = give.nextInt();
    	b = new Board(dimension);
    	give.close();
    	b.display();
    	promptUser();
    	b.display();
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
    	give.close();
    	return n;
    }
    
    public static void add(boolean xo, int n) {
    	if(xo) {
    		b.getBoardList().get(n).setVal("X");
    	}else {
    		b.getBoardList().get(n).setVal("O");
    	}
    	lastAdd = new Coordinate(n);
    }
    
    public static void opponent() {
    	int lastX = lastAdd.getX();
    	int lastY = lastAdd.getY();
    }
    
}