package com.milkdz.Rotate;

public class Rotate {
	
	/**
	 * ******************************************
	 * input matrix
	 * -------------------------
	 * -
	 * -  0   1   2   3   4
	 * -  5   6   7   8   9
	 * -  10  11  12  13  14
	 * -  15  16  17  18  19
	 * -  20  21  22  23  24
	 * -
	 * -----------------------
	 * 
	 * 
	 * (i,j) --> (j,n-i-1)
	 * (n-j-1,i) --> (i,j)
	 * (n-i-1,n-j-1) --> (n-j-1,i)
	 * (j,n-i-1) --> (n-i-1,n-j-1)
	 * 
	 * 
	 * output
	 * -----------------------
	 *    20  15  10   5   0
	 *    21  16  11   6   1
	 *    22  17  12   7   2
	 *    23  18  13   8   3
	 *    24  19  14   9   4
	 * -----------------------
	 * 
	 * 
	 */
	
	/**
	 * Turning the matrix 90 degree
	 * 
	 * @param mat the matrix input
	 * @param n the Matrix order
	 * @return the matrix after turning 
	 */
	public int[][] rotateMatrix(int[][] mat, int n) {
	        // write code here
	        if(n == 1){
	            return mat;
	        }
	        
	        int lenx = (n%2 == 0) ? n/2 : (n/2) + 1;
	        int leny = n - lenx;
	        
	        for(int i=0;i<lenx;i++){
	            for(int j=0;j<leny;j++){
	                int temp = mat[i][j];
	                mat[i][j] = mat[n-j-1][i];
	                mat[n-j-1][i] = mat[n-i-1][n-j-1];
	                mat[n-i-1][n-j-1] = mat[j][n-i-1];
	                mat[j][n-i-1] = temp;
	            }
	        }
	       return mat;
	    }
}
