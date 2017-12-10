 
import java.util.Random;

public class KnightsTour {
	public static void main(String args[]) {
		int[][] knight = new int[8][8];
		knight[0][0] = 1;
		int[] horizontal = {1, 2, 2, 1, -1, -2, -2, -1};
		int[] vertical = {-2, -1, 1, 2, 2, 1, -1, -2};
		Random rand = new Random();
		int i = 2; int row = 0; int col = 0;

		while(i <= 64) {
			int moveNum = rand.nextInt(8);
			System.out.println("moveNum is now: " + moveNum);
			row = row + horizontal[moveNum];
			col = col + vertical[moveNum];
			System.out.println("row is now: " + row);
			System.out.println("col is now: " + col);			
			if(row < 8 && row >= 0 && col < 8 && col >= 0) {
				if(knight[row][col] == 0) {
					knight[row][col] = i;
					i++;
					System.out.println("i is: " + i);
				}else {
					int counter = 0;
					for(int n = 0; n <= 7; n++) {
						try {
							if(knight[row + horizontal[n]][col + vertical[n]] != 0) {
								counter++;
							}
						} catch(ArrayIndexOutOfBoundsException e) {
							counter++;
						}
						continue;
					}
					System.out.println("counter is " + counter);
					if(counter != 8) {
						counter = 0;
						continue;
					}else {
						System.out.println("No more options :(");
						break;
					}
				}
			}else {
				row = row - horizontal[moveNum];
				col = col - vertical[moveNum];
				System.out.println("Row/Col reverted");
				continue;
			}
		}
		System.out.println();
		for(int r = 0; r < knight.length; r++) {
			for(int c = 0; c < knight[0].length; c++) {
				System.out.print(String.format("%02d", knight[r][c]) + " ");
			}
			System.out.println();
		}
	}
}