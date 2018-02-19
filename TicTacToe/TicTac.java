import java.util.ArrayList;
import java.util.Scanner;

public class TicTac
{
	ArrayList<String> board = new ArrayList<String>();
    Scanner give = new Scanner(System.in);
    int dimension; int type;
    
    public void setDimension() {
    	System.out.print("Dimension of board: ");
        int n = give.nextInt();
    	dimension = n;
    }
    
    public void fill() {
    	for(int i = 0; i < dimension*dimension; i++) {
	    	if(dimension <= 3) {
	    		type = 0;
	    		String add = Integer.toString(i);
	    		board.add(i, add);
	    	}else if(dimension <= 10) {
    			type = 1;
	    		String add = Integer.toString(i);
	    		if(i < 10) {
	    			add = "0"+add;
	    		}
	    		board.add(i, add);
	    	}else {
    			type = 2;
	    		String add = Integer.toString(i);
	    		if(i < 10) {
	    			add = "00"+add;
	    		}else if(i >= 10 && i < 100) {
	    			add = "0"+add;
	    		}
	    		board.add(i, add);	    		
	    	}
    	}
    }
    
    public void display(){
        int counter = 0;
        for(int i = 0; i < dimension*dimension; i++) {
        	if(counter == dimension) {
        		System.out.println();
        		counter = 0;
        	}
        	System.out.format("[" + board.get(i) + "]");
        	counter++;
        }
        System.out.println();
    }
    
    public int promptUser() {
    	int n = 0;
    	while(true) {
    		System.out.print("Value between 0 and " + (dimension*dimension-1) + ": ");
	    	n = give.nextInt();
	    	if(board.get(n) == "X" || board.get(n) == "X " || board.get(n) == " X " || board.get(n) == "O" || board.get(n) == "O " || board.get(n) == " O ") {
	    		continue;
	    	}
	    	else {
	    		break;
	    	}
    	}
    	return n;
    }
    
    public void add(boolean xo, int n) {
    	if(xo) {
    		switch(type) {
    			case 0:
    				board.set(n, "X");
    				break;
    			case 1:
    				board.set(n, "X ");
    				break;
    			case 2:
    				board.set(n, " X ");
    				break;
    		}
    	}else {
    		switch(type) {
				case 0:
					board.set(n, "O");
					break;
				case 1:
					board.set(n, "O ");
					break;
				case 2:
					board.set(n, " O ");
					break;
			}    		
    	}
    }
    
    public void aiPlay() {
    	
    }
}