package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
			double elapsedTime=0;
			Scanner timer1 = new Scanner(System.in);
			
			System.out.println("Enter  Start Time");
			double startTime = timer1.nextDouble();
			
			System.out.println("Enter End Time");
			double endTime = timer1.nextDouble();
			
			elapsedTime= endTime-startTime;
			System.out.println(elapsedTime);
			
		}

	}
