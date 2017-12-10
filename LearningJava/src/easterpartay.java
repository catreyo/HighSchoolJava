
public class easterpartay {
	
	/*public static void main(String[] args){ 
		// TODO Auto-generated method stub
	
		easterpartay party = new easterpartay();
		party.cal_date();
		
	}*/
	
	public int year = 2016;
	public void cal_date(){
		int a = year%19;
		int b = year/100;
		int c = year%100;
		int d = b/4;
		int e = b%4;
		int big_one = b+8;
		int f = big_one/25;
		int big_two = b-f+1;
		int g = big_two/3;
		int big_three = 19*a+b-d-g+15;
		int h = big_three%30;
		int i = c/4;
		int k = c%4;
		int big_four = 32+2*e+2*i-h-k;
		int r = big_four%7;
		int big_five = a+11*h+22*r;
		int m = big_five/451;
		int big_six = h+r-7*m+114;
		int n = big_six/31;
		int p = big_six%31;
		int month = p+1;
		System.out.println("So, the easter of " + year + " will fall on " + n + "/" + month + ".");
	}
}
