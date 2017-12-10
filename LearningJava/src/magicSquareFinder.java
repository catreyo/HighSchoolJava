public class magicSquareFinder{	
	
	/*public static void main(String[] args) {
	// TODO Auto-generated method stub
		magicSquareFinder finder = new magicSquareFinder();
		System.out.println("GCF:" + finder.gcf(100, 10));
		System.out.println("LCM:" + finder.lcm(100, 10));
		//System.out.print(finder.nextPrime(3));
	}*/
	
	public void loop(int n){
		int i = 1;
		int consec = 0;
		int tot = 0;

		while (true) {
			consec++;
			tot = tot + consec;
			if(Math.sqrt(tot)%1==0){
				if(tot>1){
					System.out.println(tot);
					i++;
					if(i > n){
						break;
					}
				}
			}
		}
	}
	
	//finds prime #s
	public int nextPrime(int strtPrm){
		int number = strtPrm;
		if(number == 3){
			return 5;
		}else{
			boolean isPrime = true;
			int i = 0;
			int half = number/2;
			while (true){
				i = 2;
				number++;
				while (i <= half){
					if((number*1.0/i)%1!=0){
						i++;
						isPrime = true;
					}else{
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					return number;
				}
			}
		}
	}
	public int lcm(int one, int two){
		int currentPrm = 2;
		while(true){
			if(((one*1.0/currentPrm)%1==0) && ((two*1.0/currentPrm)%1==0)){
				one = one/currentPrm;
				two = two/currentPrm;
				return currentPrm * lcm(one, two);
			}else{
				currentPrm = this.nextPrime(currentPrm);
				if ((currentPrm > one) || (currentPrm > two)){
					return one*two;
				}
			}
		}
	}
	public int gcf(int one, int two){
		int currentPrm = 2;
		while(true){
			if(((one*1.0/currentPrm)%1==0) && ((two*1.0/currentPrm)%1==0)){
				one = one/currentPrm;
				two = two/currentPrm;
				return currentPrm * gcf(one, two);
			}else{
				currentPrm = this.nextPrime(currentPrm);
				if ((currentPrm > one) || (currentPrm > two)){
					return 1;
				}
			}
		}
	}
}