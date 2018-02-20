import java.util.ArrayList;

public class Board {
	ArrayList<Coordinate> boardlist = new ArrayList<Coordinate>();
	
	public Board(int n) {
    	for(int i = 0; i < GameHelper.dimension*GameHelper.dimension; i++) {
    		boardlist.add(i, new Coordinate(i));
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
	
	public boolean getThreat() {
		int horiCount = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(GameHelper.lastAdd.getX(), i).getVal() == "X") {
				horiCount++;
			}
		}
		int vertCount = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if(getCoordXY(i, GameHelper.lastAdd.getY()).getVal() == "X") {
				vertCount++;
			}
		}
		int diagOneCount = 0;
		int diagTwoCount = 0;
		for(int i = 0; i < GameHelper.dimension; i++) {
			if (getCoordXY(i, i).getVal()=="X") {
				diagOneCount ++;
			}
			else if(getCoordXY(i, i).getVal()=="O"){
				diagOneCount = 0;
			}
			
			
			if (getCoordXY((GameHelper.dimension-1) - i, i).getVal()=="X") {
				diagOneCount ++;
			}
			else if(getCoordXY((GameHelper.dimension-1) - i, i).getVal()=="O"){
				diagTwoCount = 0;
			}
			
			
			if(getCoordXY(i, i).getX() == GameHelper.lastAdd.getX() && getCoordXY(i, i).getY() == GameHelper.lastAdd.getY()) {
				return true;
			}
			if(getCoordXY(i, GameHelper.dimension-i).getX() == GameHelper.lastAdd.getX() && getCoordXY(i, i).getY() == GameHelper.lastAdd.getY()) {
				return true;
			}
		}
		return false;

	}

}
