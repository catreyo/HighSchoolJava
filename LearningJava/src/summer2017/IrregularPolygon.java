package summer2017;

import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import java.util.Iterator;
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon {
	private ArrayList <Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();
	private ArrayList<Double> peri = new ArrayList<Double>();
	private DrawingTool myPencil;
	private SketchPad myPaper;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IrregularPolygon ip = new IrregularPolygon();
		ip.add(new Point2D.Double(20, 10));
		ip.add(new Point2D.Double(70,20));
		ip.add(new Point2D.Double(50,50));
		ip.add(new Point2D.Double(0,40));
		ip.draw();
		System.out.println(ip.perimeter());
//		System.out.println(ip.area());
	}

	// public methods
	public void add(Point2D.Double aPoint) {
		myPolygon.add(aPoint);
	}
	public void draw() {
		myPaper = new SketchPad(500, 500);
		myPencil = new DrawingTool(myPaper);
		myPencil.up();
		Point2D.Double first = myPolygon.get(0);
		myPencil.move(first.x, first.y);
		myPencil.down();
		java.util.Iterator<Point2D.Double> iter = myPolygon.iterator();
		while(iter.hasNext()){
		     Point2D.Double next = iter.next();
		     myPencil.move(next.x, next.y);
		}
		myPencil.move(first.x, first.y);
	}
	public double perimeter() {
		int size =  myPolygon.size();
		for (int i = 0; i < size-1; i++) {
			double p = 0;
			Point2D.Double point01 = myPolygon.get(i);
			Point2D.Double point02 = myPolygon.get(i+1);
			p = Math.pow(Math.pow(point02.x - point01.x, 2.0) + Math.pow(point02.y - point01.y, 2.0), 0.5);
			peri.add(p);
		}
		Point2D.Double f = myPolygon.get(0);
		Point2D.Double l = myPolygon.get(size-1);
		peri.add(Math.pow(Math.pow(l.x - f.x, 2.0) + Math.pow(l.y - f.y, 2.0), 0.5));
		Iterator<Double> lengths = peri.iterator();
		double perimeter = 0;
		while(lengths.hasNext()){
			double nextup = lengths.next();
			perimeter = nextup + perimeter;
		}
		return perimeter;
	}
//	public double area() { }
}