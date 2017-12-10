
public class car {
	private int old_odo_reading = 0;
	private int new_odo_reading = 0;
	private double gallons = 0;
	
	public car(int init_odo){
		old_odo_reading = init_odo;
	}
	public void fill_up(int current_odo, double gal){
		new_odo_reading = current_odo;
		gallons = gal;
	}
	public double calculate_mpg(){
		if(new_odo_reading > 0){
			return (new_odo_reading - old_odo_reading)/gallons;
		}
		else{
			return 0.0;
		}
	}
	public void reset_mpg(){
		if(new_odo_reading > 0){
			old_odo_reading = new_odo_reading;
		}
		gallons = 0;
	}
}
