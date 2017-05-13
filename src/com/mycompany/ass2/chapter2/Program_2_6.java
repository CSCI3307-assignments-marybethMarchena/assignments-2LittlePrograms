/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author MaryBeth
 *
 */

public class Program_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create Scanner to get input
		Scanner input = new Scanner(System.in);
		
		//ints to hold vals and result
		int x, y, z, result;
		
		//first int
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		//second int
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		//third int
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		//calc
		result = x*y*z;
		
		//output
		System.out.printf("Product is %d%n" , result);

	}

}
