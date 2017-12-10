public class reverseStr {

	public static final String spc = ",' -+";
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String x = "He,,, World";
		//System.out.println(x.substring(3, 4).equals(","));
		
		String mrclean = stripe("Madam, I'm Adam");
		String mrsclean = reverse(mrclean);
		System.out.println(mrclean);
		System.out.println(mrsclean);
		if (mrclean.equalsIgnoreCase(mrsclean)){
			System.out.print("Yay!");
		}
		
	}*/

	public static String reverse(String a){
		String c = "";
		for(int i=a.length()-1;i>=0;i--){
			c = c+a.charAt(i);
		}
		return c;
	}
	
	public static String stripe(String a){
		String str = "";
		for(int i=0;i<a.length();i++){
			System.out.print(a.charAt(i));
			if(spc.indexOf(a.substring(i,i+1))<0){
				str = str + a.charAt(i);
			}
		}
		return str.toLowerCase();
	}
	
	
}