import java.io.File;
import java.io.IOException; 
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.*;

public class Logic
{
    public Celebrity[] pictures(){
        Celebrity[] celebArr = 
            {new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\amanda.jpg"), "Amanda Cerny"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\angelina.jpg"), "Angelina Jolie"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\asadh.jpg"), "Asadh Khalid"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\bean.jpg"), "Mr. Bean"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\beyonce.png"), "Beyonce"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\brady.png"), "Tom Brady"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\brenda.jpg"), "Brenda Song"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\cardib.jpg"), "Cardi B"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\chloe.jpg"), "Chloe Bennet"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\chris.png"), "Chris Tucker"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\DannyDeVito.jpg"), "Danny DeVito"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\drake.jpg"), "Drake"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\edsheeran.jpg"), "Ed Sheeran"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\ElChapo.jpg"), "El Chapo"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Eminem.jpg"), "Eminem"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\fed.jpg"), "Rodger Federererererere"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\guyfieri.jpg"), "Guy Fieri"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\hashimamla.jpg"), "Hashim Amla?"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\jackie.jpg"), "Jackie Chan"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\jlo.jpg"), "J Lo"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\katrinakaif.jpg"), "Katrina Kaif"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Kenan.jpg"), "Kenan Thompson"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\kevinhart.jpg"), "Kevin Hart"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Khaled.jpg"), "DJ Khaled"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Kim.jpg"), "Kim K"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\KimJong.jpg"), "Kim Jong Un"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\ksidad.jpg"), "KSI's Dad"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Lebron.jpg"), "LeBron James"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\malinga.png"), "Malinga"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\modi.jpg"), "Modi"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Mogly.jpg"), "Mogly"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\moseby.png"), "Moseby"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\nav.jpg"), "NAV"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\obama.jpg"), "Obama"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Putin.jpg"), "Putin"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\rocky.jpg"), "Rocky Balboa"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\selena-gomez.jpg"), "Selena Gomez"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\Serena.jpg"), "Serena Williams"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\ShahRukh.jpg"), "Shah Rukh Khan"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\stevemartin.jpg"), "Steve Martin"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\taylor.jpg"), "Taylor Swift"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\TomCruise.jpg"), "Tom Cruise"),
                new Celebrity(new File("C:\\Users\\fhsplab\\Desktop\\JavaCoding\\Celeb\\SosCompCeleb\\CelebrityFolder\\trump.jpg"), "Donald J. Trump")};
        return celebArr;
    }
    
    public void game(){
        Celebrity[] celebs = pictures();
        double[] conf = new double[celebs.length];
        recognizeTest rec = new recognizeTest();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        File user = null;
        GUI g = new GUI();
        if (result == JFileChooser.APPROVE_OPTION) {
            user = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + user.getAbsolutePath());
        }

        //File user = new File("C:\\Users\\fhsplab\\Desktop\\SosCompCeleb\\sos.jpg");
        for(int i = 0; i < conf.length; i++) {
            try {
                conf[i] = rec.runAPI(user, celebs[i].getFile());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }       
        int maxIndex = 0;
        double max = conf[0];
        System.out.println();
        for(int i = 0; i < conf.length; i++) {
            if(max < conf[i]) {
                max = conf[i];
                maxIndex = i;
                System.out.println("Max Index: " + maxIndex + " Num: " + conf[i]);
            }
            System.out.println(conf[i]);
        }
        System.out.println();
        System.out.println(maxIndex);
        try {
            g.close();
            displayImage(celebs[maxIndex].getFile(), user,  celebs[maxIndex].getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public void displayImage(File URL, File User, String name) throws IOException {

        JFrame frame=new JFrame();

        Image first = ImageIO.read(URL);
        Image img = first.getScaledInstance(500, 667,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(10, 10, 350, 400);
        imageLabel.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(imageLabel);
 
        Image second = ImageIO.read(User);
        Image img2 = second.getScaledInstance(500, 667,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon(img2);
        JLabel imageLabel2 = new JLabel(image2);
        imageLabel2.setBounds(40, 10, 350, 400);
        imageLabel2.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(imageLabel2);

        JLabel label1 = new JLabel(name);
        frame.add(label1);
        frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JButton button = new JButton("Play Again!");
        JButton button2 = new JButton("Quit");
        //frame.add(button);
        frame.add(button2);
    }
    
    public void actionPerformed(ActionEvent event) 
    {
        System.exit(0);
    }
}
