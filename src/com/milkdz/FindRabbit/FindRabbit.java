package com.milkdz.FindRabbit;

import java.util.Scanner;

public class FindRabbit {
	/**
	 * 
	 *       1 --> 2 -> 3--> ....
	 *       ^           
	 *       |           
	 *       20<--19<-- ... 
	 * 
	 *       before start to find ,
	 *       all value = 0;
	 *       if each index is find,set value = 1;
	 *       final find where the value = 0 and it is the answer
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while (sca.hasNext()) {
			int x = sca.nextInt();
			int start = x - 1;
			int n = sca.nextInt();
			int[] a = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			int judge = 0;
			int mod = 0;
			for (int i = 1; i <= n; i++) {
				if (judge == 20) {
					System.out.println("-1");
					break;
				}
				mod = (start - 1 + (i + 1) * i / 2) % 20;
				if (a[mod] == 0) {
					a[mod] = 1;
					judge++;
				}
			}

			for (int i = 0; i < 20; i++) {
				int b = i;
				if (a[i] == 0) {
					System.out.print((b + 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
