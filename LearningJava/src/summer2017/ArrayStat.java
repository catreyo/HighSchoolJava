package summer2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayStat {

	int y;
	int[] num;
	int[] sorted;
	Scanner in = null;
	int sum = 0;
	File nums = new File("C:\\tools\\numbers.txt");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStat stats = new ArrayStat();
		stats.array();
		stats.average();
	}
	
	
	public int counter() {
		try {
			in = new Scanner(nums);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x = 0;
		while(in.hasNext()) {
		    //String val = 
		    in.nextLine();
			x++;
		}
		in.close();
		return x;
	}
	
	public void array() {
		int amount = counter();
		num = new int[amount];
		sorted = new int[amount];
		Scanner read_val_in=null;
		try {
			read_val_in = new Scanner(nums);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(y=0; y<amount; y++) {
			num[y] = read_val_in.nextInt();
		}
		for(y=0; y<amount; y++) {
			if(num[y+1] < num[y]) {
				sorted[y] = num[y+1];
			} else {
				sorted[y] = num[y];
			}
			//System.out.println(sorted[y]);
		}		
	}
	
	
	public void average() {
		for(y=0; y<num.length; y++) {
			sum = sum + num[y];
		}
		System.out.println("Average: " + sum/counter());
	}

}