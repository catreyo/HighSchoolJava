package summer2017;

import java.util.*;

public class DiffDice {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffDice calc = new DiffDice();
		calc.dice();
	} */
	
	public int rand(){
		Random a = new Random();
		return a.nextInt(6)+1;
	}
	
	private void dice(){
		int counter = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		while(true){
			a = rand();
			b = rand();
			c = rand();
			counter++;
			if(a==b || a==c || b==c){
				System.out.println(a+" "+b+" "+c);
			}else{
				System.out.println(a+" "+b+" "+c);
				System.out.println("count = " + counter);
				break;
			}
		}
	}
} 	