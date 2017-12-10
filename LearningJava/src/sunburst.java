import java.awt.*;

import gpdraw.*;

public class sunburst {
	public SketchPad myPaper = new SketchPad(1800, 1800);
	public DrawingTool myPencil = new DrawingTool(myPaper);
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sunburst burst = new sunburst();
		burst.draw();
	} */
	
	public void draw(){
		while(true){
			int i = 0;
			while(i<=360){
				switch(i % 10){
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
				}
				myPencil.setWidth(5);
				myPencil.forward(300);
				myPencil.backward(300);
				myPencil.setDirection(i);
				i++;
			}
			i = 0;
			while(i<=360){
				myPencil.setColor(Color.white);
				myPencil.setWidth(5);
				myPencil.forward(300);
				myPencil.backward(300);
				myPencil.setDirection(i);
				i++;
			}
		}
	}
}
	