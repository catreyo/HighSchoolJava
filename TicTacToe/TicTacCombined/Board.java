import java.util.ArrayList;
import java.util.Random;

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
	
	public int intelPlayer() {
		//remove impossible case
		if(GameHelper.lastAdd == null) {
			return -1;
		}
		
		//Check if possible to win:
		int horiCountO = 0;
		int space = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == " O "){
				horiCountO++;
			}
			else if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == ""){
				space = i;
			}
		}
		if(horiCountO == GameHelper.dimension-1) {
			return space+1;
		}
		space = 0;
		int vertCountO = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == " O ") {
				vertCountO++;
			}else if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == "") {
				space = i;
			}
		}
		if(vertCountO == GameHelper.dimension-1) {
			return space+1;
		}
		int dSpace1 = 0; int dSpace2 = 0;
		int diagOneCountO = 0;
		int diagTwoCountO = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, i).getVal()==" O "){
				diagOneCountO++;
			}else if(getCoordXY(i, i).getVal()==""){
				dSpace1 = i;
			}
			if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()==" O "){
				diagTwoCountO++;
			}else if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()==""){
				dSpace2 = i;
			}
		}
		if(diagOneCountO == GameHelper.dimension-1) {
			return dSpace1+1;
		}
		if(diagTwoCountO == GameHelper.dimension-1) {
			return dSpace2+1;
		}
		
		//Check if possible to block
		int horiCountX = 0;
		int blockSpace = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == " X "){
				horiCountX++;
			}
			else if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == ""){
				blockSpace = i;
			}
		}
		if(horiCountX == GameHelper.dimension-1) {
			return blockSpace+1;
		}
		blockSpace = 0;
		int vertCountX = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == " X ") {
				vertCountX++;
			}else if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == "") {
				blockSpace = i;
			}
		}
		if(vertCountX == GameHelper.dimension-1) {
			return blockSpace+1;
		}
		int dBlockSpace1 = 0; int dBlockSpace2 = 0;
		int diagOneCountX = 0;
		int diagTwoCountX = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, i).getVal()==" X "){
				diagOneCountX++;
			}else if(getCoordXY(i, i).getVal()==""){
				dBlockSpace1 = i;
			}
			if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()==" X "){
				diagTwoCountX++;
			}else if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()==""){
				dBlockSpace2 = i;
			}
		}
		if(diagOneCountX == GameHelper.dimension-1) {
			return dBlockSpace1+1;
		}
		if(diagTwoCountX == GameHelper.dimension-1) {
			return dBlockSpace2+1;
		}
			
		//Otherwise go random (for now)
    	Random rand =  new Random();
    	while(!isBoardFull()) {
    	    int randIndex = rand.nextInt(getBoardList().size());
    		if(!(getBoardList().get(randIndex).isFull())) {
    			return randIndex+1;
    		}
    	}
    	return -1;

	}

}
