import gpdraw.*;

public class rectangle {
	private DrawingTool myPencil;
	private SketchPad myPaper;
	double w = 0;
	double h = 0;
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle drawing = new rectangle(20.0, 20.0, 20.0, 20.0);
		drawing.draw();
		} */
	
	rectangle(double x, double y, double width, double height){
		w = width;
		h = height;
	}
	public double getPerimeter(){
		System.out.println(w+h);
		return w+h;
	}
	public double getArea(){
		System.out.println((w+h)*2);
		return (w+h)*2;
	}
	public void draw(){
		myPaper = new SketchPad(600, 600);
		myPencil = new DrawingTool(myPaper);
		myPencil.forward(w);
		myPencil.turnRight();
		myPencil.forward(h);
		myPencil.turnRight();
		myPencil.forward(w);
		myPencil.turnRight();
		myPencil.forward(h);
	}
}
