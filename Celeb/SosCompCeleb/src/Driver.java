import java.io.File;
import java.io.IOException; 
import javax.swing.JFileChooser;
import java.io.File;

public class Driver
{
    public static void main(String args[]) {
        Celebrity[] celebArr = 
                   {new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\amanda.jpg"), "Amanda Cerny"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\angelina.jpg"), "Angelina Jolie"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\asadh.jpg"), "Asadh Khalid"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\bean.jpg"), "Mr. Bean"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\beyonce.png"), "Beyonce"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\brady.png"), "Tom Brady"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\brenda.jpg"), "Brenda Song"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\cardib.jpg"), "Cardi B"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\chloe.jpg"), "Chloe Bennet"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\chris.png"), "Chris Tucker"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\DannyDeVito.jpg"), "Danny DeVito"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\drake.jpg"), "Drake"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\edsheeran.jpg"), "Ed Sheeran"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\ElChapo.jpg"), "El Chapo"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Eminem.jpg"), "Eminem"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\fed.jpg"), "Rodger Federererererere"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\guyfieri.jpg"), "Guy Fieri"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\hashimamla.jpg"), "Hashim Amla?"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\jackie.jpg"), "Jackie Chan"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\jlo.jpg"), "J Lo"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\katrinakaif.jpg"), "Katrina Kaif"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Kenan.jpg"), "Kenan Thompson"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\kevinhart.jpg"), "Kevin Hart"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Khaled.jpg"), "DJ Khaled"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Kim.jpg"), "Kim K"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\KimJong.jpg"), "Kim Jong Un"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\ksidad.jpg"), "KSI's Dad"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Lebron.jpg"), "LeBron James"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\malinga.png"), "Malinga"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\modi.jpg"), "Modi"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Mogly.jpg"), "Mogly"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\moseby.png"), "Moseby"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\nav.jpg"), "NAV"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\obama.jpg"), "Obama"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Putin.jpg"), "Putin"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\rocky.jpg"), "Rocky Balboa"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\selena-gomez.jpg"), "Selena Gomez"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\Serena.jpg"), "Serena Williams"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\ShahRukh.jpg"), "Shah Rukh Khan"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\stevemartin.jpg"), "Steve Martin"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\taylor.jpg"), "Taylor Swift"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\TomCruise.jpg"), "Tom Cruise"),
                    new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\CelebrityFolder\\trump.jpg"), "Donald J. Trump")};
        double[] conf = new double[celebArr.length];
        recognizeTest rec = new recognizeTest();
        
    
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        File user = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            user = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + user.getAbsolutePath());
        }

        //File user = new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\sos.jpg");
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
            rec.displayImage(celebArr[maxIndex].getFile(), user,  celebArr[maxIndex].getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

}