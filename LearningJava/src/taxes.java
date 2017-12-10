public class taxes {
	private double hours = 0;
	private double rate = 0;
	private double gross = 0;
	public taxes(double hour_work, double hour_rate){
		hours = hour_work;
		rate = hour_rate;
		System.out.println("Hours worked: " + hour_work);
		System.out.println("Hourly rate: " + hour_rate);
	}
	public void getGross(){
		gross = hours*rate;
		System.out.println("Gross pay: " + gross);
	}
	public void getFedtax(){
		gross = hours*rate;
		double fed = gross*0.154;
		System.out.println("Fedaral Tax (15.4%): " + fed);
	}
	public void getFica(){
		gross = hours*rate;
		double fica = gross*0.0775;
		System.out.println("FICA Tax (7.75%): " + fica);
	}
	public void getState(){
		gross = hours*rate;
		double state = gross*0.04;
		System.out.println("State Tax (7.75%): " + state);
	}
	public static void main(String[] args){
		taxes myTax = new taxes(30.0, 12.35);
		myTax.getGross();
		myTax.getFedtax();
		myTax.getFica();
		myTax.getState();
	}
}