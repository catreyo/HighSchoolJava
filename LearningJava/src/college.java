public class college extends Student{
	public college(String name, int age, String gender, String idNum, double gpa, String amajor, int ayear) {
		super(name, age, gender, idNum, gpa);
		major = amajor;
		year = ayear;
		// TODO Auto-generated constructor stub
	}
	private String major = "";
	private int year = 0;
	
	public String getMajor() {
		return major;
	}
	public int getYear() {
		return year;
	}

	public String toString(){
		return super.toString() + "Major: " + major + "Year: " + year;
	}
}