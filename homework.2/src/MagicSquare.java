/* 
 * A Magic Square is a square array of numbers consisting of the distinct positive integers 1, 2, ..., n^2 arranged such that the sum of the n numbers in any horizontal, vertical, or main diagonal line is always the same number, known as the magic constant.
 * 
 * 1. Put the first number in the middle column of the top row.
 * Put the next number in the box moved one column to the right and one row up.
 * If the number exceeds a column or a row, place it in the opposite side of that column or row.
 * 3. Repeat steps 2 'n' times just before you reach the original starting postiion.
 * 4. Place the next number in the same column one row below the last number and continuue with step 2.
 * 
 * Basically, you're placubg the nnymbers in consecutive order diagonally up and to the right until all spaces are filled.
 */

public class MagicSquare {

	public static void main(String[] args) {

		// create a 2D array of size 5x5
		int n = 5;
		int[][] magicSquare = new int[n][n];

		int row = 0; 		// top row
		int col = n / 2;	// middle column
		int lastRow = 0;	// last row of the previous number
		int lastCol = 0;	// last column of the previous number
		int num = 1; 		// first number
		
		while (num <= n * n) {
			// place the first number
			magicSquare[row][col] = num;

			lastRow = row;
			lastCol = col;
			num++;

			// place the next number in the box moved one column to the right and one row up
			row--;
			col++;

			// if the number exceeds a column or a row, place it in the opposite side of that column or row
			if (row < 0) {
				row = n - 1;
			}
			if (col > n - 1) {
				col = 0;
			}

			// if the box is already filled, place the number in the box below the last number
			if (magicSquare[row][col] != 0) {
				row = lastRow + 1;
				col = lastCol;
				
				// if the number goes out of the square (below), place it in the top row
				if (row > n - 1) {
					row = 0;
				}
			}
		}
		for (int i = 0; i < magicSquare.length; i++) {
			for (int j = 0; j < magicSquare[i].length; j++) {
				// print the magic square, but make sure the numbers are aligned
				System.out.printf("%2d ", magicSquare[i][j]);
			}
			System.out.println();
		}

	}

}
