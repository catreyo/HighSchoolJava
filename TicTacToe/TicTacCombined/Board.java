import java.util.ArrayList;

public class Board {
	private ArrayList<Coordinate> boardlist = new ArrayList<Coordinate>();
	
	public Board(int n) {
    	for(int i = 0; i < GameHelper.dimension*GameHelper.dimension; i++) {
    		boardlist.add(i, new Coordinate(i));
    	}
	}

	public void resetBoard() {
    	for(int i = 0; i < GameHelper.dimension*GameHelper.dimension; i++) {
    		boardlist.set(i, new Coordinate(i));
    	}
	}
	
	
    public void display(){
        int counter = 0;
        for(int i = 0; i < GameHelper.dimension*GameHelper.dimension; i++) {
        	if(counter == GameHelper.dimension) {
        		System.out.println();
        		counter = 0;
        	}
        	System.out.format("[" + boardlist.get(i).getStringIndex() + "]");
        	counter++;
        }
        System.out.println();
    }
	
	public ArrayList<Coordinate> getBoardList() {
		return boardlist;
	}
	
	public Coordinate getCoordXY(int x, int y) {
		for(Coordinate c : boardlist) {
			if(c.getX() == x && c.getY() == y) {
				return c;
			}
		}
		throw new IndexOutOfBoundsException();
	}
		
	public String getWin() {
		int horiCountX = 0;
		int horiCountO = 0;
		if(GameHelper.lastAdd == null) {
			return "";
		}
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == " X ") {
				horiCountX++;
			}
			else if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == " O "){
				horiCountO++;
			}
		}
		int vertCountX = 0;
		int vertCountO = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == " X ") {
				vertCountX++;
			}else if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == " O ") {
				vertCountO++;
			}
		}
		int diagOneCountX = 0;
		int diagOneCountO = 0;
		int diagTwoCountX = 0;
		int diagTwoCountO = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if (getCoordXY(i, i).getVal()==" X ") {
				diagOneCountX++;
			}
			else if(getCoordXY(i, i).getVal()==" O "){
				diagOneCountO++;
			}
			if (getCoordXY((GameHelper.dimension-1) - i, i).getVal()==" X ") {
				diagTwoCountX++;
			}
			else if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()==" O "){
				diagTwoCountO++;
			}			
		}
		if(horiCountX == GameHelper.dimension || vertCountX == GameHelper.dimension || diagOneCountX == GameHelper.dimension || diagTwoCountX == GameHelper.dimension) {return "x";}
		else if(horiCountO == GameHelper.dimension || vertCountO == GameHelper.dimension || diagOneCountO == GameHelper.dimension || diagTwoCountO == GameHelper.dimension) {return "o";}
		else {return "";}
	}
	
	public boolean isBoardFull() {
		for(Coordinate x : boardlist) {
			if(!x.isFull()) {
				return false;
			}
		}
		return true;
	}

}
