public class ToeBro
{
    public static void main(String args[]){
        TicTac toe = new TicTac();
        toe.setDimension();
        toe.fill();
        toe.display();
        while(true) {
        	toe.add(true, toe.promptUser());
        	toe.display();
        }
    }
}