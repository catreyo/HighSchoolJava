package summer2017;

import gpdraw.*;

public class FractalTwo {
	public SketchPad myPaper = new SketchPad(1000, 1000);
	public DrawingTool myPencil = new DrawingTool(myPaper);

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractalTwo frac = new FractalTwo();
		frac.myPencil.up();
		frac.myPencil.move(-300,0);
		frac.myPencil.down();
		//edit first parameter for some fun ;)
		frac.drawFractal(3, 0.0, 600.0);
		frac.drawFractal(3, 180.0, 600.0);
	} */
	private void drawFractal(int level, double angle, double length){
		double line = length/3.0;
		
		if (level > 0){
			drawFractal(level-1, (angle+0), line);
			drawFractal(level-1, (angle+90.0), line);
			drawFractal(level-1, (angle+0), line);
			drawFractal(level-1, (angle+270.0), line);
			drawFractal(level-1, (angle+0), line);
		}
		
		else {
			myPencil.setDirection((angle+0));
			myPencil.forward(line);
			myPencil.setDirection((angle+90.0));
			myPencil.forward(line);
			myPencil.setDirection((angle+0));
			myPencil.forward(line);
			myPencil.setDirection((angle+270.0));
			myPencil.forward(line);
			myPencil.setDirection((angle+0));
			myPencil.forward(line);
		}
	}
}