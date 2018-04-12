public class Teacher extends Person {
	private String subject;
	private double salary;
	
	public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
		super(myName, myAge, myGender);
		setSubject(mySubject);
		setSalary(mySalary);
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){
		return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}
}
