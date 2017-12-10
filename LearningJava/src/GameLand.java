import java.util.Random;

public class GameLand {
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLand game = new GameLand();
		game.game();
	} */
	
	int boardPos1 = 0;
	int boardPos2 = 0;
	
	public int randomGetter(){
		Random randomGenerator = new Random();
		int randomVar = randomGenerator.nextInt(12 - 2 + 1) + 2;
		return randomVar;
	}
	
	public void game(){
		while(true){
			int playerOne = this.randomGetter();
			int playerTwo = this.randomGetter();
			if(boardPos1 >= 100 || boardPos2 >= 100){
				System.out.println("Game over. Player one has " + boardPos1 + ", Player two has " + boardPos2 + ".");
				break;
			}
			else{
				if ((playerOne != 2 && playerOne != 12) && (playerTwo != 2 && playerTwo != 12)){
					boardPos1 = playerOne + boardPos1;
					System.out.println("Player one rolled " + playerOne + " so is now at posistion " + boardPos1);
					boardPos2 = playerTwo + boardPos2;
					System.out.println("Player two rolled " + playerTwo + " so is now at posistion " + boardPos2);
				}else if((playerOne == 2 || playerOne == 12) && (playerTwo != 2 && playerTwo != 12)){
					System.out.println("Player one loses turn");
					boardPos2 = playerTwo + boardPos2;
					System.out.println("Player two rolled " + playerTwo + " so is now at posistion " + boardPos2);
				}else if((playerOne != 2 && playerOne != 12) && (playerTwo == 2 || playerTwo == 12)){
					System.out.println("Player two loses turn");
					boardPos1 = playerOne + boardPos1;
					System.out.println("Player one rolled " + playerOne + " so is now at posistion " + boardPos1);
				}
			}
		}
	}
}