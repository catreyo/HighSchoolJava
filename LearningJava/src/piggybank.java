public class piggybank {
	private int penny = 0;
	private int nickel = 0;
	private int dime = 0;
	private int quarter = 0;
	public piggybank(int Xpenny, int Xnickel, int Xdime, int Xquarter){
		penny = Xpenny;
		nickel = Xnickel;
		dime = Xdime;
		quarter = Xquarter;
	}
	public int getPenny(){
		return penny;
	}
	public int getNickel(){
		return nickel;
	}
	public int getDime(){
		return dime;
	}
	public int getQuarter(){
		return quarter;
	}
	public void addCoins(int Xpenny, int Xnickel, int Xdime, int Xquarter){
		penny += Xpenny;
		nickel += Xnickel;
		dime += Xdime;
		quarter += Xquarter;
	}
	public double getTotal(){
		return (penny + nickel*5 + dime*10 + quarter*25)/100.0;
	}
}
