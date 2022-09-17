/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author My self
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int Fb = Sc.nextInt();
		
		int s1=0,s2=1,s3;
		for(int i=0;i<Fb;++i) {
			s3=s1+s2;
			System.out.print(" "+s3);
			s1=s2;
			s2=s3;

		}
		

	}

}
