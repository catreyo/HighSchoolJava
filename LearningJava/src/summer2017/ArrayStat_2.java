package summer2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStat_2 {

	Scanner in = null;
	Scanner read = null;
	File nums = new File("C:\\tools\\numbers.txt");
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStat_2 stats = new ArrayStat_2();
		stats.creator();
	} */
	
	public void creator() {
		int i;
		int length=0;
		
		//finds number of values in file
		try {
			in = new Scanner(nums);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(in.hasNext()) {
		    in.nextLine();
		    length++;
		}
		in.close();
		System.out.println("# of values: " + length);
		
		//assigns numbers to array num_list[]
		try {
			read = new Scanner(nums);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num_list[] =  new int[length];
		for (i = 0; i < length; i++) {
			num_list[i] = read.nextInt();
		}
		
		//Find average of number set
		double tot = 0;
		for (i = 0; i < length; i++) {
			tot = tot + num_list[i];
		}
		double avg = tot/length;
		System.out.println("Sum: " + tot);
		System.out.println("Average: " + avg);
		
		//Sort
		Arrays.sort(num_list);

		//Find median of number set
		int med_val = (length/2);
		if (length%2 > 0) {
			System.out.println("Median: " + num_list[med_val]);
		} else {
			double med_avg = (num_list[med_val] + num_list[med_val+1])/2;
			System.out.println("Median: " + med_avg);
		}
		
		//Find mode of number set
		int mode_counter[] = new int[num_list[length-1]+1];
		for (i = 0; i < length-1; i++) {
			mode_counter[num_list[i]]++;
		}
		int max = mode_counter[0];
		for (i = 0; i < mode_counter.length; i++) {
			if (mode_counter[i] > max) {
				max = mode_counter[i];
			}
		}
		System.out.println("Mode: " + max);
		
		//Find range of the number set
		System.out.println("Range: " + num_list[0] + " to " + num_list[length-1]);
	}
}