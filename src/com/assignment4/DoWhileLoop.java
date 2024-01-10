package com.assignment4;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		do {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}while(n-->0);

	}

}
