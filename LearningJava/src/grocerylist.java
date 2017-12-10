import java.util.Scanner;

public class grocerylist {

	Scanner in = new Scanner(System.in);
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub 
		grocerylist grocery = new grocerylist();
		grocery.scan();
		grocery.reveal();
	} */
	
	public void scan(){
		
		System.out.print("Enter Item #1: ");
		num1 = in.nextInt();
		System.out.print("Enter Item #2: ");
		num2 = in.nextInt();
		System.out.print("Enter Item #3: ");
		num3 = in.nextInt();
		System.out.print("Enter Item #4: ");
		num4 = in.nextInt();

	}
	
	public void reveal(){
		
		System.out.print(num1 + ", " + num2 + ", " + num3 + ", " + num4 + "\n");
		System.out.println(num1 + num2 + num3 + num4);
		
	}

}
