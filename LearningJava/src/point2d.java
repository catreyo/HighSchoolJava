import java.util.Random;

public class point2d {
	int x = 0;
	int y = 0;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private int randomGetter(){
		Random randomGenerator = new Random();
		int randomVar = randomGenerator.nextInt(500);
		return randomVar;
	}
	
	public point2d(int number){
		x = randomGetter();
		y = randomGetter();

		switch(number){
			case 1:
				break;
			case 2:
				x = x-500;
				break;
			case 3:
				x = x-500;
				y = y-500;
				break;
			case 4:
				y = y-500;
				break;
			default: System.out.print("ERROR");
				break;
		}
	}
}
