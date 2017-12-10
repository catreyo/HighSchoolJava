
import gpdraw.*;
public class testdraw {

	

	private DrawingTool myPencil;
	private SketchPad myPaper;


	void draw(){
		myPaper = new SketchPad(300, 300);
		myPencil = new DrawingTool(myPaper);
		myPencil.forward(100);
		myPencil.turnRight(45);
		myPencil.forward(100);
		myPencil.turnRight();
		myPencil.forward(100);
		myPencil.turnLeft(45);
		myPencil.turnRight();
		myPencil.forward(100);
		myPencil.turnRight();
		myPencil.forward(145);
	}

}