public class piglatinator {

	public static final String spc = "aeiouAEIOU";
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Get ready and pick up your computer";
		System.out.print(str(sentence));
	}*/
	
	public static String str(String a){
		String word = "";
		String pigWord = "";
		int vowelPosition = -69;
		int spacePosition = a.indexOf(" ");
		if(spacePosition<0 && a.length()>0){
			word = a;
		}
		else{
			word = a.substring(0,spacePosition);
		}
		for(int i=0;i<word.length();i++){
			if(spc.indexOf(word.substring(i,i+1))>=0){
				vowelPosition = i;
				break;
			}
		}
		if(vowelPosition==0){
			pigWord = (word + "yay");
		}
		else{
			String substart = word.substring(0,vowelPosition);
			String subend = word.substring(vowelPosition);
			String start = substart.toLowerCase();
			String end = subend.toLowerCase();
			if(!word.toLowerCase().equals(word)){
				end = end.substring(0,1).toUpperCase() + end.substring(1);
			}
			pigWord = (end + start + "ay");
		}
		if(spacePosition==-1){
			return pigWord;
		}
		else{
			return pigWord + " " + str(a.substring(spacePosition+1));
		}
	}
}
