import java.util.Scanner;

public class fedtax {

	Scanner in = new Scanner(System.in);
	int married = 0;
	int taxableincome = 0;
	int federaltax = 0;
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fedtax tax = new fedtax();

	} */
	public void values(){
		System.out.print("Enter marital status (1=single, 2=married): ");
		married = in.nextInt();
		System.out.print("Enter taxable income: ");
		taxableincome = in.nextInt();
	}
	public void calculate(){
		
	}
}
