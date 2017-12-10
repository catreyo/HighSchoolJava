import gpdraw.*;

public class fractaldrawing {
	public SketchPad myPaper = new SketchPad(1800, 1800);
	public DrawingTool myPencil = new DrawingTool(myPaper);
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fractaldrawing frac = new fractaldrawing();
		frac.myPencil.up();
		frac.myPencil.move(-400.0,150.0);
		frac.myPencil.down();
		//edit first parameter for some fun ;)
		frac.drawFractal(1, 0.0, 550.0);
		frac.drawFractal(1, 240.0, 550.0);
		frac.drawFractal(1, 120.0, 550.0);
	} */
	
	public void turn(){
		this.myPencil.setDirection(300);
	}
	
	private void drawFractal(int level, double angle, double length){
		double line = length/3.0;
		
		if (level > 0){
			drawFractal(level-1, (angle+0)%360.0, line);
			drawFractal(level-1, (angle+60.0)%360.0, line);
			drawFractal(level-1, (angle+300.0)%360.0, line);
			drawFractal(level-1, (angle+0)%360.0, line);
			}
		
		else {
			myPencil.setDirection((angle+0)%360.0);
			myPencil.forward(line);
			myPencil.setDirection((angle+60.0)%360.0);
			myPencil.forward(line);
			myPencil.setDirection((angle+300.0)%360.0);
			myPencil.forward(line);
			myPencil.setDirection((angle+0)%360.0);
			myPencil.forward(line);
		}
	}
}
