package com.milkdz.annualbonus;

public class AnnualBonus {

	/**
	 * find the best address
	 * 
	 * @param board
	 *            Array of matrices
	 * @return the max sum
	 */
	public int getMost(int[][] board) {

		/**
		 * We assume the input array of matrices as below
		 * 
		 * *************************************** 
		 * 			** 1 2 3 4 5 6 ** 
		 * 			** 2 2 3 4 5 6 **
		 * 			** 3 2 3 4 5 6 ** 
		 * 			** 4 2 3 4 5 6 ** 
		 * 			** 5 2 3 4 5 6 ** 
		 * 			** 6 1 2 3 4 5 **
		 * ***************************************
		 * 
		 * we can think about it as below .
		 * Turn the matrices 45 degree.
		 * 
		 ***************************************************************************
		 * ** 												** 			loop 
		 * ** 												** 
		 * ** 					  1 						** 			  0 
		 * ** 					2   2 						** 			  1 
		 * ** 				  3   2   3 					** 			  2 
		 * ** 				4   2   3   4 					** 			  3 
		 * ** 			  5   2   3   4   5 				** 			  4 
		 * ** 	    	6   2   3   4   5   6 				** 			  5 
		 * ** 			  1   3   4   5   6 				** 			  4 
		 * ** 				2   4   5   6 					** 			  3 
		 * ** 				  3   5   6 					** 			  2
		 * ** 					4   6 						**            1 
		 * ** 					  5 						** 			  0 
		 * ** 												**
		 * *************************************************************************
		 */

		int n = 1;
		int loop = 0;
		int leftX;
		int leftY;
		int rightX;
		int rightY;
		// boolean bool_left = false;
		// boolean bool_right = false;
		while (n < 6) {

			loop = 0;
			while (loop < n + 1) {

				leftX = (n - loop);
				leftY = (loop - 1);// < 0 ? bool_left = true : bool_left = false;

				rightX = (n - loop - 1);// < 0 ? bool_right = true : bool_right = false;
				rightY = loop;

				if (leftY < 0) {
					board[n - loop][loop] += board[rightX][rightY];
					loop++;
					continue;
				}
				if (rightX < 0) {
					board[n - loop][loop] += board[leftX][leftY];
					loop++;
					continue;
				}

				if (board[leftX][leftY] > board[rightX][rightY]) {
					board[n - loop][loop] += board[leftX][leftY];
				} else {
					board[n - loop][loop] += board[rightX][rightY];
				}
				loop++;
			}
			n++;
		}
		n = 4;
		while (n >= 0) {
			loop = 0;
			while (loop <= n) {
				leftX = 5 - loop;
				leftY = (5 - n + loop - 1);
				rightX = 5 - loop - 1;
				rightY = 5 - n + loop;
				if (board[leftX][leftY] > board[rightX][rightY]) {
					board[5 - loop][5 - n + loop] += board[leftX][leftY];
				} else {
					board[5 - loop][5 - n + loop] += board[rightX][rightY];
				}
				loop++;
			}
			n--;
		}
		return board[5][5];
	}
}
