import java.util.Scanner;

public class fibonacci {
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		int i = 0;
		System.out.print("Enter: ");
		int max = enter.nextInt();
		while (i<=max){
		System.out.println(i + "=" + Integer.toString(fib(i)));
		i++;
		}
		enter.close();
	} */
	public static int fib(int n){
		if (n==1){
			return 1;
		}
		else if (n<=0){
			return 0;
		} else {
			int a = fib(n-2);
			int b = fib(n-1);
			return (a+b);
		}
	}

}
