package summer2017;

import java.util.Scanner;

public class MagicSquare {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicSquare magic = new MagicSquare();
		magic.sq();
	} */
	
	private void sq() {
		int i = 1;
		int tot = 0;
		int n = 0;
		int amount = 0;
		Scanner enter = new Scanner(System.in);
		System.out.print("How many? -->");
		amount = enter.nextInt();
		enter.close();
		while(true){
			int sqre = i*i;
			if(amount>0){
				while(true){
					if(tot<sqre){
						tot = tot + n;
						n = n+1;
					}
					else if(tot==sqre){
						System.out.println(sqre);
						amount--;
						i++;
						break;
					}
					else{
						i++;
						break;
					}
				}
			}else{
				break;
			}
		}
	}
}