import java.util.Scanner;

public class checkmail {

	Scanner in = new Scanner(System.in);
	int height = 0;
	int width = 0;
	int length = 0;
	int weight = 0;
	int inches = 0;

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkmail mail = new checkmail();
		mail.scan();
		mail.reveal();
	} */
	
	public void scan(){
		
		System.out.print("Height: ");
		height = in.nextInt();
		System.out.print("Width: ");
		width = in.nextInt();
		System.out.print("Length: ");
		length = in.nextInt();
		System.out.print("Weight: ");
		weight = in.nextInt();

	}
	
	public void reveal(){
		inches = height + width + length;
		if ((weight > 70) && (inches > 100)){
			System.out.println("Package is too big and heavy.");
		}
		else if (weight > 70){
			System.out.println("Package is too heavy.");
		}
		else if (inches > 100){
			System.out.println("Package is too big.");
		}
		else {
			System.out.println("Your package can be accepted.");
		}
	}
}
