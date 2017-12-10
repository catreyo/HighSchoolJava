package summer2017;

import gpdraw.*;

public class drawhouse {
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawhouse house = new drawhouse();
		house.draw();
	} */
	
	private DrawingTool myPencil;
	private SketchPad myPaper;
	
	public drawhouse(){
		myPaper = new SketchPad(500, 500);
		myPencil = new DrawingTool(myPaper);
	}
	
	public void draw(){
		//box:
		myPencil.up();
		myPencil.move(-150, -200);
		myPencil.down();
		myPencil.move(-150,100);
		myPencil.move(0, 200);
		myPencil.move(150, 100);
		myPencil.move(150, -200);
		myPencil.move(-150, -200);
		//connector:
		myPencil.up();
		myPencil.move(-150, 100);
		myPencil.down();
		myPencil.move(150,100);
		//door:
		myPencil.up();
		myPencil.move(-30, -200);
		myPencil.down();
		myPencil.move(-30, -100);
		myPencil.move(30, -100);
		myPencil.move(30, -200);
		//Window 1:
		myPencil.up();
		myPencil.move(-100, 25);
		myPencil.down();
		myPencil.move(-100, -25);
		myPencil.move(-50, -25);
		myPencil.move(-50, 25);
		myPencil.move(-100, 25);
		//Window 2:
		myPencil.up();
		myPencil.move(50, 25);
		myPencil.down();
		myPencil.move(50, -25);
		myPencil.move(100, -25);
		myPencil.move(100, 25);
		myPencil.move(50, 25);
		//Window Grates
		myPencil.up();
		myPencil.move(-75, 25);
		myPencil.down();
		myPencil.move(-75, -25);
		myPencil.up();
		myPencil.move(-100, 0);
		myPencil.down();
		myPencil.move(-50, 0);
		myPencil.up();
		myPencil.move(75, 25);
		myPencil.down();
		myPencil.move(75, -25);
		myPencil.up();
		myPencil.move(100, 0);
		myPencil.down();
		myPencil.move(50, 0);
		//Circle Thing:
		myPencil.up();
		myPencil.move(0, 145);
		myPencil.down();
		myPencil.drawCircle(25);
	}
}