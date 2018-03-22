
public class Coordinate {
	private int x;
	private int y;
	private int index;
	
	private String val = "";
	
	public Coordinate(int x, int y) {
		this.setX(x);
		this.setY(y);
		index = (GameHelper.dimension*x) + y;
	}
	
	public Coordinate(int index) {
		this.setIndex(index);
		x = index/GameHelper.dimension;
		y = index%GameHelper.dimension;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getIndex() {
		return index;
	}
	
	public String getStringIndex() {
		if(val ==  "") {
			return String.format("%03d", index);
		}
		else {
			return val;
		}
	}
	
	public boolean isFull() {
		return val != "";
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
}
