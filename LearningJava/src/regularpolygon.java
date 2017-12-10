public class regularpolygon {
	
	private double myNumSides;
	private double mySideLength;
	
	// constructor
	public regularpolygon(double numSides, double sideLength){
		myNumSides = numSides;
		mySideLength = sideLength;
	}
	
	// public methods
	public double vertexAngle(){
		return ((myNumSides-2)/myNumSides)*180;
	}
	public double Perimeter(){
		return (myNumSides*myNumSides);
	}
	public double Area(){
		double largeRad = this.getR();
		return (myNumSides/2)*Math.pow(largeRad, 2)*Math.sin(6.28/myNumSides);
	}
	public double getNumside(){
		return myNumSides;
	}
	public double getSideLength(){
		return mySideLength;
	}
	public double getR(){
		return (mySideLength/2)*1/Math.sin(3.14/myNumSides);
	}
	public double getr(){
		return (mySideLength/2)*1/Math.tan(3.14/myNumSides);
	}
}
