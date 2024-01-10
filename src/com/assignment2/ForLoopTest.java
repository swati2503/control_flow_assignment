package com.assignment2;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int factorial=1;
		for(int i=num;i>=2;i--) {
			factorial*=i;
		}
		
		System.out.println(factorial);
	}

}
