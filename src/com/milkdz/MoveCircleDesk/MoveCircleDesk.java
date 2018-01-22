package com.milkdz.MoveCircleDesk;

public class MoveCircleDesk {

	/**
	 * (x,y) ---> (x1,y1) 
	 * 
	 * the line distance is the less length.
	 *
	 * (x,y)            (x1,y1)
	 *    ._______________.
	 *    -  -  -  -  -  -
	 *    ----
	 *      r      
	 */
	
	/**
	 * get the min count of moving circle desk.
	 * 
	 * @param a
	 *            an array with five numbers
	 * @return the count
	 */
	public long getCount(int[] a) {
		int r = a[0];
		int x = a[1];
		int y = a[2];
		int x1 = a[3];
		int y1 = a[4];

		double d_x = Math.pow((x - x1), 2);
		double d_y = Math.pow((y - y1), 2);
		double d = d_x + d_y;
		d = Math.sqrt(d);

		long n = (long) d / (2 * r);
		return n;
	}
}
