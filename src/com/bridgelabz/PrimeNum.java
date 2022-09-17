/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author My self
 *
 */
public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count =0;
		
		System.out.println(" Check Prime Number or Not:");
		int num1 =input.nextInt();
		for(int i=2;i<num1;i++) {
			if(num1%2==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
