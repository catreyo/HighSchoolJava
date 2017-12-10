public class teacher extends Person{
	public teacher(String name, int age, String gender, String asubject, int asalary) {
		super(name, age, gender);
		subject = asubject;
		salary = asalary;
		// TODO Auto-generated constructor stub
	}
	private String subject;
	private int salary;
	
	public String getSubject() {
		return subject;
	}
	public int getSalary() {
		return salary;
	}
	
	public String toString(){
		return super.toString() + "Salary: " + salary + "Subject: " + subject;
	  }
}