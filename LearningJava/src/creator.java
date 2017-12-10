import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import gpdraw.*;

public class creator {

	public SketchPad myPaper = new SketchPad(1800, 1800);
	public DrawingTool myPencil = new DrawingTool(myPaper);

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creator create = new creator();
		create.adder();
		create.draw();
	} */

	ArrayList <point2d> coord = new ArrayList <point2d>();
	int numPoints = 0;
	
	public void adder(){
		Scanner enter = new Scanner(System.in);
		System.out.print("Number of points: ");
		numPoints = enter.nextInt();
		enter.close();
		for(int i=0; i<=numPoints; i++){
			coord.add(new point2d((i%4) +1));
		}
	}
	
	point2d points;
	
	public void draw(){
		for(int i=0; i<=numPoints; i++){
			points = coord.get(i);
/*			switch(i % 10){
				case 0: myPencil.setColor(Color.red);
					break;
				case 1: myPencil.setColor(Color.orange);
					break;
				case 2: myPencil.setColor(Color.yellow);
					break;
				case 3: myPencil.setColor(Color.green);
					break;
				case 4: myPencil.setColor(Color.cyan);
					break;
				case 5: myPencil.setColor(Color.blue);
					break;
				case 6: myPencil.setColor(Color.magenta);
					break;
				case 7: myPencil.setColor(Color.pink);
					break;
				case 8: myPencil.setColor(Color.gray);
					break;
				case 9: myPencil.setColor(Color.black);
					break;
				} */
			switch(i % 10){
			case 0: myPencil.setColor(Color.red);
				break;
			case 1: myPencil.setColor(Color.red);
				break;
			case 2: myPencil.setColor(Color.black);
				break;
			case 3: myPencil.setColor(Color.black);
				break;
			case 4: myPencil.setColor(Color.black);
				break;
			case 5: myPencil.setColor(Color.black);
				break;
			case 6: myPencil.setColor(Color.black);
				break;
			case 7: myPencil.setColor(Color.black);
				break;
			case 8: myPencil.setColor(Color.black);
				break;
			case 9: myPencil.setColor(Color.black);
				break;
			}

			myPencil.move(points.x, points.y);
		}
	}
}
