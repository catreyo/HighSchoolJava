import java.util.Scanner;
public class romanNumeral {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		System.out.print("--> ");
		int arabic = enter.nextInt();
		romanConv(arabic);
		enter.close();
	}*/
	
	public static String romanConv(int arabic){
		boolean usesubrule = true;
		String apnd = "";
		int i=0;
		for(i=3; i>=0; i--){
			if((arabic/Math.pow(10, i))>=1){
				usesubrule = level.subtract((int)(arabic/Math.pow(10, i)*Math.pow(10, i)));
				if(usesubrule){
					int newArabic = (int)((arabic/Math.pow(10, i))*Math.pow(10, i));
					int newSmall = level.getSmlten(newArabic);
					apnd = level.charlevel(newSmall) + level.charlevel(newArabic+newSmall);
				}
				else{
					int newArabic = (int)((arabic/Math.pow(10, i))*Math.pow(10, i));
					int newSmall = level.getSmlten(newArabic);
					if (newArabic>(newSmall*5)){
						apnd = level.charlevel(newArabic-(newSmall*5)/newSmall);
					}else{
						apnd = level.charlevel(newArabic+newSmall);
					}
				}
			}
		}
		return apnd;
	}
	
}