/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author My self
 *
 */
public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			int r=0,rm;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int num = sc.nextInt();
			
			while(num!=0)
			{
				rm =num%10;
				r=r*10+rm;
				num=num/10;
				
				
			}
			System.out.println("Reverse number is :"+r);

		}

	}
