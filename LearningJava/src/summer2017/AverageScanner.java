package summer2017;

import java.io.*;
import java.util.*;

public class AverageScanner {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageScanner avg = new AverageScanner();
		avg.scan();
	} */
	
	private void scan(){
		double tot = 0;
		int n = 0;
		double counter = 0;
		File num = new File("C:\\tools\\numbers.txt");
		Scanner in;
		try{
			in = new Scanner(num);
			while(in.hasNext()){
			    String val = in.nextLine();
			    n = Integer.parseInt(val);
			    tot = tot + n;
			    counter++;
			}
			System.out.print(tot / counter);
		}catch(IOException i){
		     System.out.println("Error: " + i.getMessage());
		}catch(NumberFormatException z){
			 System.out.print("This is not an number fool.");
		}
	}
}