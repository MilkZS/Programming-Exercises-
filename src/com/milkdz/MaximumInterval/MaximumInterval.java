package com.milkdz.MaximumInterval;

public class MaximumInterval {

	/**
	 * **********************************************
	 *                                              *
	 * increasing array                             *
	 * --------------->                             *
	 *  0      1      2      3      4      5        *
	 *  -      -      -                             *
	 * pre    now    next                           *
	 *                                              *
	 *                                              *
	 *         start from index = i                 *
	 *         end with index = n-1                 *
	 *                                              *
	 * ------------------->                         *
	 *   0      1      2      3      4      5       *
	 *          -      -      -             -       *
	 *          --------      ---------------       *
	 *           d_max              d_min           *
	 *                                              *
	 *                                              *
	 * ***********************************************              
	 */ 

	/**
	 * Find the maximum interval
	 * 
	 * @param arr
	 *            input a increasing array
	 * @param n
	 *            the length of the input array
	 * @return the maximum interval
	 */
	public int getMaxTnterval(int[] arr, int n) {
		int d_min = Integer.MAX_VALUE;
		int pre = arr[0];
		int now = arr[1];
		int d_max = now - pre;
		int next = 0;
		for (int i = 1; i < n - 1; i++) {
			next = arr[i + 1];
			d_max = (d_max > (next - now)) ? d_max : (next - now);
			d_min = d_min < (next - pre) ? d_min : (next - pre);
			pre = now;
			now = next;
		}
		d_max = d_max > d_min ? d_max : d_min;
		return d_max;
	}
}
