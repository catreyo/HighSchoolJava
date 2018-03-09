import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver
{
	public static void main(String args[]) {
		Celebrity[] celebArr = 
                   {new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\amanda.jpg"), "Amanda Cerny"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\angelina.jpg"), "Angelina Jolie"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\asadh.jpg"), "Asadh Khalid"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\bean.jpg"), "Mr. Bean"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\beyonce.png"), "Beyonce"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\brady.png"), "Tom Brady"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\brenda.jpg"), "Brenda Song"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\cardib.jpg"), "Cardi B"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\chloe.jpg"), "Chloe Bennet"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\chris.png"), "Chris Tucker"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\DannyDeVito.jpg"), "Danny DeVito"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\drake.jpg"), "Drake"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\edsheeran.jpg"), "Ed Sheeran"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\ElChapo.jpg"), "El Chapo"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Eminem.jpg"), "Eminem"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\fed.jpg"), "Rodger Federererererere"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\guyfieri.jpg"), "Guy Fieri"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\hashimamla.jpg"), "Hashim Amla?"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\jackie.jpg"), "Jackie Chan"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\jlo.jpg"), "J Lo"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\katrinakaif.jpg"), "Katrina Kaif"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Kenan.jpg"), "Kenan Thompson"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\kevinhart.jpg"), "Kevin Hart"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Khaled.jpg"), "DJ Khaled"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Kim.jpg"), "Kim K"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\KimJong.jpg"), "Kim Jong Un"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\ksidad.jpg"), "KSI's Dad"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Lebron.jpg"), "LeBron James"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\malinga.png"), "Malinga"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\modi.jpg"), "Modi"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Mogly.jpg"), "Mogly"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\moseby.png"), "Moseby"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\nav.jpg"), "NAV"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\obama.jpg"), "Obama"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Putin.jpg"), "Putin"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\rocky.jpg"), "Rocky Balboa"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\selena-gomez.jpg"), "Selena Gomez"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\Serena.jpg"), "Serena Williams"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\ShahRukh.jpg"), "Shah Rukh Khan"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\stevemartin.jpg"), "Steve Martin"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\taylor.jpg"), "Taylor Swift"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\TomCruise.jpg"), "Tom Cruise"),
                    new Celebrity(new File("C:\\tools\\CelebRecognize\\CelebrityFolder\\trump.jpg"), "Donald J. Trump")};
		double[] conf = new double[celebArr.length];
		recognizeTest rec = new recognizeTest();
		/*Scanner in = new Scanner(System.in);
		System.out.println("Location of your picture: ");
		String url = in.next();
		File user = new File(url);*/
		File user = new File("C:\\Users\\Atreyo\\Pictures\\Camera Roll\\alyssa.jpg");
		for(int i = 0; i < conf.length; i++) {
			try {
				conf[i] = rec.runAPI(user, celebArr[i].getFile());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		int maxIndex = 0;
		double max = conf[0];
		for(int i = 0; i < conf.length; i++) {
			if(max < conf[i]) {
				max = conf[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println(maxIndex);
		try {
			rec.displayImage(celebArr[maxIndex].getFile(), celebArr[maxIndex].getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}