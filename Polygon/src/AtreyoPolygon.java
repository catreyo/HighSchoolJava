import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import java.util.Iterator;
import gpdraw.*;            // for DrawingTool

public class AtreyoPolygon implements Polygon {
    private ArrayList <Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();
    private ArrayList<Double> peri = new ArrayList<Double>();
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    // public methods
    public void add(Point2D.Double aPoint) {
        myPolygon.add(aPoint);
    }
    public String getName(){
        return "Atreyo";
    }
    public void draw() {
        myPaper = new SketchPad(200, 200);
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
        if (myPolygon.size() == 2) {
            Point2D.Double point01 = myPolygon.get(0);
            Point2D.Double point02 = myPolygon.get(1);
            return point01.distance(point02);
        }
        for (int i = 0; i < myPolygon.size()-1; i++) {
            double p = 0;
            Point2D.Double point01 = myPolygon.get(i);
            Point2D.Double point02 = myPolygon.get(i+1);
            p = Math.pow(Math.pow(point02.x - point01.x, 2.0) + Math.pow(point02.y - point01.y, 2.0), 0.5);
            peri.add(p);
        }
        Point2D.Double f = myPolygon.get(0);
        Point2D.Double l = myPolygon.get(myPolygon.size()-1);
        peri.add(Math.pow(Math.pow(l.x - f.x, 2.0) + Math.pow(l.y - f.y, 2.0), 0.5));
        Iterator<Double> lengths = peri.iterator();
        double perimeter = 0;
        while(lengths.hasNext()){
            double nextup = lengths.next();
            perimeter = nextup + perimeter;
        }
        return perimeter;
    }
    public double area() {
        if (myPolygon.size() == 2) {
            return 0;
        }
        double area = 0.0;
        Point2D.Double first = myPolygon.get(0);
        Point2D.Double last = myPolygon.get(myPolygon.size()-1);
        for(int i = 0; i < myPolygon.size()-1; i++) {
            Point2D.Double point01 = myPolygon.get(i);
            Point2D.Double point02 = myPolygon.get(i+1);
            area += (point01.x * point02.y) - (point01.y * point02.x);
        }
        area += (last.x * first.y) - (last.y * first.x);
        return Math.abs(area/2.0);
    }
}