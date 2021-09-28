package com.hybrid.javaExamples;

import java.util.Scanner;

public class ConstructorExample {
	public static void main(String[] args) {
		ABC obj1 = new ABC();
		
		int loop=0;
		while(true)
		{
			System.out.println("Loop value"+loop);
			if (loop==1)
			{
				break;
			}
			loop++;
			System.out.println("Incremented loop value:  "+loop);
			System.out.println("Hi value incremeted!");
		}
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		float value=input.nextFloat();
		System.out.println("Name Entered is :"+ value);
	}
}

class ABC {
	public ABC() {
		int i=10;
		System.out.println("Constructor example " + i);
	}
}