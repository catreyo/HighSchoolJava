package chess;

public class KnightsTour2 {
	public static void main(String args[]) {
		int[][] knight = new int[8][8];
		knight[0][0] = 1;
		int[] horizontal = {1, 2, 2, 1, -1, -2, -2, -1};
		int[] vertical = {-2, -1, 1, 2, 2, 1, -1, -2};
		int i = 2; int row = 0; int col = 0;

		while(i <= 64) {
			boolean stay = false;
			for(int n = 0; n <= 7; n++) {
				try {
					if(knight[row + horizontal[n]][col + vertical[n]] == 0) {
						row =  row + horizontal[n];
						col = col + vertical[n];
						knight[row][col] = i;
						System.out.println("(" + row + "," + col + ") is equal to " + i);
						i++;
						stay = true;
					}
				} catch(ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
			if(!stay) {
				break;
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