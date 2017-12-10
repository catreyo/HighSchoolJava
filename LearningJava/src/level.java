public class level {
	public static String charlevel(int arabic){
		String roman = "";
		switch(arabic){
			case 1: roman = "I";
					break;
			case 5: roman = "V";
					break;
			case 10: roman = "X";
					break;
			case 50: roman = "L";
					break;
			case 100: roman = "C";
					break;
			case 500: roman = "D";
					break;
			case 1000: roman = "M";
					break;
			default: System.out.print("None.");
		}
		System.out.print(roman);
		return roman;
	}

	public static int strlevel(String roman){
		int arabic = 0;
		switch(roman){
			case "I": arabic = 1;
					break;
			case "V": arabic = 5;
					break;
			case "X": arabic = 10;
					break;
			case "L": arabic = 50;
					break;
			case "C": arabic = 100;
					break;
			case "D": arabic = 500;
					break;
			case "M": arabic = 1000;
					break;
			default: System.out.print("None.");
		}
		System.out.print(arabic);
		return arabic;
	}
	public static int getBigten(int arabic){
		int bigTen = 0;
		for(int i=0; i<=3; i++){
			if((arabic/Math.pow(10, i))<=1){
				bigTen = (int)(Math.pow(10, i));
				break;
			}
		}
		return bigTen;
	}
	public static int getSmlten(int arabic){
		int smlTen = 0;
		for(int i=0; i<=3; i++){
			if((arabic/Math.pow(10, i))<=1){
				if(i==0){
					smlTen = 1;
				}else{
					smlTen = (int)(Math.pow(10, i-1));
				}
				break;
			}
		}
		return smlTen;
	}
	public static boolean subtract(int arabic){
		int small = getSmlten(arabic);
		int big = getBigten(arabic);
		if(((big-small)<=arabic) || (((big/2-small)>=arabic) && ((big/2)>arabic))){
			return true;
		}else{
			return false;
		}
	}
}
