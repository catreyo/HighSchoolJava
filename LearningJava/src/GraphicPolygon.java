import gpdraw.*;

class GraphicPolygon extends regularpolygon{
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GraphicPolygon polygon = new GraphicPolygon(16,50,0,0);
	polygon.draw();

	} */
	
	private DrawingTool pen = new DrawingTool(new SketchPad(1000, 1000));
	private double xPosition, yPosition;
	
	// constructors
	
	// Initializes a polygon of numSides sides and sideLength
	// length in the superclass. The polygon is centered at
	// xPosition = yPosition = 0
	public GraphicPolygon(double numSides, double sideLength){
		super(numSides, sideLength);
	}
	
	// Initializes a polygon of numSides sides and sideLength
	// length in the superclass. The polygon is centered at
	// xPosition = x and yPosition = y
	public GraphicPolygon(double numSides, double sideLength, double x, double y){
		super(numSides, sideLength);
		xPosition = x;
		yPosition = y;
	}
	
	// public methods
	
	// Sets xPosition = x and yPosition = y to correspond to the new
	// center of the polygon
	// public void moveTo(double x, double y){}
	
	// Draws the polygon about the center point (xPosition, yPosition).
	// Uses properties inherited from RegularPolygon to determine the
	// number and length of the sides, the radius of the inscribed circle,
	// and the vertex angle with which to draw the polygon
	public void draw(){
		pen.up();
		pen.move(xPosition, yPosition);
		pen.move(xPosition+this.getR(), yPosition);
		pen.down();
		double angle = (180-(this.vertexAngle()/2));
		pen.setDirection(angle);
		for(double i=0; i < this.getNumside(); i++){
			pen.forward(this.getSideLength());
			angle = (angle + (180-this.vertexAngle())) % 360;
			pen.setDirection(angle);
		}
	}
}